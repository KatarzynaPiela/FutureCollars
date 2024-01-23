package org.lesson4ex2;

public class MinutesAndSeconds {
    private static int minutes;

    public MinutesAndSeconds(int i) {
    }

    static int getMinutes(int minutes) {
        return minutes > 0 ? minutes * 60 : 2;

    }
}
