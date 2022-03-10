package com.gmail.radzkovevgeni.service.impl;

import com.gmail.radzkovevgeni.model.Person;
import com.gmail.radzkovevgeni.repository.utilites.RandomUtil;
import com.gmail.radzkovevgeni.service.RunTaskService;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class RunTwoTaskImpl implements RunTaskService {
    private static final String[] NAME = {"Julia", "Franck", "Sergei", "Ivan", "Luk",
            "Bob", "Ilya", "Oleg", "Kate", "Olivia"};
    private static final String[] SURNAME = {"Smith", "Ivanov", "Sidorov", "Black", "Green",
            "Kazak", "Miller", "Popov"};
    private static final int YEAR_FROM = 1950;
    private static final int YEAR_TO = 2021;
    private static final int NUMBERS_OF_OBJECTS_TO_BE_CREATED = 10;

    private final RandomUtil random = new RandomUtil();
    private static RunTwoTaskImpl instance;

    private RunTwoTaskImpl() {
    }

    public static RunTwoTaskImpl getInstance() {
        if (instance == null) {
            instance = new RunTwoTaskImpl();
        }
        return instance;
    }

    @Override
    public void runTask() {
        System.out.println('\n');
        System.out.println("_______Task Two_______");

        List<Person> personList = getPersonList();
        List<Person> sortedPersonList = personList.stream()
                .sorted(Comparator.comparing(Person::getYearOfBirth))
                .collect(Collectors.toList());
        showInfo(sortedPersonList);
    }

    private void showInfo(List<Person> personList) {
        personList.forEach(person -> System.out.println(person.getSurname() + " " + person.getName()));

    }

    private List<Person> getPersonList() {
        List<Person> personList = new ArrayList<>();
        for (int i = 0; i < NUMBERS_OF_OBJECTS_TO_BE_CREATED; i++) {
            Person person = Person.newBuilder()
                    .withName(random.getRandomName(NAME))
                    .withSurname(random.getRandomName(SURNAME))
                    .withYearOfBirth(random.getRandomNumber(YEAR_FROM, YEAR_TO))
                    .build();
            personList.add(person);
        }
        return personList;
    }

}

