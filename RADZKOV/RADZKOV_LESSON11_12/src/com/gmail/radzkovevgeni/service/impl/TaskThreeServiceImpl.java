package com.gmail.radzkovevgeni.service.impl;

import com.gmail.radzkovevgeni.model.Person;
import com.gmail.radzkovevgeni.service.RandomService;
import com.gmail.radzkovevgeni.service.RunTaskThreeService;

import java.util.HashSet;
import java.util.Set;

public class TaskThreeServiceImpl implements RunTaskThreeService {
    private static final Integer NUMBER_OF_UNIQUE_PEOPLE = 10;
    private static final Integer AGE_OF_MAJORITY = 18;

    RandomService randomService = new RandomService();

    @Override
    public void runTaskThree() throws Exception {
        System.out.println('\n' + "___________Task Three_________");

        Set<Person> personSet = uniquePeopleSet();
        for (Person person : personSet) {
            if (person.getAge() < AGE_OF_MAJORITY) {
                throw new Exception("Current persons age is Less than 18 year limit: " + person.toString());
            }
            System.out.println("Here is persons data: " + person.toString());
        }
    }

    private Set<Person> uniquePeopleSet() {
        Set<Person> person = new HashSet<>(NUMBER_OF_UNIQUE_PEOPLE);
        for (int i = 0; i < NUMBER_OF_UNIQUE_PEOPLE; i++) {
            person.add(creationRandomPerson());
        }
        return person;
    }

    private Person creationRandomPerson() {
        Person person = new Person();
        person.setName(randomService.getRandomFirstName());
        person.setSurname(randomService.getRandomSurName());
        person.setAge(randomService.getRandomAge());
        return person;
    }
}
