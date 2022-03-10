package com.gmail.radzkovevgeni.service;

import java.util.Random;

public class RandomService {
    private static final String[] RANDOM_NAME = {"Fill", "Sergei", "Sam", "Olga", "Petr",
            "Inna", "Svetlana", "Ivan", "Alex", "Jac"};
    private static final String[] RANDOM_SURNAME = {"Melbek", "Strugailo", "Nalivaiko", "Black", "Stone",
            "Filin", "Smitt", "Pit", "Milk", "Coffe"};
    private static final Integer[] RANDOM_AGE = {25, 18, 12, 54, 62, 25, 18, 19, 16, 17};

    Random random = new Random();

    public String getRandomFirstName() {
        int randomFirstNameValue = random.nextInt(RANDOM_NAME.length);
        return RANDOM_NAME[randomFirstNameValue];
    }

    public String getRandomSurName() {
        int randomSurNameValue = random.nextInt(RANDOM_SURNAME.length);
        return RANDOM_SURNAME[randomSurNameValue];
    }

    public Integer getRandomAge() {
        int randomAge = random.nextInt(RANDOM_AGE.length);
        return RANDOM_AGE[randomAge];
    }


}
