package com.gmail.radzkovevgeni.service.impl;

import com.gmail.radzkovevgeni.service.RunningTaskService;

import java.util.*;

public class TaskThreeServiceImpl implements RunningTaskService {
    private static final Integer MINIMAL_INTEGER_NUMBER = 2;
    private static final Integer MAXIMAL_INTEGER_NUMBER = 98;
    private static final Integer DIFFERENCE_INTEGER_NUMBER = MAXIMAL_INTEGER_NUMBER - MINIMAL_INTEGER_NUMBER + 1;

    @Override
    public void runTaskOne() {
        System.out.println("\n_________TaskThree___________");
        List<Integer> arrayIntegerNumber = new ArrayList<>();
        for (Integer count = 0; count < 10 ; count++) {
            Random random = new Random();
            Integer element = random.nextInt(DIFFERENCE_INTEGER_NUMBER) + MINIMAL_INTEGER_NUMBER;
            arrayIntegerNumber.add(element);
            }
        System.out.println("Maximum random arrays values:");
        System.out.print(arrayIntegerNumber.get(arrayIntegerNumber.size() - 1) + " and "
                + arrayIntegerNumber.get(arrayIntegerNumber.size() - 2));


    }
}
