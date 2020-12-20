package com.tyq.action.command;

public class MinimizeCommand extends Command{
    private WindowHandler whObj = new WindowHandler();

    public void execute() {
        whObj.minimize();
    }
}
