package com.gmail.radzkovevgeni;

import com.gmail.radzkovevgeni.service.RunTaskService;
import com.gmail.radzkovevgeni.service.impl.RunTaskHistoryServiceImpl;
import com.gmail.radzkovevgeni.service.impl.RunTaskRoadRestrictionServiceImpl;
import com.gmail.radzkovevgeni.service.impl.RunTaskTopCustomersServiceImpl;
import com.gmail.radzkovevgeni.service.impl.RunTaskTrafficRestrictionCustomerServiceImpl;

public class Main {

    public static void main(String[] args) {
        RunTaskService[] taskService = {RunTaskRoadRestrictionServiceImpl.getInstance(),
                RunTaskTrafficRestrictionCustomerServiceImpl.getInstance(),
                RunTaskTopCustomersServiceImpl.getInstance(),
                RunTaskHistoryServiceImpl.getInstance()
        };

        for (RunTaskService runTaskService : taskService) {
            runTaskService.runTask();
        }
    }
}
