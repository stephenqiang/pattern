package com.tyq.creation;

import com.tyq.creation.prototype.manger.RunApp;

import java.io.IOException;

public abstract class Application {
    protected abstract void run();
    public static void main(String[] args) throws IOException {

        Application app = new RunApp();
        app.run();

    }
}
