package com.gmail.radzkovevgeni.task.three.repository.impl;

import com.gmail.radzkovevgeni.task.three.repository.CreateFile;

import java.io.File;
import java.io.IOException;

public class CreateFileImpl implements CreateFile {
    @Override
    public File createFile(String nameFile) {
        File file = new File(nameFile);
        if (!file.exists()) {
            try {
                boolean isFileCreated = file.createNewFile();
                if (isFileCreated) {
                    System.out.println("File is name " + file.getName() + " was created");
                }
            } catch (IOException e) {
                System.out.println(e.getMessage());
                e.printStackTrace();
            }
        }
        return file;
    }
}
