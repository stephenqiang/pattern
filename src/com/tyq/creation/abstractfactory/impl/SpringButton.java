package com.tyq.creation.abstractfactory.impl;

import com.tyq.creation.abstractfactory.Button;

public class SpringButton implements Button {

    @Override
    public void display() {
        System.out.println("显示浅绿色按钮。");
    }
}
