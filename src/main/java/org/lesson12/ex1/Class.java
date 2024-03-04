package org.lesson12.ex1;

public class Class {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        System.out.println(phoneBook.getPersonData(new PhoneBook.Person("Katarzyna","Dobrowolska")));

    }
}
