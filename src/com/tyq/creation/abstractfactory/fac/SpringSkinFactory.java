package com.tyq.creation.abstractfactory.fac;

import com.tyq.creation.abstractfactory.Button;
import com.tyq.creation.abstractfactory.ComboBox;
import com.tyq.creation.abstractfactory.SkinFactory;
import com.tyq.creation.abstractfactory.TextField;
import com.tyq.creation.abstractfactory.impl.SpringButton;
import com.tyq.creation.abstractfactory.impl.SpringComboBox;
import com.tyq.creation.abstractfactory.impl.SpringTextField;

public class SpringSkinFactory implements SkinFactory {
    @Override
    public Button createButton() {
        return new SpringButton();
    }

    @Override
    public TextField createTextField() {
        return new SpringTextField();
    }

    @Override
    public ComboBox createComboBox() {
        return new SpringComboBox();
    }
}
