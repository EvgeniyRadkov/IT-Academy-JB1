package com.gmail.radzkovevgeni.repository;

import java.io.File;
import java.util.List;

public interface FileRepository {
    File createFile(String nameFile);

    void writeToFile(File file, List<Integer> text);

    File writeStringToFile(File file, List<String> text);

    List<String> readFromFile(File file);

}
