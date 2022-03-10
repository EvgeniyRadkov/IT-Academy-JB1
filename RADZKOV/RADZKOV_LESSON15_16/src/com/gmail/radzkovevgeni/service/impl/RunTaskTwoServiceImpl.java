package com.gmail.radzkovevgeni.service.impl;

import com.gmail.radzkovevgeni.service.RunTaskTwoService;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class RunTaskTwoServiceImpl implements RunTaskTwoService {

    private static final String NAME_FILE_TASK_TWO = "Task_two_file.txt";
    public static final int DELETE_WORD_WITH_SYMBOL_FROM = 3;
    public static final int DELETE_WORD_WITH_SYMBOL_TO = 5;

    @Override
    public void runTaskTwo() {
        StringBuilder sb = new StringBuilder();
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(NAME_FILE_TASK_TWO)));
            String line;
            while ((line = reader.readLine()) != null) {
                sb.append(line);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

        String[] storeArray = sb.toString().split(" ");

        List<String> newString = new ArrayList<>();

        for (String word : storeArray)
            if (word.length() < DELETE_WORD_WITH_SYMBOL_FROM || word.length() > DELETE_WORD_WITH_SYMBOL_TO) {
                newString.add(word);
            }
        try {
            Files.write(Paths.get(NAME_FILE_TASK_TWO), newString, Charset.defaultCharset());
        } catch (IOException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
