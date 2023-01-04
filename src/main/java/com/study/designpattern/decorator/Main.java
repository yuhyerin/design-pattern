package com.study.designpattern.decorator;

public class Main {
    /**
     *  [구조]
     *
     * Display - 인터페이스(or 추상클래스)
     *    |
     * Border (데코 - 내부 필드에 Display 타입 지닌다.) / StringDisplayImpl (인터페이스 구현체)
     *    |
     * SideBorder(데코 구현체1), FullBorder(데코 구현체2) ... 추가 가능 ...
     *
     * */
    public static void main(String[] args) {

        Display display1 = new StringDisplayImpl("Hello World");
        display1.show();

        // 양옆에 테두리를 추가하고 싶다...
        Display display2 = new SideBorder(display1); // 양옆테두리 붙이는 클래스로 감싼다.
        display2.show();

        // 상하좌우도 추가하고 싶다...
        Display display3 = new FullBorder(display2); // 상화좌우에 붙이는 클래스로 감싼다.
        display3.show();

        // 데코를 겹겹이 감싸서 여러개를 추가할 수 있음.
        Display display4 =
                new FullBorder(
                  new SideBorder(
                          new FullBorder(
                                  new StringDisplayImpl("I'm Hyerin")
                          )
                  )
                );
        display4.show();

        // 상속으로 기능 확장했으면 여러개 조합하고 싶을때마다 HyerinCustomAndSideBorderAndFullBorder 이런 클래스를 만들어야 했을건데...
        // 조합의 방식으로 다양한 기능을 보다 유연하게 적용할 수 있다.
        Display display5 =
                new FullBorder(
                        new SideBorder(
                                new HyerinCustomBorder(
                                        new StringDisplayImpl("나는 혜린데코. 말끝에 웃음붙임")
                                )
                        )
        );
        display5.show();


    }
}
