package com.gmail.radzkovevgeni.service.impl;

import com.gmail.radzkovevgeni.model.RepairData;
import com.gmail.radzkovevgeni.repository.impl.WorkingWithFilesRepositoryImpl;
import com.gmail.radzkovevgeni.service.RunTaskService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class RunTaskRoadRestrictionServiceImpl implements RunTaskService {
    private static final Integer COUNT = 1;
    private static RunTaskRoadRestrictionServiceImpl instance;

    private RunTaskRoadRestrictionServiceImpl() {

    }

    @Override
    public void runTask() {
        WorkingWithFilesRepositoryImpl filesRepository = WorkingWithFilesRepositoryImpl.getInstance();

        List<RepairData> lines = filesRepository.readingFile();

        Map<String, Integer> roadRestrictions = new HashMap<>();
        for (RepairData line : lines) {
            String vidOgranicheniya = line.getVidOgranicheniya();

            if (roadRestrictions.containsKey(vidOgranicheniya)) {
                roadRestrictions.put(vidOgranicheniya, roadRestrictions.get(vidOgranicheniya) + COUNT);
            } else {
                roadRestrictions.put(vidOgranicheniya, COUNT);
            }
        }

        Set<Map.Entry<String, Integer>> entrySet = roadRestrictions.entrySet();
        for (Map.Entry<String, Integer> entry : entrySet) {
            System.out.printf("%s : %d %n", entry.getKey(), entry.getValue());
        }
    }

    public static RunTaskRoadRestrictionServiceImpl getInstance() {
        if (instance == null) {
            instance = new RunTaskRoadRestrictionServiceImpl();
        }
        return instance;
    }
}
