package com.gmail.radzkovevgeni.service.impl;

import com.gmail.radzkovevgeni.model.RepairData;
import com.gmail.radzkovevgeni.repository.impl.WorkingWithFilesRepositoryImpl;
import com.gmail.radzkovevgeni.service.RunTaskService;

import java.io.File;
import java.util.*;

public class RunTaskTrafficRestrictionCustomerServiceImpl implements RunTaskService {
    private static final Integer COUNT = 1;
    private static final String VID_OGRANICHENIYA = "огранич.движения";
    private static final String NAME_FILE = "zakazchik.txt";
    private static RunTaskTrafficRestrictionCustomerServiceImpl instance;

    private RunTaskTrafficRestrictionCustomerServiceImpl(){
    }

    @Override
    public void runTask() {
        WorkingWithFilesRepositoryImpl filesRepository = WorkingWithFilesRepositoryImpl.getInstance();

        List<RepairData> lines = filesRepository.readingFile();

        Map<String, Integer> trafficRestrictionCustomer = new HashMap<>();
        for (RepairData line : lines) {
            String zakazchik = line.getZakazchik();

            if (trafficRestrictionCustomer.containsKey(line.getVidOgranicheniya().equals(VID_OGRANICHENIYA))) {
                trafficRestrictionCustomer.put(zakazchik, trafficRestrictionCustomer.get(zakazchik + COUNT));
            } else {
                trafficRestrictionCustomer.put(zakazchik, COUNT);
            }
        }

        Set<Map.Entry<String, Integer>> entrySet = trafficRestrictionCustomer.entrySet();// подумать может лучше в лист засунуть

        File createFile = filesRepository.createFile(NAME_FILE);

        File writeFile = filesRepository.writeStringToFile(createFile, entrySet);
    }

   public static RunTaskTrafficRestrictionCustomerServiceImpl getInstance(){
        if(instance == null){
            instance = new RunTaskTrafficRestrictionCustomerServiceImpl();
        }
        return instance;
   }
}
