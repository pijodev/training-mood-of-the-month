package io.takima.controller;

import io.takima.dao.models.MOTM;
import io.takima.dao.models.MOTM_Answer;
import io.takima.service.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet("/dashboard")
public class DashBoardController extends HttpServlet {


    DashBoardService dashBoardService = new DashBoardService();
    MotmService motmService = new MotmService();
    MOTM_AnswerService motmAnswerService = new MOTM_AnswerService();

    @Override
    public void init() {
        System.out.println("Servlet initialized successfully");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        MOTM motm = motmService.getLastMotm();
        ArrayList<MOTM_Answer> motmAnswers = motmAnswerService.getMotmAnswersByMotmId(motm.getUuid());
        req.setAttribute("MotmAnswers", motmAnswers);
        req.setAttribute("LastMotm", motmService.getLastMotm());
        req.setAttribute("GradeStats", dashBoardService.getGradeStats());
        RequestDispatcher dispatcher = req.getRequestDispatcher("/dashboard.jsp");
        dispatcher.forward(req, resp);
    }




}
