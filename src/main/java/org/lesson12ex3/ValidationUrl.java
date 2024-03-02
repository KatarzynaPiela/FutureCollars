package org.lesson12ex3;

import java.util.regex.Pattern;

public class ValidationUrl {
    private static String correct = "^(http|http)(://)(www\\.)?[a-zA-Z.]{2,256}\\.[a-z]{2,6}";
    static boolean isUrlCorrect(String url){
        return Pattern.matches(correct, url);
    }
}
