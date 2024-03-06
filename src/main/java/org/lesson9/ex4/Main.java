package org.lesson9.ex4;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        Set<Person> persons = new TreeSet<>();
        persons.add(new Person("Katarzyna", "Piela", "1988", "165", "60"));
        persons.add(new Person("Nikola", "Sawicka", "2010", "160", "65"));
        persons.add(new Person("Adam", "Kowlaski", "1977", "177", "77"));

        Comparator<Person> heightComparator = Comparator.comparingInt(Person::getHeight);
        Comparator<Person> weightComparator = Comparator.comparingInt(Person::getWeight);
        Set<Person> personHeight = new TreeSet<>(heightComparator);
        personHeight.addAll(persons);

        System.out.println("people from the lowest to the highest");
        for (Person person : personHeight) {
            System.out.println(person.getName() + "" + person.getSurname() + "" + person.getYearOfBirth() + "" + person.getHeight() + "" + person.getWeight());

        }
        System.out.println("people from the heaviest to the lightest");
        for (Person person : persons) {
            System.out.println(person.getName() + "" + person.getSurname() + "" + person.getYearOfBirth() + "" + person.getHeight() + "" + person.getWeight());

            System.out.println("people from the youngest to the oldest");
            for (Person person1 : persons) {
                System.out.println(person.getName() + "" + person.getSurname() + "" + person.getYearOfBirth() + "" + person.getHeight() + "" + person.getWeight());

            }
        }

    }
}
