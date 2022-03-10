package com.gmail.radzkovevgeni.service;

import com.gmail.radzkovevgeni.model.TypeEnum;
import com.gmail.radzkovevgeni.repository.CreateListRepository;

public interface TaskOneFactory {
    CreateListRepository createRepository(TypeEnum type);
}
