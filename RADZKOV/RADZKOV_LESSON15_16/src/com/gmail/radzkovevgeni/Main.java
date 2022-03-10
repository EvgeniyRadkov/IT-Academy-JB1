package com.gmail.radzkovevgeni;

import com.gmail.radzkovevgeni.service.RunTaskThreeService;
import com.gmail.radzkovevgeni.service.RunTaskTwoService;
import com.gmail.radzkovevgeni.service.impl.RunTaskOneServiceImpl;
import com.gmail.radzkovevgeni.service.impl.RunTaskThreeServiceImpl;
import com.gmail.radzkovevgeni.service.impl.RunTaskTwoServiceImpl;

public class Main {

    public static void main(String[] args) {
        RunTaskOneServiceImpl taskOne = new RunTaskOneServiceImpl();
        taskOne.runTaskOne();
        RunTaskTwoService taskTwo = new RunTaskTwoServiceImpl();
        taskTwo.runTaskTwo();
        RunTaskThreeService taskThree = new RunTaskThreeServiceImpl();
        taskThree.runTaskThree();

    }
}

