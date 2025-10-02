package com.chan.assignment.employees;

public class Employee {
    private String name;
    private int employeeId;
    private double salary;

    public Employee() {}

    public Employee(String name, int employeeId, double salary) {
        this.name = name;
        this.employeeId = employeeId;
        this.salary = salary;
    }

    /** Returns the employee's name. */
    public String getName() {
        return name;
    }

    /** Sets the employee's name. */
    public void setName(String name) {
        this.name = name;
    }

    /** Returns the employee ID. */
    public int getEmployeeId() {
        return employeeId;
    }

    /** Sets the employee ID. */
    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    /** Returns the employee salary. */
    public double getSalary() {
        return salary;
    }

    /** Sets the employee salary. */
    public void setSalary(double salary) {
        this.salary = salary;
    }
}
