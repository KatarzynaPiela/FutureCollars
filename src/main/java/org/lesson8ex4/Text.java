package org.lesson8ex4;

public class Text {
    static int getTextLength(String text) {
        if (text == null || text.isBlank()) {
            return 0;
        }
        return text.length();
    }
}
