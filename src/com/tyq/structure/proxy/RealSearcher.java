package com.tyq.structure.proxy;

public class RealSearcher implements Searcher {
    @Override
    public String doSearch(String userId, String keyword) {

        System.out.printf("用户'%s'使用关键词'%s'查询商务信息！",userId,keyword);
        return "返回具体内容";

    }
}
