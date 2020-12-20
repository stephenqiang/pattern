package com.tyq.action.command.queue;

import com.tyq.action.command.HelpCommand;

public class T {
    public static void main(String[] args) {
        CommandQueue que = new CommandQueue();
        que.addCommand(new HelpCommand());
        que.addCommand(new HelpCommand());
        que.addCommand(new HelpCommand());

        new Invoker(que).call();
    }
}
