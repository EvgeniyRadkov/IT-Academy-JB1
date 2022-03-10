package com.gmail.radzkovevgeni.service.impl;

import com.gmail.radzkovevgeni.model.FlowWithRandomNumbers;
import com.gmail.radzkovevgeni.service.RunTaskService;

public class TaskOneServiceImpl implements RunTaskService {
    private static final Integer TIME_FOR_SLEEP = 1000;
    private static final int COUNTS_OF_FLOW_CREATED = 5;

    @Override
    public void RunTask() throws InterruptedException {

        System.out.println("___________Task One___________");

        for (int i = 0; i < COUNTS_OF_FLOW_CREATED; i++) {
            Runnable runnable = new FlowWithRandomNumbers();
            Thread thread = new Thread(runnable);
            thread.start();
        }
        Thread.sleep(TIME_FOR_SLEEP);
    }
}
