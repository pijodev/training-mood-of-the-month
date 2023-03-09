package io.takima.ProjectMOTM;


import io.takima.service.EmployeeService;

public class Main {

    public static void main(String[] args) {
        RecordsOnInitService recordsOnInitService = new RecordsOnInitService();
        recordsOnInitService.onInit();

        EmployeeService employeeService = new EmployeeService();
        employeeService.getEmployees();

        MotmService motmService = new MotmService();
        motmService.getAllMotm();
    }
}
