package com.tyq.creation.singleton;

public class SingletonLazy {
    public volatile static SingletonLazy instance = null;

    private SingletonLazy() {
    }

    public static SingletonLazy getInstance() {
        if (instance == null) {
            //锁定代码块
            synchronized (SingletonLazy.class) {
                //第二次判断
                if (instance == null) {
                    instance = new SingletonLazy();
                }
            }
        }
        return instance;
    }
}
