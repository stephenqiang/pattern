package com.tyq.structure.proxy;

public class Logger {
    public void log(String userId) {
        System.out.printf("更新数据库，用户'%s'查询次数加1！" , userId);
    }
}
