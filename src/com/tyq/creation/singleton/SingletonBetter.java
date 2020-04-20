package com.tyq.creation.singleton;

public class SingletonBetter {

    private SingletonBetter() {}

    private static class HolderClass{
        private final static SingletonBetter instance = new SingletonBetter();
    }

    public static SingletonBetter getInstance() {
        return HolderClass.instance;
    }
}
