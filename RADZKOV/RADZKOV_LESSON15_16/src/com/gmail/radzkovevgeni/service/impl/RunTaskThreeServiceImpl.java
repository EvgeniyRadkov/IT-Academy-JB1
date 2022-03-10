package com.gmail.radzkovevgeni.service.impl;

import com.gmail.radzkovevgeni.service.RunTaskThreeService;
import com.gmail.radzkovevgeni.task.three.model.Product;
import com.gmail.radzkovevgeni.task.three.repository.CreateFile;
import com.gmail.radzkovevgeni.task.three.repository.CreateFolder;
import com.gmail.radzkovevgeni.task.three.repository.impl.CreateFileImpl;
import com.gmail.radzkovevgeni.task.three.repository.impl.CreateFolderImpl;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class RunTaskThreeServiceImpl implements RunTaskThreeService {
    private static final String PATH_NAME_OF_FOLDER = "storage/price/list";
    private static final String PATH_AND_NAME_OF_FILE = "storage/price/list/Task_three_file.txt";
    private static final String[] TEXT = {"Name", "UniqueNumber", "Price", "Count", "Production"};
    private static final String[] WINDOWS_10 = {"Windows 10", "00001", "2000", "20", "Microsoft"};
    private static final String[] USB_FLASH_DRIVER = {"USB Flash Drive", "20021", "500", "100", "Samsung"};
    private static final String[] DELL_X_01 = {"Dell x-01", "200232", "1000", "Notebook Dell", "10", "Dell"};
    private static final String[] DELL_OD_1 = {"Dell od-1", "3449", "700", "Monitor Dell", "15", "Dell"};
    private static final String[] ASUS = {"Asus x50m", "4290", "500", "Notebook Asus", "3", "Asus"};
    private static final Integer CHEK_THIRD_POSITION_IN_LIST = 3;

    private final CreateFolder folder = new CreateFolderImpl();
    private final CreateFile file = new CreateFileImpl();

    @Override
    public void runTaskThree() {
        folder.createFolder(PATH_NAME_OF_FOLDER);
        File newFile = file.createFile(PATH_AND_NAME_OF_FILE);

        List<String> widowsTen = getChekWindowsTheList();
        List<String> usbFlashDriver = getChekUabFlashDriver();
        List<String> dellX = getChekDellXList();
        List<String> dellOd = getChekDellOdList();
        List<String> asus = gerChekAsusList();

        writeToFile(widowsTen, usbFlashDriver, dellX, dellOd, asus, newFile);

        List<Product> products = new ArrayList<>();

        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(PATH_AND_NAME_OF_FILE));
            try {
                String line = bufferedReader.readLine();
                while (line != null) {
                    String[] productFields = line.split(", ");
                    Product product = new Product();
                    product.setName(productFields[0]);
                    Integer uniqueNumber = Integer.parseInt(productFields[1]);
                    product.setUniqueNumber(uniqueNumber);
                    Integer price = Integer.parseInt(productFields[2]);
                    product.setPrice(price);
                    Integer count = Integer.parseInt(productFields[3]);
                    product.setCount(count);
                    product.setProduction(productFields[4]);
                    products.add(product);
                    line = bufferedReader.readLine();
                }
            } catch (IOException e) {
                System.out.println(e.getMessage());
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        Optional<Product> productMinPrice = products.stream()
                .sorted(Comparator.comparing(Product::getPrice))
                .sorted()
                .findFirst();
        System.out.println(productMinPrice);

    }

    private void writeToFile(List<String> widowsTen, List<String> usbFlashDriver, List<String> dellX,
                             List<String> dellOd, List<String> asus, File newFile) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(newFile, true))) {
            for (String product : Arrays.asList(Arrays.toString(TEXT), String.valueOf(widowsTen),
                    String.valueOf(usbFlashDriver), String.valueOf(dellX), String.valueOf(dellOd),
                    String.valueOf(asus))) {
                writer.write(product);
                writer.newLine();
            }


        } catch (IOException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }

    private List<String> gerChekAsusList() {
        List<String> asus = Arrays.stream(ASUS).collect(Collectors.toList());
        for (int i = 0; i < asus.size(); i++) {
            if (asus.get(CHEK_THIRD_POSITION_IN_LIST).contains(" ")) {
                asus.remove(CHEK_THIRD_POSITION_IN_LIST);
            }
        }
        return asus;
    }

    private List<String> getChekDellOdList() {
        List<String> dellOd = Arrays.stream(DELL_OD_1).collect(Collectors.toList());
        for (int i = 0; i < dellOd.size(); i++) {
            if (dellOd.get(CHEK_THIRD_POSITION_IN_LIST).contains(" ")) {
                dellOd.remove(CHEK_THIRD_POSITION_IN_LIST);
            }
        }
        return dellOd;
    }

    private List<String> getChekDellXList() {
        List<String> dellX = Arrays.stream(DELL_X_01).collect(Collectors.toList());
        for (int i = 0; i < dellX.size(); i++) {
            if (dellX.get(CHEK_THIRD_POSITION_IN_LIST).contains(" ")) {
                dellX.remove(CHEK_THIRD_POSITION_IN_LIST);
            }
        }
        return dellX;
    }

    private List<String> getChekUabFlashDriver() {
        List<String> usbFlashDriver = Arrays.stream(USB_FLASH_DRIVER).collect(Collectors.toList());
        for (int i = 0; i < usbFlashDriver.size(); i++) {
            if (usbFlashDriver.get(CHEK_THIRD_POSITION_IN_LIST).contains(" ")) {
                usbFlashDriver.remove(CHEK_THIRD_POSITION_IN_LIST);
            }
        }
        return usbFlashDriver;
    }

    private List<String> getChekWindowsTheList() {
        List<String> widowsTen = Arrays.stream(WINDOWS_10).collect(Collectors.toList());
        for (int i = 0; i < widowsTen.size(); i++) {
            if (widowsTen.get(CHEK_THIRD_POSITION_IN_LIST).contains(" ")) {
                widowsTen.remove(CHEK_THIRD_POSITION_IN_LIST);
            }
        }
        return widowsTen;
    }


}

