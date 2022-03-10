package com.gmail.radzkovevgeni.model.task.three;

public class WorkerWithMontlyAndPieceRate extends Worker {
    private Integer daysWorked;
    private Double valumeOfSales;
    private static final Integer BASIC_MONTLY_RATE = 10;
    private static final Double PERCENTAGE_OF_SALES = 0.15;

    public WorkerWithMontlyAndPieceRate(Integer daysWorked, Double valumeOfSales) {
        this.daysWorked = daysWorked;
        this.valumeOfSales = valumeOfSales;
    }

    public Integer getDaysWorked() {
        return daysWorked;
    }

    public void setDaysWorked(Integer daysWorked) {
        this.daysWorked = daysWorked;
    }

    public Double getValumeOfSales() {
        return valumeOfSales;
    }

    public void setValumeOfSales(Double valumeOfSales) {
        this.valumeOfSales = valumeOfSales;
    }

    @Override
    public String toString() {
        return "Worker With Montly And Piece Rate: " + super.toString();
    }

    @Override
    public double getSalary() {
        return daysWorked * BASIC_MONTLY_RATE + valumeOfSales * PERCENTAGE_OF_SALES;
    }
}
