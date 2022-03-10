package com.gmail.radzkovevgeni.model.task.three;

import org.w3c.dom.ls.LSOutput;

public class WorkerWitMonthlyRate extends Worker {
    private Integer daysWorked;
    private static final Integer SUM_DAILY_RATE = 15;

    public WorkerWitMonthlyRate(Integer daysWorked) {
        this.daysWorked = daysWorked;
    }

    public Integer getDaysWorked() {
        return daysWorked;
    }

    public void setDaysWorked(Integer daysWorked) {
        this.daysWorked = daysWorked;
    }

    @Override
    public String toString() {
        return "Worker Wit Monthly Rate: " +  super.toString();
    }

    @Override
    public double getSalary() {
        return daysWorked * SUM_DAILY_RATE;
    }


}
