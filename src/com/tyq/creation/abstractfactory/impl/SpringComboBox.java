package com.tyq.creation.abstractfactory.impl;

import com.tyq.creation.abstractfactory.ComboBox;

public class SpringComboBox implements ComboBox {

    @Override
    public void display() {
        System.out.println("显示绿色边框组合框。");
    }
}
