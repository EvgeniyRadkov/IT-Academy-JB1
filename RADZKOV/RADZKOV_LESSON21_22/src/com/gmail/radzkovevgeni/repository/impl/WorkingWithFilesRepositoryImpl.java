package com.gmail.radzkovevgeni.repository.impl;

import com.gmail.radzkovevgeni.model.RepairData;
import com.gmail.radzkovevgeni.repository.WorkingWithFilesRepository;

import java.io.*;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class WorkingWithFilesRepositoryImpl implements WorkingWithFilesRepository {
    private static final String PATH_TO_FILE = "D:" + File.separator + "data-20210322T091543-structure-20200120T130522.csv";
    private static final Integer COUNT = 1;

    private static WorkingWithFilesRepositoryImpl instance;

    private WorkingWithFilesRepositoryImpl() {
    }

    @Override
    public String getPathToFile() {
        return String.valueOf(Paths.get(PATH_TO_FILE));
    }

    @Override
    public List<RepairData> readingFile() {
        List<RepairData> columns = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(getPathToFile()))) {
            String line = br.readLine();

            while (line != null) {
                String[] splitedText = line.split(",");
                List<String> fields = new ArrayList<>();

                for (int i = 0; i < splitedText.length; i++) {
                    if (IsColumnPart(splitedText[i])) {
                        String lastText = fields.get(fields.size() - COUNT);
                        fields.set(fields.size() - COUNT, lastText + "," + splitedText[i]);
                    } else {
                        fields.add(splitedText[i]);
                    }
                }

                RepairData repairData = new RepairData.Builder()
                        .kod(fields.get(0))
                        .nomerRasporiazeniya(fields.get(1))
                        .zakazchik(fields.get(2))
                        .innZakazchika(fields.get(3))
                        .podriadchik(fields.get(4))
                        .innPodriadchika(fields.get(5))
                        .rayon(fields.get(6))
                        .adres(fields.get(7))
                        .vidOgranicheniya(fields.get(8))
                        .vidRabot(fields.get(9))
                        .dataNachalaOgranicheniya(fields.get(10))
                        .dataOkonchaniyaOgranicheniya(fields.get(11))
                        .dataSniatiyaOgrenicheniya(fields.get(12))
                        .utochnenieSrokov(fields.get(13))
                        .build();
                columns.add(repairData);
                line = br.readLine();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        return columns;
    }

    private static boolean IsColumnPart(String text) {
        String trimText = text.trim();
        return trimText.indexOf("\"") == trimText.lastIndexOf("\"") && trimText.endsWith("\"");
    }


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
    public File writeStringToFile(File file, Set<Map.Entry<String, Integer>> text) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {
            for (Map.Entry<String, Integer> entry : text) {
                bw.write(entry.getKey());
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        return file;
    }

    @Override
    public File writeDoubleToFile(File file, Set<Map.Entry<String, Double>> text) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {
            for (Map.Entry<String, Double> entry : text) {
                bw.write(entry.getKey());
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        return file;
    }

    @Override
    public File writeListToFile(File file, List<String> text) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {
            for (String t : text) {
                bw.write(t);
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        return file;
    }

    public static WorkingWithFilesRepositoryImpl getInstance() {
        if (instance == null) {
            instance = new WorkingWithFilesRepositoryImpl();
        }
        return instance;
    }


}
