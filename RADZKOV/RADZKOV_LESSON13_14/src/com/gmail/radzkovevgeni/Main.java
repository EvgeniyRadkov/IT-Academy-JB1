package com.gmail.radzkovevgeni;

import com.gmail.radzkovevgeni.service.impl.RunTaskOneServiceImpl;
import com.gmail.radzkovevgeni.service.impl.RunTaskThreeServiceImpl;
import com.gmail.radzkovevgeni.service.impl.RunTaskTwoServiceImpl;

public class Main {

    public static void main(String[] args) {
        RunTaskOneServiceImpl runTaskOneService =  new RunTaskOneServiceImpl();
        runTaskOneService.runTaskOne();
        RunTaskTwoServiceImpl runTaskTwoService = new RunTaskTwoServiceImpl();
        runTaskTwoService.runTaskTwo();
        RunTaskThreeServiceImpl runTaskThreeService = new RunTaskThreeServiceImpl();
        runTaskThreeService.runTaskThree();
    }
}
