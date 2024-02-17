package org.lesson6.ex5;

public class Engine {
    private boolean isStarted;
    protected void start() {
        if (!isStarted) {
            isStarted = true;
        }
    }
    protected void stop() {
        if (isStarted) {
            isStarted = false;
        }
    }
    public boolean isStarted() {
        return isStarted;
    }

}


