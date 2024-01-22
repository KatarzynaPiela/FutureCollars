package org.lesson4ex1;

public class CinemaHall {

    private final int seatNumber;
    private final String rowNumber;
    private boolean isFree = true;

    public CinemaHall(int seatNumber, String rowNumber) {
        this.seatNumber = seatNumber;
        this.rowNumber = rowNumber;
    }

    public void busySeat(boolean isBusy) {
        this.isFree = !(isBusy);
    }

    public boolean isFree() {
        return this.isFree;
    }

    @Override
    public String toString() {
        return "seat: {" + this.seatNumber + "-" + this.rowNumber + '}';

    }
}
