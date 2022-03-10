package com.gmail.radzkovevgeni.repository.utilites;

import java.util.Random;

public class RandomUtil {
    private static final Random random = new Random();

    public Integer getRandomNumber(int numberFrom, int numberTo) {
        return random.nextInt(numberTo - numberFrom + 1) + numberFrom;
    }

    public String getRandomName(String[] array) {
        return array[random.nextInt(array.length)];
    }
}
