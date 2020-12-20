package com.tyq.action.command;

public class HelpCommand extends Command{

    private HelpHandler hhObj = new HelpHandler();

    @Override
    public void execute() {
        hhObj.display();
    }
}
