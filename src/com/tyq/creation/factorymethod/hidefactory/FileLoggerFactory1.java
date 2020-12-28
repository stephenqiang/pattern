package com.tyq.creation.factorymethod.hidefactory;

import com.tyq.creation.factorymethod.FileLogger;
import com.tyq.creation.factorymethod.Logger;
import com.tyq.creation.factorymethod.LoggerFactory;

public class FileLoggerFactory1 extends LoggerFactory1 {
    @Override
    public Logger createLogger() {
        //创建文件日志记录器对象
        Logger logger = new FileLogger();
        //创建文件，代码省略
        return logger;
    }
}
