package com.tyq.creation.factorymethod.hidefactory;

public class T {
    public static void main(String[] args) {
        LoggerFactory1 factory;
        //配置文件
        factory = new DatabaseLoggerFactory1();
        factory.writeLog(); //直接使用工厂对象来调用产品对象的业务方法

    }
}
