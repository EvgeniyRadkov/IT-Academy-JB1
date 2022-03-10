package com.gmail.radzkovevgeni.model;

import com.gmail.radzkovevgeni.repository.FileRepository;
import com.gmail.radzkovevgeni.repository.impl.FileRepositoryImpl;
import com.gmail.radzkovevgeni.service.utilites.RandomUtil;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FlowWithRandomNumbers implements Runnable {

    private static final Integer MIN_NUMBER_LIST = 0;
    private static final Integer MAX_NUMBER_LIST = 10;
    private static final Integer MIN_VALUE = 1;
    private static final Integer MAX_VALUE = 20;

    private final FileRepository fileRepository = new FileRepositoryImpl();
    private final RandomUtil random = new RandomUtil();

    @Override
    public void run() {

        String fileName = random.getRandomNameTwo();
        File file = fileRepository.createFile(fileName + ".txt");
        List<Integer> randomNumbersList = getIntegerList();
        fileRepository.writeToFile(file, randomNumbersList);

        Integer maxNumbers = randomNumbersList.stream()
                .max(Comparator.naturalOrder())
                .get();

        String dateNow = new SimpleDateFormat("dd/MM/yyyy").format(Calendar.getInstance().getTime());
        String threadName = Thread.currentThread().getName();

        System.out.println(dateNow + "-" + threadName + ": " + maxNumbers);
    }

    private List<Integer> getIntegerList() {
        return IntStream.rangeClosed(MIN_NUMBER_LIST, MAX_NUMBER_LIST)
                .boxed()
                .map(numbers -> random.getRandomNumber(MIN_VALUE, MAX_VALUE))
                .collect(Collectors.toList());
    }


}
