package com.gmail.radzkovevgeni.model.task.one;

public class Square extends Figure {
    private Integer sizeSideSquare;

    public Square(Integer sizeSideSquare) {
        this.sizeSideSquare = sizeSideSquare;
    }

    public Integer getSizeSideSquare() {
        return sizeSideSquare;
    }

    public void setSizeSideSquare(Integer sizeSideSquare) {
        this.sizeSideSquare = sizeSideSquare;
    }

    @Override
    public void printInformationAboutFigure() {
        System.out.print("Square perimeter: ");

    }

    @Override
    public double getPerimeter() {
        return 4 * sizeSideSquare;
    }
}
