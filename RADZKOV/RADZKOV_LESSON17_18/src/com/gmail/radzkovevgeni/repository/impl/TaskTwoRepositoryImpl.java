package com.gmail.radzkovevgeni.repository.impl;

import com.gmail.radzkovevgeni.repository.FileRepository;
import com.gmail.radzkovevgeni.repository.TaskTwoRepository;
import com.gmail.radzkovevgeni.service.utilites.RandomUtil;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class TaskTwoRepositoryImpl implements TaskTwoRepository {
    private static final String NAME_OF_FILE = "Task_Two.txt";
    private static final String STRING_NAME = "С:\\WebServers\\home\\testsite\\www\\myfile";
    private static final String EXTENSION = ".txt";
    private static final Integer MIN_VALUE = 1;
    private static final Integer MAX_VALUE = 25;
    private static final Integer COUNT_RANDOM_STRING = 10;

    private final FileRepository fileRepository = new FileRepositoryImpl();
    private final RandomUtil random = new RandomUtil();

    @Override
    public File getCreatedFile() {
        List<String> lines = new ArrayList<>();
        for (int i = 0; i < COUNT_RANDOM_STRING; i++) {
            String stringToWrite = STRING_NAME + random.getRandomNumber(MIN_VALUE, MAX_VALUE) + EXTENSION;
            lines.add(stringToWrite);
        }
        File file = fileRepository.createFile(NAME_OF_FILE);

        fileRepository.writeStringToFile(file, lines);

        return file;
    }

}
