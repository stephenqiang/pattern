package com.tyq.action.command.queue;

public class Invoker {

    private CommandQueue commandQueue; //维持一个CommandQueue对象的引用

    //构造注入
    public Invoker(CommandQueue commandQueue) {
        this.commandQueue = commandQueue;
    }

    //设值注入
    public void setCommandQueue(CommandQueue commandQueue) {
        this.commandQueue = commandQueue;
    }

    public void call() {
        commandQueue.execute();
    }

}
