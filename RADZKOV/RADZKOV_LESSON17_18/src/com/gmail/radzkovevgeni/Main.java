package com.gmail.radzkovevgeni;

import com.gmail.radzkovevgeni.service.RunTaskService;
import com.gmail.radzkovevgeni.service.impl.TaskOneServiceImpl;
import com.gmail.radzkovevgeni.service.impl.TaskThreeServiceImpl;
import com.gmail.radzkovevgeni.service.impl.TaskTwoServiceImpl;

public class Main {

    public static void main(String[] args) throws Exception {
        RunTaskService[] taskService = {new TaskOneServiceImpl(),
                new TaskTwoServiceImpl(),
                new TaskThreeServiceImpl()
        };
        for (RunTaskService runTaskService : taskService) {
            runTaskService.RunTask();
        }
    }
}
