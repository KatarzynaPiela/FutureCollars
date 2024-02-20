package org.lesson4.ex3;

import java.time.LocalDate;

public class BaseEmployee {

    private static final int DEFAULT_SALARY = 3000;

    private final String name;
    private final String surname;
    private final int yearOfEmployment;

    private final int baseSalary;

    public BaseEmployee(int baseSalary, int yearOfEmployment, String surname, String name) {
        this.baseSalary = baseSalary;
        this.yearOfEmployment = yearOfEmployment;
        this.surname = surname;
        this.name = name;
    }

    public BaseEmployee(int yearOfEmployment, String surname, String name) {
        this(DEFAULT_SALARY, yearOfEmployment, surname, name);

    }

    int calculateMonthlySalary() {
        return baseSalary;
    }

    int getSeniority() {
        return LocalDate.now().getYear() - yearOfEmployment;

    }


}

