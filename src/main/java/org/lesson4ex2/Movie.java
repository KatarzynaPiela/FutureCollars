package org.lesson4ex2;

public class Movie {
    private String title;
    private  String directorName;
    private int duration;
    private int yearOfProduction;

    public Movie() {
    }

    public Movie(String title, String directorName,int duration, int yearOfProduction) {
        this.title = title;
        this.directorName = directorName;
        this.duration = duration;
        this.yearOfProduction = yearOfProduction;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public void setDirectorName( String directorName) {
        this.directorName = directorName;

    }
    public void setDuration( int duration){
        this.duration = duration;

    }
    public void setYearOfProduction(int yearOfProduction){
        this.yearOfProduction = yearOfProduction;
    }

    }
