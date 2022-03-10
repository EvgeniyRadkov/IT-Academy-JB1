package com.gmail.radzkovevgeni.task.one.repository.impl;

import com.gmail.radzkovevgeni.task.one.repository.CreateFileRepository;

import java.io.File;
import java.io.IOException;

public class CreateFileRepositoryImpl implements CreateFileRepository {
    @Override
    public void createFile() {
        File file = new File("Task_one_file.txt");
        if (!file.exists()) {
            try {
                boolean newFileCreated = file.createNewFile();
                if (newFileCreated) {
                    System.out.println("File is name " + file.getName() + " was created!");
                }
            } catch (IOException e) {
                System.out.println(e.getMessage());
                e.printStackTrace();
            }
        }
    }
}
