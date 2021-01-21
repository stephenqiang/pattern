package com.tyq.creation.abstractfactory;

import com.tyq.creation.abstractfactory.fac.SpringSkinFactory;

public class T {
    public static void main(String[] args) {
        SkinFactory factory;
        Button bt;
        TextField tf;
        ComboBox cb;
        factory = new SpringSkinFactory();// 配置文件加载
        bt = factory.createButton();
        tf = factory.createTextField();
        cb = factory.createComboBox();
        bt.display();
        tf.display();
        cb.display();

    }
}
