package org.lesson7.ex9;

public class Pesel {
    public static boolean isPeselCorrect(Object pesel) throws IllegalAccessException {
        if (!(pesel instanceof String)) {
            throw new WrongThreadException("Pesel should be a proper String !");
        }
        if (String.valueOf(pesel).length() != 11) {
            throw new IllegalAccessException("Pesel should be a 11 characters") {
            };

        }
        return true;
    }
}




