package com.tyq.creation.abstractfactory.impl;

import com.tyq.creation.abstractfactory.TextField;

public class SpringTextField implements TextField {

    @Override
    public void display() {
        System.out.println("显示绿色边框文本框。");
    }
}
