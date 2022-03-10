package com.gmail.radzkovevgeni.service.impl;

import com.gmail.radzkovevgeni.service.RunTaskOneService;

import java.util.*;

public class TaskOneServiceImpl implements RunTaskOneService {
    private static final Integer SIZE_OF_LIST = 50;
    private static final Integer BOUND_OF_RANDOM_VALUE = 20;
    private Integer randomValue;

    Random random = new Random();

    @Override
    public void runTaskOne() {
        System.out.println("___________Task One___________");

        Map<Integer, Integer> randomMap = new HashMap<>();
        List<Integer> randomList = new ArrayList<>();
        for (Integer element = 0; element < SIZE_OF_LIST; element++) {
            Integer value = random.nextInt(BOUND_OF_RANDOM_VALUE);
            randomList.add(value);
        }

        for (Integer element : randomList) {
            if (!randomMap.containsKey(element)) {
                randomMap.put(element, 1);
            } else
                randomMap.put(element, randomMap.get(element) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : randomMap.entrySet()) {
            if ((entry.getValue().equals(2)) || (entry.getValue().equals(3)) || (entry.getValue().equals(3))) {
                System.out.println(entry.getKey() + " повторялось " + entry.getValue() + " раза");
            } else {
                System.out.println(entry.getKey() + " повторялось " + entry.getValue() + " раз");
            }
        }
    }
}


