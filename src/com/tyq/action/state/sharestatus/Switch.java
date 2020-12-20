package com.tyq.action.state.sharestatus;

public class Switch {
    private static State state, onState, offState;
    private String name;

    public Switch(String name) {
        this.name = name;
        onState = new OnState();
        offState = new OffState();
        this.state = onState;
    }

    public void setState(State state) {
        this.state = state;
    }

    public static State getState(String type) {
        if (type.equalsIgnoreCase("on")) {
            return onState;
        }
        return offState;
    }

    public void on() {
        System.out.printf(name);
        state.on(this);
    }

    public void off() {
        System.out.println(name);
        state.off(this);
    }

}
