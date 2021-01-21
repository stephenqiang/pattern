package com.tyq.structure.bridge;

public abstract class Display {
    protected DataPicker dp;

    public Display(DataPicker dp) {
        this.dp = dp;
    }

    public abstract void render();
}
