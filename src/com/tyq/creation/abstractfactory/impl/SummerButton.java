package com.tyq.creation.abstractfactory.impl;

import com.tyq.creation.abstractfactory.Button;

public class SummerButton implements Button {

    @Override
    public void display() {
        System.out.println("显示浅蓝色按钮。");
    }
}
