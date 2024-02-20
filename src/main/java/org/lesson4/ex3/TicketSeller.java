package org.lesson4.ex3;

public class TicketSeller extends BaseEmployee {

    public TicketSeller(String name, String surname, int yearOfEmployment, int baseSalary) {
        super(baseSalary, yearOfEmployment, surname, name);
    }

    public TicketSeller(String name, String surname, int yearOfEmployment) {
        super(yearOfEmployment, surname, name);

    }
}

