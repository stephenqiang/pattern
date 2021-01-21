package com.tyq.structure.bridge;

import java.util.List;

public class BarCart extends Display {
    public BarCart(DataPicker dp) {
        super(dp);
    }

    @Override
    public void render() {
        List<Object> datas = dp.parseData();
        System.out.println("显示柱状图："+datas.toString());
    }
}
