package com.gmail.radzkovevgeni.utilites;

import java.util.Random;

public class RandomUtil {

    private static final Random random = new Random();

    public Integer getRandomNextInt(int numberFrom, int numberTo) {

        return random.nextInt(numberTo - numberFrom + 1) + numberFrom;
    }
}
