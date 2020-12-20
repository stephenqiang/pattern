package com.tyq.action.command.revert;

public class T {
    public static void main(String[] args) {

        CalculatorForm form = new CalculatorForm();
        AbstractCommand command = new ConcreteCommand();
        form.setCommand(command);

        form.compute(10);
        form.compute(5);
        form.compute(10);
        //TODO: 多步撤销
        form.undo();

    }
}
