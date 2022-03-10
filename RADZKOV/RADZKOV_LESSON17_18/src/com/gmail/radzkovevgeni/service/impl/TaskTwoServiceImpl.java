package com.gmail.radzkovevgeni.service.impl;

import com.gmail.radzkovevgeni.model.FlowTaskTwo;

import com.gmail.radzkovevgeni.service.RunTaskService;

public class TaskTwoServiceImpl implements RunTaskService {
    private static final Integer TIME_FOR_SLEEP = 1000;

    private final Runnable flowTaskTwo = new FlowTaskTwo();
    private final Thread flowTaskTwoThread = new Thread(flowTaskTwo);

    @Override
    public void RunTask() throws InterruptedException {

        System.out.println('\n');
        System.out.println("___________Task Two___________");

        flowTaskTwoThread.start();

        Thread.sleep(TIME_FOR_SLEEP);
    }
}
