package com.gmail.radzkovevgeni.service.impl;

import com.gmail.radzkovevgeni.model.task.three.*;
import com.gmail.radzkovevgeni.service.TaskService;

public class TaskThreeServiceImpl implements TaskService {
    @Override
    public void runTask() {
        Worker workerOne = new WorkerWitMonthlyRate(22);
        firstWorker(workerOne);

        Worker workerTwo = new WorkerWitMonthlyRate(18);
        secondWorker(workerTwo);

        Worker workerThree = new WorkerWithHourlyRate(145.2);
        thirdWorker(workerThree);

        Worker workerFour = new WorkerWithHourlyRate(120.0);
        fourthWorker(workerFour);

        Worker workerFive = new WorkerWithHourlyRate(100.0);
        fifthWorker(workerFive);

        Worker workerSix = new WorkerWithPieceRate(2784.21);
        sixthWorker(workerSix);

        Worker workerSeven = new WorkerWithPieceRate(1587.15);
        seventhWorker(workerSeven);

        Worker workerEight = new WorkerWithPieceRate(3584.79);
        eighthWorker(workerEight);

        Worker workerNine = new WorkerWithMontlyAndPieceRate(15, 1574.13);
        ninethWorker(workerNine);

        Worker workerTen = new WorkerWithMontlyAndPieceRate(12, 2458.51);
        tenthWorker(workerTen);

        System.out.println("-------------------------Task Three-------------------------");
        System.out.println("                         Payroll            ");

        Worker[] workers = {workerOne, workerTwo, workerThree, workerFour,
                workerFive, workerSix, workerSeven,
                workerEight, workerNine, workerTen};
        for (Worker worker : workers) {
            System.out.println(worker.toString());
            System.out.print("To be issued as a salary: ");
            System.out.println(worker.getSalary());
        }


    }

    private void tenthWorker(Worker workerTen) {
        workerTen.setName("Victor");
        workerTen.setSecondName("Sidorov");
        workerTen.setPosition("Deputy head of department");
        workerTen.setDepartment("Sales Department");
    }

    private void ninethWorker(Worker workerNine) {
        workerNine.setName("Vlad");
        workerNine.setSecondName("Smirnov");
        workerNine.setPosition("Chief of department");
        workerNine.setDepartment("Sales Department");
    }

    private void eighthWorker(Worker workerEight) {
        workerEight.setName("Olga");
        workerEight.setSecondName("Sergeeva");
        workerEight.setPosition("Seller");
        workerEight.setDepartment("Sales Department");
    }

    private void seventhWorker(Worker workerSeven) {
        workerSeven.setName("Sergei");
        workerSeven.setSecondName("Sergeev");
        workerSeven.setPosition("Seller");
        workerSeven.setDepartment("Sales Department");
    }

    private void sixthWorker(Worker workerSix) {
        workerSix.setName("Karolina");
        workerSix.setSecondName("Sprinter");
        workerSix.setPosition("Seller");
        workerSix.setDepartment("Sales Department");
    }

    private void fifthWorker(Worker workerFive) {
        workerFive.setName("July");
        workerFive.setSecondName("Sprinter");
        workerFive.setPosition("Trainee");
        workerFive.setDepartment("Lower Department");
    }

    private void fourthWorker(Worker workerFour) {
        workerFour.setName("Joe");
        workerFour.setSecondName("White");
        workerFour.setPosition("Lawyer");
        workerFour.setDepartment("Lower Department");
    }

    private void thirdWorker(Worker workerThree) {
        workerThree.setName("Joe");
        workerThree.setSecondName("Black");
        workerThree.setPosition("Chief Lawyer");
        workerThree.setDepartment("Lower Department");
    }

    private void secondWorker(Worker workerTwo) {
        workerTwo.setName("Linda");
        workerTwo.setSecondName("Jackoof");
        workerTwo.setPosition("Manager");
        workerTwo.setDepartment("Top manager Department");
    }

    private void firstWorker(Worker workerOne) {
        workerOne.setName("Jack");
        workerOne.setSecondName("Jackoof");
        workerOne.setPosition("Boss");
        workerOne.setDepartment("Top manager Department");
    }
}
