package com.gmail.radzkovevgeni.repository.impl;

import com.gmail.radzkovevgeni.repository.FileRepository;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileRepositoryImpl implements FileRepository {

    @Override
    public File createFile(String nameFile) {
        File file = new File(nameFile);
        if (!file.exists()) {
            try {
                boolean isNewFileCreate = file.createNewFile();
                if (isNewFileCreate) {
                    System.out.println("File is name: " + file.getName() + " was created");
                }
            } catch (IOException e) {
                System.out.println(e.getMessage());
                e.printStackTrace();
            }
        }
        return file;
    }

    @Override
    public void writeToFile(File file, List<Integer> numbers) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {
            for (Integer line : numbers) {
                bw.write(line);
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }

    @Override
    public File writeStringToFile(File file, List<String> numbers) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {
            for (String line : numbers) {
                bw.write(line);
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        return file;
    }

    @Override
    public List<String> readFromFile(File file) {
        List<String> stringFromFile = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line = br.readLine();
            while (line != null) {
                stringFromFile.add(line);
                line = br.readLine();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        return stringFromFile;
    }


}
