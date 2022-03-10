package com.gmail.radzkovevgeni.service.impl;

import com.gmail.radzkovevgeni.model.TypeEnum;
import com.gmail.radzkovevgeni.repository.CreateListRepository;
import com.gmail.radzkovevgeni.repository.impl.ArrayListRepositoryImpl;
import com.gmail.radzkovevgeni.repository.impl.LinkedListRepositoryImpl;
import com.gmail.radzkovevgeni.service.TaskOneFactory;

public class TaskOneFactoryImpl implements TaskOneFactory {

    private static TaskOneFactoryImpl instance;

    private TaskOneFactoryImpl() {
    }

    public static TaskOneFactoryImpl getInstance() {
        if (instance == null) {
            instance = new TaskOneFactoryImpl();
        }
        return instance;
    }

    @Override
    public CreateListRepository createRepository(TypeEnum type) {
        switch (type) {
            case ARRAY_LIST:
                return ArrayListRepositoryImpl.getInstance();
            case LINKED_LIST:
                return LinkedListRepositoryImpl.getInstance();
            default:
                throw new IllegalArgumentException("Repository for type " + type + " does not exist!");
        }
    }
}