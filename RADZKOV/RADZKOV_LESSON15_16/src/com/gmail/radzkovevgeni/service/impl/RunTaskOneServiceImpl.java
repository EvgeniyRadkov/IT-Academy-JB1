package com.gmail.radzkovevgeni.service.impl;

import com.gmail.radzkovevgeni.task.one.repository.CollectionNumbersRepository;
import com.gmail.radzkovevgeni.task.one.repository.impl.CollectionNumbersRepositoryImpl;
import com.gmail.radzkovevgeni.service.RunTaskOneService;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

public class RunTaskOneServiceImpl implements RunTaskOneService {
    private static final Integer SIZE_OF_LIST = 25;

    private final CollectionNumbersRepository collectionNumbersRepository = new CollectionNumbersRepositoryImpl();

    @Override
    public void runTaskOne() {
        List<Integer> list = collectionNumbersRepository.getCollection(SIZE_OF_LIST);
        try (FileOutputStream fos = new FileOutputStream("Task_one_file.txt")) {
            String listString = list.toString();
            byte[] buffer = listString.getBytes();
            fos.write(buffer, 0, buffer.length);
        } catch (IOException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        calculationOfTheAmount(list);

    }

    private void calculationOfTheAmount(List<Integer> list) {
        try {
            String summa = " Summa: " + getSumOfList(list);
            FileOutputStream fos = new FileOutputStream("Task_one_file.txt", true);
            byte[] buf = summa.getBytes();
            fos.write(buf, 0, buf.length);
        } catch (IOException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }

    private Integer getSumOfList(List<Integer> list) {
        Integer sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum = sum + list.get(i);
        }
        return sum;
    }
}
