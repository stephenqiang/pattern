package com.tyq.creation.factorymethod.hidefactory;

import com.tyq.creation.factorymethod.Logger;

public abstract class LoggerFactory1 {
    public void writeLog() {
        Logger logger = this.createLogger();
        logger.writeLog();

    }

    public abstract Logger createLogger();

}
