package com.tyq.action.strategy;

public class StudentDiscount implements  Discount {
    @Override
    public double calculate(double price) {
        System.out.printf("儿童票");
        return price - 10;
    }
}
