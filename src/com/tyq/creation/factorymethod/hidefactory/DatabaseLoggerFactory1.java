package com.tyq.creation.factorymethod.hidefactory;

import com.tyq.creation.factorymethod.DatabaseLogger;
import com.tyq.creation.factorymethod.Logger;
import com.tyq.creation.factorymethod.LoggerFactory;

public class DatabaseLoggerFactory1 extends LoggerFactory1 {
    @Override
    public Logger createLogger() {
        Logger logger = new DatabaseLogger();
        //初始化数据库日志记录器，代码省略
        return logger;
    }
}
