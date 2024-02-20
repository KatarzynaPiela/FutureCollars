package org.lesson4.ex3;

public class Manager extends BaseEmployee {
    private final int bonus;
    private static final int DEFAULT_SALARY = 5000;
    private static final int DEFAULT_BONUS = 500;

    public Manager(int baseSalary, int bonus, int yearOfEmployment, String surname, String name) {
        super(baseSalary, yearOfEmployment, surname, name);
        this.bonus = bonus;
    }

    public Manager(String name, String surname, int yearOfEmployment, int baseSalary) {
        super(baseSalary, yearOfEmployment, surname, name);
        this.bonus = DEFAULT_BONUS;
    }

    public Manager(String name, String surname, int yearOfEmployment) {
        super(DEFAULT_SALARY, yearOfEmployment, surname, name);
        this.bonus = DEFAULT_BONUS;

    }

    int calculateMonthlySalary() {
        return super.calculateMonthlySalary() + bonus;

    }
}
