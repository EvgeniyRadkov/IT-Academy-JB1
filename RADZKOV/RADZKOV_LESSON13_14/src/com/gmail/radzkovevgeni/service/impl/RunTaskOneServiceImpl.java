package com.gmail.radzkovevgeni.service.impl;

import com.gmail.radzkovevgeni.model.Person;
import com.gmail.radzkovevgeni.repository.impl.RandomPersonRepositoryImpl;
import com.gmail.radzkovevgeni.service.RunTaskOneService;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class RunTaskOneServiceImpl implements RunTaskOneService {

    private static final Integer SIZE_OF_A_GROUP_PEOPLE = 100;
    public static final int SIZE_OF_AGE = 21;

    private final RandomPersonRepositoryImpl randomPersonRepository = new RandomPersonRepositoryImpl();

    @Override
    public void runTaskOne() {
        System.out.println("___________Task one_____________");

        System.out.println('\n' + "___list of people under the age of 21___");

        List<Person> persons = randomPersonRepository.getPerson(SIZE_OF_A_GROUP_PEOPLE);
        persons.stream()
                .filter(p -> p.getAge() < SIZE_OF_AGE)
                .forEach(System.out::println);

        System.out.println('\n' + "______The first 4 people from the spike sorted by surname");

        persons.stream()
                .sorted(Comparator.comparing(Person::getSurname)
                        .thenComparing(Person::getName))
                .limit(4)
                .map(Person::getSurname)
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }
}


