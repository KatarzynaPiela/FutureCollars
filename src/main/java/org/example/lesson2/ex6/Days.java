package org.example.lesson2.ex6;

public class Days {
    public static void main(String[] args) {
        System.out.println(dayOfWeek(7));

    }

    static String dayOfWeek(int dayNumber) {
        String day;

        switch (dayNumber) {
            case 1:
                day = "Monday";
                break;
            case 2:
                day = "Tuesday";
                break;
            case 3:
                day = "Wednesday";
                break;
            case 4:
                day = "Thursday";
                break;
            case 5:
                day = "Friday";
                break;
            case 6:
            case 7:
                day = "Weekend";
                break;
            default:
                day = "There is no such a day!";
        }
        return day;

    }

}
