package com.gmail.radzkovevgeni.repository;

import com.gmail.radzkovevgeni.model.Person;

import java.util.List;

public interface RandomPersonRepository {

    List<Person> getPerson(int sizeOfArray);
}
