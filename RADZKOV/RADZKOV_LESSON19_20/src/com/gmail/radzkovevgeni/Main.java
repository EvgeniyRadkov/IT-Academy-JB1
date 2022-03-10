package com.gmail.radzkovevgeni;

import com.gmail.radzkovevgeni.service.RunTaskService;
import com.gmail.radzkovevgeni.service.impl.RunOneTaskImpl;
import com.gmail.radzkovevgeni.service.impl.RunThreeTaskImpl;
import com.gmail.radzkovevgeni.service.impl.RunTwoTaskImpl;

public class Main {

    private static final int NUMBER_OF_TASK = 3;

    public static void main(String[] args) {
        RunTaskService[] taskService = {RunOneTaskImpl.getInstance(),
                RunTwoTaskImpl.getInstance(),
                RunThreeTaskImpl.getInstance()
        };

        for (RunTaskService runTaskService : taskService) {
            runTaskService.runTask();
        }
//        RunTaskService taskOne = RunOneTaskImpl.getInstance();
//        taskOne.runTask();
//
//        RunTaskService taskTwo = RunTwoTaskImpl.getInstance();
//        taskTwo.runTask();
//
//        RunThreeTaskImpl  threeTask = RunThreeTaskImpl.getInstance();
//        threeTask.runTask();

    }
}
