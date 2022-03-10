package com.gmail.radzkovevgeni.service.impl;

import com.gmail.radzkovevgeni.model.SeasonOfYearEnum;
import com.gmail.radzkovevgeni.service.RunningTaskService;

public class TaskOneServiceImpl implements RunningTaskService {
    @Override
    public void runTaskOne() {
        System.out.println("________TaskOne__________");
        SeasonOfYearEnum season = SeasonOfYearEnum.Winter;
        SeasonOfYearEnum[] seasonOfYear = SeasonOfYearEnum.values();
        for (SeasonOfYearEnum seasonOfYearEnum : seasonOfYear) {
            System.out.println(seasonOfYearEnum.name() + ": " + seasonOfYearEnum.toString());
        }
    }
}
