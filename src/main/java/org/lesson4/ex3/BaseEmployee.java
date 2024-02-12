package org.lesson4.ex3;

public class BaseEmployee {
    public boolean introduce;
    String name;
    String surname;
    int yearOfEmployment;
    int bonus;
    private final int baseSalary;
    public BaseEmployee(int baseSalary){
        this.baseSalary = baseSalary;}
    int calculateMonthlySalary(){
        return  baseSalary + bonus;
    }
    int getSeniority(){
        return 2000 - yearOfEmployment;
    }
    String introduce(){
        return name + " " + surname + "Base salary: " +baseSalary + "Seniority:" + getSeniority() + "years" + "Total monthly salary:"
                + calculateMonthlySalary() + "pln";
    }
}
