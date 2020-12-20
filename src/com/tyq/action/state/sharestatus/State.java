package com.tyq.action.state.sharestatus;

abstract class State {
    public abstract void on(Switch s);
    public abstract void off(Switch s);
}
