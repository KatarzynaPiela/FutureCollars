package org.lesson6.ex5;

public class Car extends Vehicle {
    private final Engine engine;

    public Car(Engine engine) {
        this.engine = engine;
    }
    protected void startEngine() {
        engine.start();
    }
    protected void stopEngine() {
        engine.stop();
    }
    public boolean isEngineStarted() {
        return engine.isStarted();
    }

}