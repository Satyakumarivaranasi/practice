package people;

public class Person {
    protected String name;

    public Person(String name) {
        this.name = name;
    }

    protected void displayName() {
        System.out.println("Name: " + name);
    }
}
package employees;

import people.Person;

public class Employee extends Person {
    private String employeeId;

    public Employee(String name, String employeeId) {
        super(name);
        this.employeeId = employeeId;
    }

    public void displayEmployeeInfo() {
        // Accessing protected member from the base class
        displayName();
        System.out.println("Employee ID: " + employeeId);
    }
}
package test;

import employees.Employee;

public class Main {
    public static void main(String[] args) {
        Employee emp = new Employee("John Doe", "E12345");
        emp.displayEmployeeInfo();
    }
}
