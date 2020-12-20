package com.tyq.action.command;

import com.tyq.utils.XmlUtil;

public class T {
    public static void main(String[] args) {
        //户端只需要将具体命令对象作为参数注入请求发送者，无须直接操作请求的接收者
        FBSettingWindow fbsw = new FBSettingWindow("功能键设置");

        FunctionButton fb1,fb2;
        fb1 = new FunctionButton("功能键1");
        fb2 = new FunctionButton("功能键2");

        Command command1,command2;
        //通过读取配置文件和反射生成具体命令对象
        command1 = (Command) XmlUtil.getBean("src/com/tyq/action/command/config.xml",0);
        command2 = (Command)XmlUtil.getBean("src/com/tyq/action/command/config.xml",1);

        //将命令对象注入功能键
        fb1.setCommand(command1);
        fb2.setCommand(command2);

        fbsw.addFunctionButton(fb1);
        fbsw.addFunctionButton(fb2);
        fbsw.display();

        //调用功能键的业务方法
        fb1.onClick();
        fb2.onClick();

    }
}
