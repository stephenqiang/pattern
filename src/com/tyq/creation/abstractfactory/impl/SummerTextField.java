package com.tyq.creation.abstractfactory.impl;

import com.tyq.creation.abstractfactory.TextField;

public class SummerTextField implements TextField {

    @Override
    public void display() {
        System.out.println("显示蓝色边框文本框。");
    }
}
