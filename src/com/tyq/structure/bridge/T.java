package com.tyq.structure.bridge;

public class T {
    public static void main(String[] args) {
        DataPicker dp = new ExcelPicker();
        Display show = new LineCart(dp);
        show.render();
    }
}
