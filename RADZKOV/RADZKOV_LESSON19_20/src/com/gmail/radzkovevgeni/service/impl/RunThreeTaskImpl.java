package com.gmail.radzkovevgeni.service.impl;

import com.gmail.radzkovevgeni.model.Train;
import com.gmail.radzkovevgeni.repository.impl.FillFieldsTrainImpl;
import com.gmail.radzkovevgeni.service.RunTaskService;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class RunThreeTaskImpl implements RunTaskService {

    private static RunThreeTaskImpl instance;

    private RunThreeTaskImpl() {
    }

    public static RunThreeTaskImpl getInstance() {
        if (instance == null) {
            instance = new RunThreeTaskImpl();
        }
        return instance;
    }

    @Override
    public void runTask() {
        System.out.println('\n');
        System.out.println("________Task Three______");

        Train train = FillFieldsTrainImpl.getInstance().getTrain();

        String fullTime = train.getEdit1().concat(" ").concat(train.getEdit2());
        LocalDateTime startingTime = LocalDateTime.parse(fullTime, DateTimeFormatter.ofPattern("dd.MM.yyyy HH.mm"));
        Long travelTime = Long.parseLong(train.getEdit3());
        LocalDateTime endTime = startingTime.plusHours(travelTime);
        DayOfWeek dayOfWeek = endTime.getDayOfWeek();

        System.out.println("Travel will arrive at station on " + dayOfWeek);

    }
}
