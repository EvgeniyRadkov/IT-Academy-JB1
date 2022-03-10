package com.gmail.radzkovevgeni;



import com.gmail.radzkovevgeni.service.impl.TaskOneServiceImpl;
import com.gmail.radzkovevgeni.service.impl.TaskThreeServiceImpl;
import com.gmail.radzkovevgeni.service.impl.TaskTwoServiceImpl;

public class Main {

    public static void main(String[] args) {
        TaskOneServiceImpl taskOneService = new TaskOneServiceImpl();
        taskOneService.runTaskOne();
        TaskTwoServiceImpl taskTwoService = new TaskTwoServiceImpl();
        taskTwoService.runTaskOne();
        TaskThreeServiceImpl taskThreeService = new TaskThreeServiceImpl();
        taskThreeService.runTaskOne();

    }
}

