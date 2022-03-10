package com.gmail.radzkovevgeni.model.task.three;

public class WorkerWithPieceRate extends Worker {
    private Double valumeOFSales;
    private static final Double PERCENTAGE_OF_SALES = 0.6;

    public WorkerWithPieceRate(Double valumeOFSales) {
        this.valumeOFSales = valumeOFSales;
    }

    public Double getValumeOFSales() {
        return valumeOFSales;
    }

    public void setValumeOFSales(Double valumeOFSales) {
        this.valumeOFSales = valumeOFSales;
    }

    @Override
    public String toString() {
        return "Worker With Piece Rate: " + super.toString();
    }

    @Override
    public double getSalary() {
        return valumeOFSales * PERCENTAGE_OF_SALES;
    }
}
