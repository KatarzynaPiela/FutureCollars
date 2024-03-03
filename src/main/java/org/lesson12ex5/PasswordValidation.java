package org.lesson12ex5;

import java.util.regex.Pattern;

public class PasswordValidation {
    private String password;

    public PasswordValidation(String password) {
        this.password = password;
    }

    private Pattern passwordPattern = Pattern.compile("^(?=.*[A-Z])(?=.*\\a)(?!.*.{7,}$(2021|21))." +
            "");

    public boolean isPassword() {
        return passwordPattern.matcher(password).matches();
    }

}
