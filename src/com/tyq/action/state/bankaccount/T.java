package com.tyq.action.state.bankaccount;

public class T {
    public static void main(String[] args) {
        //在环境类中作统一的判断说明状态的转换逻辑是一致的，比如举例中的账户，
        // 状态变化标准对每种状态都是一样的；分别在每一种具体状态中作转换判断，
        // 适合于一些状态变化条件因状态不同而不同的情况，
        Account acc = new Account("段誉",0.0);
        acc.deposit(1000);
        acc.withdraw(2000);
        acc.deposit(3000);
        acc.withdraw(4000);
        acc.withdraw(1000);
        acc.computeInterest();

    }
}
