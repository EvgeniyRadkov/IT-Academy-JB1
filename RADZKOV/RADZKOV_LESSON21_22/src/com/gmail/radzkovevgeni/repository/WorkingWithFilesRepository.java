package com.gmail.radzkovevgeni.repository;

import com.gmail.radzkovevgeni.model.RepairData;

import java.io.File;
import java.util.List;
import java.util.Map;
import java.util.Set;

public interface WorkingWithFilesRepository {

    String getPathToFile();

    List<RepairData> readingFile();

    File createFile(String nameFile);

    File writeStringToFile(File file, Set<Map.Entry<String, Integer>> text);

    File writeDoubleToFile(File file, Set<Map.Entry<String, Double>> text);

    File writeListToFile(File file, List<String> text);

}
