package com.gmail.radzkovevgeni.service.impl;

import com.gmail.radzkovevgeni.model.task.two.Automobile;
import com.gmail.radzkovevgeni.model.task.two.EnglandAutomobile;
import com.gmail.radzkovevgeni.model.task.two.GermanyAutomobile;
import com.gmail.radzkovevgeni.model.task.two.RussianAutomobile;
import com.gmail.radzkovevgeni.service.TaskService;

public class TaskTwoServiceImpl implements TaskService {
    @Override
    public void runTask() {
        Automobile rangeRover = new EnglandAutomobile(7);
        Automobile audi = new GermanyAutomobile(9);
        Automobile lada = new RussianAutomobile(6);

        System.out.println("-------------------------Task Two-------------------------");
        System.out.println("                     Rating automobile            ");

        Automobile[] automobiles = {rangeRover, audi, lada};
        for (Automobile automobile : automobiles) {
            System.out.print(automobile.getDescription());
            System.out.println(", rating auto " + automobile.getRate());
        }
        System.out.println();
    }
}
