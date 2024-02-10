package org.lesson6.ex4;

import java.math.BigDecimal;

public class Employee {

    public Employee(String name, int i, BigDecimal baseSalary, BigDecimal bonus, int surname) {
        this.name = name;
        this.surname = surname;
    }

    public Employee(String name, int surname, String age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public Employee(String name, int surname, String age, BigDecimal value) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.baseSalary = value;
    }

    public Employee(String name, int surname, String age, BigDecimal value1, BigDecimal value2) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.baseSalary = value1;
        this.bonus = value2;

    }

    private final String name;
    private final int surname;
    private String age;

    public String getEmployee_Info() {
        return "Employee name : " + name + " " + surname;
    }

    public String getEmployeeDetails() {
        return "Employee details : " + name + WHITE_SPACE + surname + " is " + age;
    }

    public static final String WHITE_SPACE = " ";

    // Method is used to get total  salary
    public BigDecimal getSalary_1() {
        return baseSalary.add(bonus);
    }

    public BigDecimal getSalary_2() {
        return baseSalary;
    }

    public BigDecimal get_B() {
        return bonus;
    }

    private BigDecimal baseSalary;
    private BigDecimal bonus;

    public String getemployee_Info() {

        return null;
    }
}