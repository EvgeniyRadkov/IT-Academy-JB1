package com.gmail.radzkovevgeni.model;

import com.gmail.radzkovevgeni.repository.FileRepository;
import com.gmail.radzkovevgeni.repository.TaskTwoRepository;
import com.gmail.radzkovevgeni.repository.impl.FileRepositoryImpl;
import com.gmail.radzkovevgeni.repository.impl.TaskTwoRepositoryImpl;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class FlowTaskTwo implements Runnable {

    public static final String NAME_FILE_WITH_EDITED_LINES = "Task_two_new";
    private final TaskTwoRepository taskTwoRepository = new TaskTwoRepositoryImpl();
    private final FileRepository fileRepository = new FileRepositoryImpl();

    @Override
    public void run() {
        List<String> readingLines = fileRepository.readFromFile(taskTwoRepository.getCreatedFile());

        List<String> newLines = getNewLines(readingLines);

        File file = fileRepository.createFile(NAME_FILE_WITH_EDITED_LINES);
        fileRepository.writeStringToFile(file, newLines);
        System.out.println(getFileSize(file));
    }

    private List<String> getNewLines(List<String> readingLines) {
        List<String> newLines = new ArrayList<>();
        for (String readingLine : readingLines) {
            String line = readingLine.replace(".txt", "");
            newLines.add(line);
        }
        return newLines;
    }

    public String getFileSize(File file) {
        if (file.exists()) {
            return "Size file " + file.length() + " bytes";
        } else {
            return "File not exist";
        }
    }
}
