package com.chan.assignment.employees;


/**
 * Represents a Developer, which is a type of Employee.
 */
public class Developer extends Employee {
    private String programmingLanguage;

    public Developer(String name, int employeeId, double salary, String programmingLanguage) {
        super(name, employeeId, salary);
        this.programmingLanguage = programmingLanguage;
    }

    /** Returns the programming language of the developer. */
    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    /** Sets the programming language of the developer. */
    public void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }
}

