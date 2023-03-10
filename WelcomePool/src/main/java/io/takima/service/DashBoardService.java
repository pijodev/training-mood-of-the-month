package io.takima.service;

import io.takima.dao.models.MOTM;
import io.takima.dao.models.MOTM_Answer;
import io.takima.controller.models.GradeStats;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class DashBoardService {


    public ArrayList<GradeStats> getGradeStats() {
        return new ArrayList<GradeStats>(Arrays.asList(
                new GradeStats(MOTM_Answer.Grade.E, 10, 0.1),
                new GradeStats(MOTM_Answer.Grade.D, 5 , 0.05),
                new GradeStats(MOTM_Answer.Grade.C, 20, 0.2),
                new GradeStats(MOTM_Answer.Grade.B, 40, 0.4),
                new GradeStats(MOTM_Answer.Grade.A, 25, 0.25)
        ));
    }



}
