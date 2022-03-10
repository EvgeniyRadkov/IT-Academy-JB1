package com.gmail.radzkovevgeni.service.impl;

import com.gmail.radzkovevgeni.model.Person;
import com.gmail.radzkovevgeni.service.RunningTaskService;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TaskTwoServiceImpl implements RunningTaskService {
    private static final Integer MINIMAL_AGE = 15;
    private static final Integer MAXIMUM_AGE = 30;
    private static final Integer DIFFERENCE_VALUE = MAXIMUM_AGE - MINIMAL_AGE + 1;
    private static final Integer AGE_OF_MAJORITY = 18;

    @Override
    public void runTaskOne() {
        System.out.println("\n__________TaskTwo__________");
        Person one = new Person("Ivan", "Ivanov");
        Person two = new Person("Tanya", "Ivanova");
        Person three = new Person("Sergei", "Sergeev");
        Person four = new Person("Sveta", "Sergeeva");
        Person five = new Person("Stepan", "Stepanov");
        Person six = new Person("Olga", "Stepanova");
        Person seven = new Person("Ivan", "Sidorov");
        Person eight = new Person("Katya", "Sidorova");
        Person nine = new Person("Petr", "Petrov");
        Person ten = new Person("Nadya", "Petrova");
        Person eleven = new Person("Oleg", "Orlov");
        Person twelve = new Person("Veronika", "Orlova");
        Person thirteen = new Person("Fedor", "Fedorov");
        Person fourteen = new Person("Yana", "Fedorova");
        Person fifteen = new Person("Kirill", "Kirilov");
        Person sixteen = new Person("Oksana", "Kirilova");
        Person seventeen = new Person("Viktor", "Viktorov");
        Person eighteen = new Person("Polina", "Viktorova");
        Person nineteen = new Person("Mikhail", "Medvedev");
        Person twenty = new Person("Nastya", "Medvedeva");

        List<Person> peoples = new ArrayList<>();
        peoples.add(one);
        peoples.add(two);
        peoples.add(three);
        peoples.add(four);
        peoples.add(five);
        peoples.add(six);
        peoples.add(seven);
        peoples.add(eight);
        peoples.add(nine);
        peoples.add(ten);
        peoples.add(eleven);
        peoples.add(twelve);
        peoples.add(thirteen);
        peoples.add(fourteen);
        peoples.add(fifteen);
        peoples.add(sixteen);
        peoples.add(seventeen);
        peoples.add(eighteen);
        peoples.add(nineteen);
        peoples.add(twenty);

        for (Person people : peoples) {
            Random random = new Random();
            Integer randomValue = random.nextInt(DIFFERENCE_VALUE) + MINIMAL_AGE;
            if (randomValue >= AGE_OF_MAJORITY) {
                people.setAge(randomValue);
                System.out.println("Adult: " + people + people.getAge());
            } else {
                people.setAge(randomValue);
                System.out.println("Infant: " + people + people.getAge());
            }
        }
    }
}
