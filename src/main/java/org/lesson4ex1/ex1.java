package org.lesson4ex1;

public class ex1 {

    public static void main(String[] args) {
        seat[1].busySeat(true);
        seat[2].busySeat(true);
        seat[3].busySeat(true);
        seat[4].busySeat(false);

        for (CinemaHall seats : seat) {
            System.out.println(seats + "is Free" + seats.isFree());
        }
    }

    private static final CinemaHall[] seat = {
            new CinemaHall(5, "V"),
            new CinemaHall(6, "VI"),
            new CinemaHall(7, "VII"),

    };

}
