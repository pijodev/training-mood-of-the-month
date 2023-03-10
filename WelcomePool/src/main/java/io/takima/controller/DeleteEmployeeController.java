package io.takima.controller;

import io.takima.service.EmployeeService;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/deleteMember")
public class DeleteEmployeeController extends HttpServlet {

    EmployeeService employeeService = new EmployeeService();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) {
        String id = req.getParameter("id");
        employeeService.deleteEmployee(id);
        try {
            resp.sendRedirect("admin");
        } catch (IOException e) {
            System.out.println("Error while redirecting to admin page");
        }
    }
}
