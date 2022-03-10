package com.gmail.radzkovevgeni.service.impl;

import com.gmail.radzkovevgeni.model.TaskThreeRunnable;
import com.gmail.radzkovevgeni.service.RunTaskService;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class TaskThreeServiceImpl implements RunTaskService {
    private static final Integer COUNTS_OF_FLOW_CREATED = 10;
    private static final Integer POOL_FLOWS = 2;

    @Override
    public void RunTask() throws Exception {
        System.out.println('\n');
        System.out.println("__________Task Three__________");

        ExecutorService service = Executors.newFixedThreadPool(POOL_FLOWS);
        Runnable runnable = new TaskThreeRunnable();

        List<Future<List<String>>> list = new ArrayList<>();
        for (int i = 0; i < COUNTS_OF_FLOW_CREATED; i++) {
            Future<List<String>> submit = (Future<List<String>>) service.submit(runnable);
            list.add(submit);
        }
        int countOfTask = list.size();
        while (countOfTask != 0) {
            for (Future<List<String>> future : list) {
                if (future.isDone()) {
                    System.out.println(future.get());
                    countOfTask--;
                }
            }
        }
        service.shutdown();
    }
}
