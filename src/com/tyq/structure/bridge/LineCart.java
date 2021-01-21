package com.tyq.structure.bridge;

import java.util.List;

public class LineCart extends Display {

    public LineCart(DataPicker dp) {
        super(dp);
    }

    @Override
    public void render() {
        List<Object> datas = dp.parseData();
        System.out.println("显示现状图：" + datas.toString());
    }
}
