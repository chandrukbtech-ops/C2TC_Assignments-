package com.yourname.assignment.utilities;

import com.chan.assignment.employees.Employee;
import com.chan.assignment.employees.Manager;
import com.chan.assignment.employees.Developer;

/**
 * Utility class for Employee-related operations.
 */
public class EmployeeUtilities {

    /** Prints details of the given employee. */
    public static void printEmployeeDetails(Employee emp) {
        System.out.println("Name: " + emp.getName());
        System.out.println("ID: " + emp.getEmployeeId());
        System.out.println("Salary: " + emp.getSalary());
        if (emp instanceof Manager) {
            Manager m = (Manager) emp;
            System.out.println("Department: " + m.getDepartment());
        } else if (emp instanceof Developer) {
            Developer d = (Developer) emp;
            System.out.println("Programming Language: " + d.getProgrammingLanguage());
        }
        System.out.println("------------");
    }

    /** Updates the salary of the given employee. */
    public static void updateSalary(Employee emp, double newSalary) {
        emp.setSalary(newSalary);
    }
}
