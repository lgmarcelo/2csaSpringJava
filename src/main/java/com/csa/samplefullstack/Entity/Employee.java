package com.csa.samplefullstack.Entity;

import javax.persistence.*;

@Entity
@Table(name="tbl_employee")

public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long employeeID;
    private String name;
    private String department;
    private String location;

    public Employee(long employeeID, String name, String department, String location) {
        this.employeeID = employeeID;
        this.name = name;
        this.department = department;
        this.location = location;
    }

    public Employee(){

    }

    public long getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(long employeeID) {
        this.employeeID = employeeID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
