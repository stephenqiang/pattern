package com.tyq.action.state.sharestatus;

public class T {
    public static void main(String[] args) {
        //多个环境对象可能需要共享同一个状态，如果希望在系统中实现多个环境对象共享一个或多个状态对象，那么需要将这些状态对象定义为环境类的静态成员对象
        Switch s1, s2;
        s1 = new Switch("开关11");
        s2 = new Switch("开关22");

        s1.on();
        s2.on();
        s1.off();
        s2.off();
        s2.on();
        s1.on();

    }
}
