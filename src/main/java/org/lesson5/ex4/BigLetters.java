package org.lesson5.ex4;

public class BigLetters implements TextFormatter {
    public BigLetters() {
    }
    @Override
    public String formatText(String text) {
        return text.toUpperCase();
    }
}
