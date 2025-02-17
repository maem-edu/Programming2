package crit_thinking_1;

import java.util.Scanner;

public class Employee {
    String firstName;
    String lastName;
    int employeeID;
    double salary;

    //default constructor
    public Employee () {
        firstName = ("None");
        lastName = ("None");
        employeeID = 0;
        salary = 0.0;
    }

    //setters and getters
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName (Scanner scnr) {
        System.out.println ("Enter employee first name");
        this.firstName = scnr.nextLine();
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(Scanner scnr) {
        System.out.println ("Enter employee last name");
        this.lastName = scnr.nextLine();
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(Scanner scnr) {
        System.out.println ("Enter employee ID");
        this.employeeID = scnr.nextInt();
        scnr.nextLine(); //consume newline
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(Scanner scnr) {
        System.out.println ("Enter employee salary");
        this.salary = scnr.nextDouble();
        scnr.nextLine(); //consume newline
    }

    public void employeeSummary () {
        System.out.println("Employee Summary");
        System.out.println("First name: " + getFirstName());
        System.out.println("Last name: " + getLastName());
        System.out.println("Employee ID: " + getEmployeeID());
        System.out.println("Salary: " + getSalary());
    }
}
