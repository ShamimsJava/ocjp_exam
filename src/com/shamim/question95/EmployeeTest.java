package com.shamim.question95;

class Person{
    String name = "No name";

    public Person(String name) {
        this.name = name;
    }
}

class Employee extends Person{
    String empId = "000";

    public Employee(String name, String empId) {
        super(name);
        this.empId = empId;
    }
}

public class EmployeeTest {
    public static void main(String[] args) {
        //Employee e = new Employee("4321"); // compilation fail
        Employee e = new Employee("Shamim", "000");
        System.out.println(e.empId);
    }
}
