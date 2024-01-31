package org.lesson5ex7;

public class Day {

    private static String text = "Is day:";
    private static String result;

    static  String day(Days day) {
        if (day.equals(Days.MONDAY)) {
            return "MONDAY";
        } else if (day.equals(Days.TUESDAY)) {
            return "TUESDAY";
        } else if (day.equals(Days.WEDNESDAY)) {
            return "WEDNEDAY";
        } else if (day.equals(Days.THURSDAY)) {
            return "THURSDAY";
        } else if (day.equals(Days.FRIDAY)) {
           return "FRIDAY";
        } else if (day.equals(Days.SATURDAY)) {
            return "SATURDAY";
        } else if (day.equals(Days.SUNDAY)) {
            return "SUNDAY";
        }
        return result;

    }
}
