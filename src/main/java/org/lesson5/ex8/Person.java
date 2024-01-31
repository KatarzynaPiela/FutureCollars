package org.lesson5.ex8;

import java.util.Objects;

public class Person {

    private String name;
    private String surname;
    private String gender;
    private int age;

    public Person(String name, String surname, String gender, int age) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name) && Objects.equals(surname, person.surname) && Objects.equals(gender, person.gender);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, gender, age);
    }

    public static void main(String[] args) {
        Person person1 = new Person("Katarzyna", "Piela", "woman", 25);
        Person person2 = new Person("Adam", "Piela", "men", 35);

        System.out.println((person1.equals(person2)));
        System.out.println(person1.hashCode());
    }

}
