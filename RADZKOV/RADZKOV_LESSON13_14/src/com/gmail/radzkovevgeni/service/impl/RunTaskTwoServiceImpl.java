package com.gmail.radzkovevgeni.service.impl;

import com.gmail.radzkovevgeni.service.RunTaskTwoService;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class RunTaskTwoServiceImpl implements RunTaskTwoService {

    private static final Integer MIN_VALUE = 16;
    private static final Integer MAX_VALUE = 18;
    private static final Integer START_OF_LIST = 1;
    private static final Integer SIZE_OF_LIST = 9;

    private final Random random = new Random();

    @Override
    public void runTaskTwo() {
        System.out.println('\n' + "___________Task Two___________");
        System.out.println('\n' + "Whether there are numbers that are divisible by both 3 and 5");
        List<Integer> list = IntStream.rangeClosed(START_OF_LIST, SIZE_OF_LIST).boxed()
                .map(integer -> integer = getRandomValue())
                .collect(Collectors.toList());
        System.out.println(list.stream().anyMatch(integer -> integer % 3 == 0 && integer % 5 == 0));
    }

    private Integer getRandomValue() {
        Integer differanceValue = MAX_VALUE - MIN_VALUE + 1;
        return random.nextInt(differanceValue) + MIN_VALUE;
    }
}
