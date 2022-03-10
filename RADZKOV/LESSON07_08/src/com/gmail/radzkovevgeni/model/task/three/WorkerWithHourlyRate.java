package com.gmail.radzkovevgeni.model.task.three;

public class WorkerWithHourlyRate extends Worker {
    private Double hourWorked;
    private static final Double SUN_HOURLY_RATE = 2.5;

    public WorkerWithHourlyRate(Double hourWorked) {
        this.hourWorked = hourWorked;
    }

    public Double getHourWorked() {
        return hourWorked;
    }

    public void setHourWorked(Double hourWorked) {
        this.hourWorked = hourWorked;
    }

    @Override
    public String toString() {
        return "Worker With Hourly Rate: " + super.toString();
    }

    @Override
    public double getSalary() {
        return hourWorked * SUN_HOURLY_RATE;
    }
}