package org.lesson5ex7;

public class Day {
    public static Object Monday;
    public static Object Tuesday;
    public static Object Wednesday;
    public static Object Thursday;
    public static Object Friday;
    public static Object Saturday;
    public static Object Sunday;
    private static String text = "Is day:";
    private static String result;

    static <Days> String day(Days day) {
        if (day.equals(Monday)) {
            result = text + Day.Monday;
        } else if (day.equals(Tuesday)) {
            result = text + Day.Tuesday;
        } else if (day.equals(Wednesday)) {
            result = text + Day.Wednesday;
        } else if (day.equals(Thursday)) {
            result = text + Day.Thursday;
        } else if (day.equals(Friday)) {
            result = text + Day.Friday;
        } else if (day.equals(Saturday)) {
            result = text + Day.Saturday;
        } else if (day.equals(Sunday)) {
            result = text + Day.Sunday;
        }
        return result;

    }
}
