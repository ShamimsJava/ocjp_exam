package com.shamim.question124;

class Employee{
    String name;
    double baseSalary;

    public Employee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }
}

public class SalesPerson extends Employee{
    double commission;
    public SalesPerson(String name, double baseSalary, double commission){
        super(name, baseSalary);
        this.commission = commission;
    }
}
