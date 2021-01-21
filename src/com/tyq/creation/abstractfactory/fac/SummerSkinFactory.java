package com.tyq.creation.abstractfactory.fac;

import com.tyq.creation.abstractfactory.Button;
import com.tyq.creation.abstractfactory.ComboBox;
import com.tyq.creation.abstractfactory.SkinFactory;
import com.tyq.creation.abstractfactory.TextField;
import com.tyq.creation.abstractfactory.impl.SummerButton;
import com.tyq.creation.abstractfactory.impl.SummerComboBox;
import com.tyq.creation.abstractfactory.impl.SummerTextField;

public class SummerSkinFactory implements SkinFactory {
    @Override
    public Button createButton() {
        return new SummerButton();
    }

    @Override
    public TextField createTextField() {
        return new SummerTextField();
    }

    @Override
    public ComboBox createComboBox() {
        return new SummerComboBox();
    }
}
