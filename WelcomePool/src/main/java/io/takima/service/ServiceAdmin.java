package io.takima.service;

import io.takima.ProjectMOTM.Employee;

import java.util.Date;

public class ServiceAdmin {

    public Employee getEmployee() {
        return new Employee("Jackie", "jackie@jackie.com", new Date(1994,10,14));
    }

}
