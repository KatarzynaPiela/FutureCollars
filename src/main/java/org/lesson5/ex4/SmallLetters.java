package org.lesson5.ex4;

public class SmallLetters implements TextFormatter {
    public SmallLetters() {

    }

    @Override
    public String formatText(String tex) {
        String text = new String();
        return text.toLowerCase();

    }
}
