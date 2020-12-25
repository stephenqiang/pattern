package com.tyq.structure.proxy;

public class T {
    public static void main(String[] args) {

        Searcher searcher;
        //动态加载
        searcher = new ProxySearcher();
        String result = searcher.doSearch("杨过", "玉女心经");

    }
}
