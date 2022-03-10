package com.gmail.radzkovevgeni.task.three.repository.impl;

import com.gmail.radzkovevgeni.task.three.repository.CreateFolder;

import java.io.File;

public class CreateFolderImpl implements CreateFolder {

    @Override
    public File createFolder(String nameFolder) {
        File folder = new File(nameFolder);
        if (!folder.exists()) {
            boolean isCreatedFolder = folder.mkdirs();
            if (isCreatedFolder) {
                System.out.println("Folder is name " + folder.getName() + " was created");
            }
        }
        return folder;
    }
}