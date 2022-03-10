package com.gmail.radzkovevgeni.service.impl;

import com.gmail.radzkovevgeni.service.RunTaskTwoService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TaskTwoServiceImpl implements RunTaskTwoService {
    private String key;
    private String value;

    @Override
    public void runTaskTwo() {
        System.out.println('\n' + "__________Task Two__________");

        Map<String, String> stringMap = new HashMap<>();
        addStringInMap(stringMap);

        List<String> keyList = new ArrayList<>(stringMap.keySet());
        Integer maxKeyLenght = keyList.get(0).length();
        String maxKeyName = keyList.get(0);
        for (String currentKey : keyList) {
            if (currentKey.length() > maxKeyLenght) {
                maxKeyLenght = currentKey.length();
                maxKeyName = currentKey;
            }
        }

        List<String> valueList = new ArrayList<>(stringMap.values());
        Integer minValueLenght = valueList.get(0).length();
        String minValueName = valueList.get(0);
        for (String currentValue : valueList) {
            if (currentValue.length() < minValueLenght) {
                minValueLenght = currentValue.length();
                minValueName = currentValue;
            }
        }

        System.out.println("General list of keys: ");
        for (Map.Entry<String, String> entry : stringMap.entrySet()) {
            System.out.println(entry.getKey());
        }

        System.out.println("The maximum key is long  - " + maxKeyLenght + ", this is the key - " + maxKeyName);
        System.out.println("The minimum value is long  - " + minValueLenght + ", this is the value - " + minValueName);

    }

    private void addStringInMap(Map<String, String> stringMap) {
        stringMap.put("won", "854");
        stringMap.put("zar", "15");
        stringMap.put("value", "z");
        stringMap.put("implements", "112");
        stringMap.put("computer", "asus");
        stringMap.put("house", "building");
        stringMap.put("telephone", "huawei");
        stringMap.put("lesson", "98542");
        stringMap.put("human", "people");
        stringMap.put("woman", "woman");
    }
}
