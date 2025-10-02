package com.chan.assignment.employees;

public class Manager extends Employee {
    private String department;

    public Manager(String name, int employeeId, double salary, String department) {
        super(name, employeeId, salary);
        this.department = department;
    }

    /** Returns the department of the manager. */
    public String getDepartment() {
        return department;
    }

    /** Sets the department of the manager. */
    public void setDepartment(String department) {
        this.department = department;
    }
}