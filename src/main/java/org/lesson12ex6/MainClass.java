package org.lesson12ex6;

import java.time.LocalDate;

public class MainClass {
    static String birthday = "1999-02-11";
    public static void main(String[]args){
        DateOfBirth date = new DateOfBirth(LocalDate.parse(birthday));
        System.out.println(date.getAge());
        System.out.println(date.getBornDay());
        System.out.println(date.getWeekOfYear());
    }
}
