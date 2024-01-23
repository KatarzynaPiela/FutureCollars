package org.example;

import org.lesson4ex2.Movie;

public class Main {
    public static void main(String[] args) {
        Movie movie1 = new Movie();

        movie1.setTitle("Pretty Woman");
        movie1.setDirectorName("Jan Kowalski");
        movie1.setDuration(60);
        movie1.setYearOfProduction(2000);

        Movie movie2 = new Movie();

        movie2.setTitle("Nothing Hill");
        movie2.setDirectorName("Alicja Krupa");
        movie2.setDuration(45);
        movie2.setYearOfProduction(2023);

        System.out.println(movie1.toString());
        System.out.println(movie2.toString());

    }


}