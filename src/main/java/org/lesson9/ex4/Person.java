package org.lesson9.ex4;

public class Person implements Comparable<Person> {
    private final String name;
    private final String surname;
    private final int yearOfBirth;
    private final int height;
    private final int weight;

    public Person(String name, String surname, String yearOfBirth, String height, String weight) {
        this.name = name;
        this.surname = surname;
        this.yearOfBirth = Integer.parseInt(yearOfBirth);
        this.height = Integer.parseInt(height);
        this.weight = Integer.parseInt(weight);

    }

    @Override
    public int compareTo(Person o) {
        return Integer.compare(this.yearOfBirth, o.yearOfBirth);
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }
}

