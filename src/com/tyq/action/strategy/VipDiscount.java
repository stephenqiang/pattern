package com.tyq.action.strategy;

public class VipDiscount implements Discount {

    @Override
    public double calculate(double price) {
        System.out.println("vip票：");
        System.out.println("增加积分");
        return price * 0.5;
    }
}
