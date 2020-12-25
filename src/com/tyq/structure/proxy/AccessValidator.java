package com.tyq.structure.proxy;

public class AccessValidator {
    public boolean Validate(String userId) {
        System.out.println("在数据库中验证用户'" + userId + "'是否是合法用户？");
        if (userId.equals("杨过")) {
            System.out.printf("'%s'登录成功！", userId);
            return true;
        }
        else {
            System.out.printf("'%s'登录失败！" , userId);
            return false;
        }

    }
}
