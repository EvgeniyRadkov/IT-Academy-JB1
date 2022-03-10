package com.gmail.radzkovevgeni.repository.impl;

import com.gmail.radzkovevgeni.repository.CreateListRepository;
import com.gmail.radzkovevgeni.repository.utilites.RandomUtil;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ArrayListRepositoryImpl implements CreateListRepository {
    private static final Integer SIZE_OF_ARRAY_LIST = 50;
    private static final Integer NUMBER_FROM = 0;
    private static final Integer NUMBER_TO = 20;
    private static final Integer SIZE_OF_ARRAY_LIST_START = 0;

    private final RandomUtil random = new RandomUtil();
    private List<Integer> randomArrayList = new ArrayList<>();

    private static ArrayListRepositoryImpl instance;

    private ArrayListRepositoryImpl() {
    }

    public static CreateListRepository getInstance() {
        if (instance == null) {
            instance = new ArrayListRepositoryImpl();
        }
        return instance;
    }

    @Override
    public List createList() {
        randomArrayList = IntStream.rangeClosed(SIZE_OF_ARRAY_LIST_START, SIZE_OF_ARRAY_LIST)
                .boxed()
                .map(numbers -> random.getRandomNumber(NUMBER_FROM, NUMBER_TO))
                .collect(Collectors.toList());
        System.out.println("Created ArrayList with 50 elements and filled with random numbers from 0 to 20");
        return randomArrayList;
    }

    @Override
    public String toString() {
        return randomArrayList.toString();
    }
}
