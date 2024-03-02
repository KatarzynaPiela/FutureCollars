package org.lesson12.ex2;

import java.util.regex.Pattern;

public class PeselValidation {
    static boolean isPeselValidation(String peselNumber){
        return Pattern.matches("\\d{11}", peselNumber);
    }
}
