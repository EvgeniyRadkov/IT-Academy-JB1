package com.gmail.radzkovevgeni.repository.impl;

import com.gmail.radzkovevgeni.model.Person;
import com.gmail.radzkovevgeni.repository.RandomPersonRepository;

import java.util.*;

public class RandomPersonRepositoryImpl implements RandomPersonRepository {

    private static final Integer MIN_OF_AGE = 15;
    private static final Integer MAX_OF_AGE = 30;

    private static final String[] randomFirstName = {"Nick", "Jack", "Joe", "Liza", "Kate", "Eva", "Emily",
            "Hannah", "Kaitlyn", "Sarah", "Madison", "Michael", "James", "Matthew", "Nicholas", "Christopher",
            "Brianna", "Kaylee", "Hailey", "Alexis", "Elizabeth", "Joseph", "Zachary", "Joshua", "Andrew", "William",
            "Taylor", "Lauren", "Ashley", "Katherine", "Jessica", "Daniel", "Christian", "Tyler", "Ryan", "Anthony",
            "Anna", "Samantha", "Alissa", "Kayla", "Madeline", "Alexander", "Jonathan", "David", "Dylan", "Jacob"};
    private static final String[] randomSurname = {"Smith", "Johnson", "Williams", "Brown", "Jones", "Miller", "Davis", "Garcia",
            "Rodriguez", "Wilson", "Martinez", "Anderson", "Taylor", "Thomas", "Hernandez", "Moore", "Martin", "Jackson",
            "Thompson", "White", "Lopez", "Lee", "Gonzalez", "Harris", "Clark", "Lewis", "Robinson", "Walker", "Perez",
            "Hall", "Young", "Allen", "Sanchez", "Wright", "King", "Scott", "Green", "Baker", "Adams", "Nelson"};

    private final Random random = new Random();

    @Override
    public List<Person> getPerson(int sizeOfArray) {
        List<Person> persons = new ArrayList<>();
        for (int i = 0; i < sizeOfArray; i++) {
            Person person = new Person();
            person.setName(getRandomFirstName());
            person.setSurname(getRandomSurname());
            person.setAge(getRandomAge());
            persons.add(person);
        }
        return persons;

    }

    public String getRandomFirstName() {
        int randomValueOfFirstName = random.nextInt(randomFirstName.length);
        return randomFirstName[randomValueOfFirstName];
    }

    public String getRandomSurname() {
        int randomValueSurname = random.nextInt(randomSurname.length);
        return randomSurname[randomValueSurname];
    }

    public Integer getRandomAge() {
        Integer differanceOfAge = MAX_OF_AGE - MIN_OF_AGE + 1;
        return random.nextInt(differanceOfAge) + MIN_OF_AGE;
    }
}
