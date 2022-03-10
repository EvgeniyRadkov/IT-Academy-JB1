package com.gmail.radzkovevgeni.service.impl;

import com.gmail.radzkovevgeni.model.TypeEnum;
import com.gmail.radzkovevgeni.repository.CreateListRepository;
import com.gmail.radzkovevgeni.service.RunTaskService;
import com.gmail.radzkovevgeni.service.TaskOneFactory;

public class RunOneTaskImpl implements RunTaskService {

    private static RunOneTaskImpl instance;

    private RunOneTaskImpl() {
    }

    public static RunOneTaskImpl getInstance() {
        if (instance == null) {
            instance = new RunOneTaskImpl();
        }
        return instance;
    }

    private final TaskOneFactory taskOneFactory = TaskOneFactoryImpl.getInstance();

    @Override
    public void runTask() {
        System.out.println("________Task One_______");

        CreateListRepository repository = taskOneFactory.createRepository(TypeEnum.LINKED_LIST);
        repository.createList();
        System.out.println(repository);
    }
}
