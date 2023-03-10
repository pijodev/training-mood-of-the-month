package io.takima.service;

import io.takima.dao.models.Employee;
import io.takima.dao.EmployeeDAO;

import java.time.LocalDate;
import java.util.ArrayList;

public class EmployeeService {
    EmployeeDAO employeeDAO = new EmployeeDAO();
    public void insertEmployee(Employee e) {
        employeeDAO.insertEmployee(e);
    }

    public void updateNameEmployee(Employee e, String name) {
        employeeDAO.updateNameEmployee(e,name);
    }

    public void updateEmailEmployee(Employee e,String email) {
        employeeDAO.updateEmailEmployee(e,email);
    }

    public void updateBirthdayEmployee(Employee e, LocalDate Birthday) {
        employeeDAO.updateBirthdayEmployee(e, Birthday);
    }

    public void DeleteEmployee(Employee e) {
        employeeDAO.DeleteEmployee(e);
    }
    public ArrayList<Employee> getEmployees() {
        ArrayList<Employee> listEmployees = employeeDAO.getAllEmployees();
        return listEmployees;
    }

    public void deleteEmployee(String id) {
        employeeDAO.deleteEmployee(id);
    }
}
