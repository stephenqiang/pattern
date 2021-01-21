package com.tyq.structure.bridge;

import java.util.List;

public class ExcelPicker extends ExcelApi implements DataPicker {

    @Override
    public List<Object> parseData() {
        System.out.println("excel数据");
        return this.readData();
    }
}
