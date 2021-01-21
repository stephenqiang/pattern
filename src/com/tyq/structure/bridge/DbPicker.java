package com.tyq.structure.bridge;

import java.util.ArrayList;
import java.util.List;

public class DbPicker implements DataPicker{

    @Override
    public List<Object> parseData() {
        List<Object> datas = new ArrayList<>();
        datas.add("db aa");
        datas.add("db bb");
        datas.add("db cc");
        System.out.println("db数据");
        return datas;
    }
}
