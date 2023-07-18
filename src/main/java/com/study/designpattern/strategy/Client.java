package com.study.designpattern.strategy;

public class Client {

    private BannerStrategy strategy;

    public void main(String[] args) {

        // 유저
        User user = new User("user1");

        // 이 구조는 바뀌지 않음... 전략이 수정되도...
        setStrategy(user);

        // 컨텍스트 실행
        Context context = new Context(strategy);
        context.showCutomerBanner();
    }

    private void setStrategy(User user) {
        int rank = getRank(user.getName());
        if(rank==1) {
            strategy = new FirstStrategy();
        }else if(rank==2) {
            strategy = new SecondStrategy();
        }else {
            strategy = new ThirdStrategy();
        }
    }

    private static int getRank(String name) {
        if(name.equals("유혜린")){
            return 1;
        }else if(name.equals("이대진")){
            return 2;
        }else{
            return 3;
        }
    }
}
