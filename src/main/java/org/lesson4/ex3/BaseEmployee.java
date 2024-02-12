package org.lesson4.ex3;

abstract class BaseEmployee {
    private name;
    private surname;
    private salary;
    private yearOfEmployment;

    public BaseEmployee(String name, String surname, String salary, String yearOfEmployment) {
        this.name = name;
        this.surname = surname;
        this.salary = salary;
        this.yearOfEmployer = yearOfEmployment;
    }
    protected String introduceEmployee(){
        return " My name is: " + name + " " + surname + " " + salaty;
    }
    protected yearOfEmployment getYearOfEmployment(){
        return getYearOfEmployment;
    }

}
