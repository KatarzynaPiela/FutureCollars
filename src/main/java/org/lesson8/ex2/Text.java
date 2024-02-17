package org.lesson8.ex2;

public class Text {
    static String textToUpperCase(String text){
        if(text == null || text.isBlank()){
            throw new IllegalArgumentException("argument is null");
        } else {
            return text.toUpperCase();
        }
    }
}
