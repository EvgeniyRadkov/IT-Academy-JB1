package com.gmail.radzkovevgeni.service.utilites;

import java.security.SecureRandom;
import java.util.Random;

public class RandomUtil {
    private static final Random randomUtil = new Random();
    private static final Integer LENGHT_NAME_FILE_FROM = 1;
    private static final Integer LENGHT_NAME_FILE_TO = 15;

    public Integer getRandomNumber(Integer minValue, Integer maxValue) {
        return randomUtil.nextInt(maxValue - minValue + LENGHT_NAME_FILE_FROM) + minValue;
    }

    public String getRandomNameTwo() {
        String AB = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        SecureRandom rnd = new SecureRandom();
        int len = getRandomNumber(LENGHT_NAME_FILE_FROM, LENGHT_NAME_FILE_TO);
        StringBuilder sb = new StringBuilder(len);
        for (int i = 0; i < len; i++)
            sb.append(AB.charAt(rnd.nextInt(AB.length())));
        return sb.toString();

    }
}