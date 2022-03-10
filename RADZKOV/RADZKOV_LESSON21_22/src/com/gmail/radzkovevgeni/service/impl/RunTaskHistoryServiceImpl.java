package com.gmail.radzkovevgeni.service.impl;

import com.gmail.radzkovevgeni.model.RepairData;
import com.gmail.radzkovevgeni.repository.impl.WorkingWithFilesRepositoryImpl;
import com.gmail.radzkovevgeni.service.RunTaskService;

import java.io.File;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class RunTaskHistoryServiceImpl implements RunTaskService {
    private static final String START_TIME = "20201201";
    private static final String END_TIME = "20210101";
    private static final String NAME_FILE = "history.txt";

    private static RunTaskHistoryServiceImpl instance;

    private RunTaskHistoryServiceImpl() {
    }

    @Override
    public void runTask() {
        WorkingWithFilesRepositoryImpl filesRepository = WorkingWithFilesRepositoryImpl.getInstance();

        List<RepairData> lines = filesRepository.readingFile();

       List<String> customers = new ArrayList<>();

        for (RepairData line : lines) {
            LocalDate startLimit = getDate(line.getDataNachalaOgranicheniya());
            LocalDate endLimit = getDate(line.getDataSniatiyaOgrenicheniya());
            LocalDate start = getDate(START_TIME);
            LocalDate end = getDate(END_TIME);

            String zakazchik = line.getZakazchik();

            if ((start.compareTo(startLimit) >= 0) && (end.compareTo(endLimit) <= 0) && (end.compareTo(startLimit) >= 0) && (start.compareTo(endLimit) <= 0)) {
                customers.add(zakazchik);
            }
        }
        File createFile = filesRepository.createFile(NAME_FILE);

        File writeFile = filesRepository.writeListToFile(createFile, customers);
    }

    public LocalDate getDate(String time) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd");
        LocalDate date = null;
        if (time != null) {
            try {
                date = LocalDate.parse(time, formatter);
            } catch (DateTimeParseException e) {
                System.out.println(e.getMessage());
            }
        }
        return date;
    }

    public static RunTaskHistoryServiceImpl getInstance() {
        if (instance == null) {
            instance = new RunTaskHistoryServiceImpl();
        }
        return instance;
    }
}
