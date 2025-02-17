package crit_thinking_1;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        //test employee class
        Employee employee = new Employee();
        System.out.println("Testing Employee class:");
        employee.setFirstName(scnr);
        employee.setLastName(scnr);
        employee.setEmployeeID(scnr);
        employee.setSalary(scnr);
        employee.employeeSummary();
        System.out.println();

        //test manager class
        Manager manager = new Manager();
        System.out.println("Testing Manager class:");
        manager.setFirstName(scnr);
        manager.setLastName(scnr);
        manager.setEmployeeID(scnr);
        manager.setSalary(scnr);
        manager.setDepartment(scnr);
        manager.employeeSummary();

        scnr.close();
    }
}