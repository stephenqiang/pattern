package com.tyq.action.command.revert;

public class CalculatorForm {
    private AbstractCommand command;

    public void setCommand(AbstractCommand command) {
        this.command = command;
    }

    public void compute(int value) {
        int i = command.execute(value);
        System.out.println("运算，运算结果为：" + i);
    }

    public void undo() {
        int i = command.undo();
        System.out.println("撤销，运算结果：" + i);
    }
}
