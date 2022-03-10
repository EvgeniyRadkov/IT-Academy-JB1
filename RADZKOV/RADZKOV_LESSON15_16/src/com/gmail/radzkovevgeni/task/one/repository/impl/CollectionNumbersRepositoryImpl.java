package com.gmail.radzkovevgeni.task.one.repository.impl;

import com.gmail.radzkovevgeni.task.one.repository.CollectionNumbersRepository;
import com.gmail.radzkovevgeni.utilites.RandomUtil;

import java.util.ArrayList;
import java.util.List;

public class CollectionNumbersRepositoryImpl implements CollectionNumbersRepository {
    private static final Integer MIN_NUMBER_OF_LIST = 20;
    private static final Integer MAX_NUMBER_OF_LIST = 50;

    private final RandomUtil randomUtil = new RandomUtil();

    @Override
    public List<Integer> getCollection(int sizeOfArray) {
        List<Integer> numberOfList = new ArrayList<>();
        for (int i = 0; i < sizeOfArray; i++) {
            int numbers = randomUtil.getRandomNextInt(MIN_NUMBER_OF_LIST, MAX_NUMBER_OF_LIST);
            numberOfList.add(numbers);
        }
        return numberOfList;
    }
}
