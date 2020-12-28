package com.tyq.creation.factorymethod;

import sun.rmi.runtime.Log;

public class DatabaseLogger implements Logger {
    @Override
    public void writeLog() {
        System.out.println("数据库日志记录。");
    }
}
