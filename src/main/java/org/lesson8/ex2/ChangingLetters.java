package org.lesson8.ex2;

public class ChangingLetters {
    public static boolean isTextContainingBigLetter(String text) {
        if(text == null){
            return false;
        }
        return text.contains("A") || text.contains("a");
    }
}
