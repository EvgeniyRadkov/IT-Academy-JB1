package com.gmail.radzkovevgeni;

import com.gmail.radzkovevgeni.service.TaskService;
import com.gmail.radzkovevgeni.service.impl.TaskOneServiceImpl;
import com.gmail.radzkovevgeni.service.impl.TaskThreeServiceImpl;
import com.gmail.radzkovevgeni.service.impl.TaskTwoServiceImpl;

public class Main {

    public static void main(String[] args) {
        TaskService taskOneService = new TaskOneServiceImpl();
        TaskService taskTwoService = new TaskTwoServiceImpl();
        TaskService taskThreeService = new TaskThreeServiceImpl();
        taskOneService.runTask();
        taskTwoService.runTask();
        taskThreeService.runTask();
    }
}
