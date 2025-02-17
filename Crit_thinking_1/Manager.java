package crit_thinking_1;

import java.util.Scanner;


public class Manager extends Employee {
    String department;

    public Manager() {
        super();
        department = "a";
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(Scanner scnr) {
        System.out.println("Enter department");
        this.department = scnr.nextLine();
    }

    @Override
    public void employeeSummary() {
        super.employeeSummary();
        System.out.println("Department: " + getDepartment());
    }
}