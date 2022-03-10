package com.gmail.radzkovevgeni.repository.impl;

import com.gmail.radzkovevgeni.repository.CreateListRepository;
import com.gmail.radzkovevgeni.repository.utilites.RandomUtil;

import java.util.LinkedList;
import java.util.List;

public class LinkedListRepositoryImpl implements CreateListRepository {
    private static final Integer SIZE_OF_LINKED_LIST = 50;
    private static final Integer NUMBER_FROM = 0;
    private static final Integer NUMBER_TO = 20;

    private final RandomUtil random = new RandomUtil();
    private final List<Integer> randomLinkedList = new LinkedList<>();

    private static LinkedListRepositoryImpl instance;

    private LinkedListRepositoryImpl() {
    }

    public static CreateListRepository getInstance() {
        if (instance == null) {
            instance = new LinkedListRepositoryImpl();
        }
        return instance;
    }

    @Override
    public List createList() {
        for (int i = 0; i < SIZE_OF_LINKED_LIST; i++) {
            randomLinkedList.add(random.getRandomNumber(NUMBER_FROM, NUMBER_TO));
        }
        System.out.println("Created LinkedList with 50 elements and filled with random numbers from 0 to 20");
        return randomLinkedList;
    }

    @Override
    public String toString() {
        return randomLinkedList.toString();
    }
}
