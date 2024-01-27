package org.lesson5.ex1;

public abstract class Message {
    protected String message;

    public Message(String message) {
        this.message = message;
    }

    public abstract String getMessage();

}
