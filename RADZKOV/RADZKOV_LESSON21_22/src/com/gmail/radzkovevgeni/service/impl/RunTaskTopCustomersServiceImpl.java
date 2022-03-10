package com.gmail.radzkovevgeni.service.impl;

import com.gmail.radzkovevgeni.model.RepairData;
import com.gmail.radzkovevgeni.repository.impl.WorkingWithFilesRepositoryImpl;
import com.gmail.radzkovevgeni.service.RunTaskService;

import java.io.File;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.*;
import java.util.stream.Collectors;

public class RunTaskTopCustomersServiceImpl implements RunTaskService {
    private static final Integer COUNT = 1;
    private static final String NAME_FILE = "top.txt";
    private static final Integer TOP_CUSTOMERS = 10;

    private static RunTaskTopCustomersServiceImpl instance;

    private RunTaskTopCustomersServiceImpl() {
    }

    @Override
    public void runTask() {
        WorkingWithFilesRepositoryImpl filesRepository = WorkingWithFilesRepositoryImpl.getInstance();

        List<RepairData> lines = filesRepository.readingFile();

        Map<String, Integer> clarificationOfTerms = new TreeMap<>();
        Map<String, Integer> allCustomres = new TreeMap<>();
        Map<String, Double> percentOfClarifications = new TreeMap<>();

        for (RepairData line : lines) {
            String utochnenieSrokov = line.getUtochnenieSrokov();
            String zakazchik = line.getZakazchik();

            if (!utochnenieSrokov.equalsIgnoreCase("-") && clarificationOfTerms.containsKey(zakazchik)) {
                clarificationOfTerms.put(zakazchik, clarificationOfTerms.get(zakazchik) + COUNT);
            } else {
                clarificationOfTerms.put(zakazchik, COUNT);
            }

            if (allCustomres.containsKey(zakazchik)) {
                allCustomres.put(zakazchik, allCustomres.get(zakazchik) + COUNT);
            } else {
                allCustomres.put(zakazchik, COUNT);
            }
        }


        Set<Map.Entry<String, Integer>> entrySet = allCustomres.entrySet();
        for (Map.Entry<String, Integer> entry : entrySet) {
            Integer countOfLines = entry.getValue();
            Integer countOfClarifications = clarificationOfTerms.get(entry.getKey());
            Double percent = (double) countOfClarifications / countOfLines;
            Double truncatedDouble = BigDecimal.valueOf(percent)
                    .setScale(2, RoundingMode.HALF_UP)
                    .doubleValue();
            percentOfClarifications.put(entry.getKey(), truncatedDouble);
        }

        Set<Map.Entry<String, Double>> sorted = percentOfClarifications.entrySet().stream()
                .sorted(Map.Entry.<String, Double>comparingByValue())
                .limit(TOP_CUSTOMERS)
                .collect(Collectors.toSet());

        File createFile = filesRepository.createFile(NAME_FILE);

        File writeFile = filesRepository.writeDoubleToFile(createFile, sorted);

    }

    public static RunTaskTopCustomersServiceImpl getInstance() {
        if (instance == null) {
            instance = new RunTaskTopCustomersServiceImpl();
        }
        return instance;
    }
}
