package com.gmail.radzkovevgeni.model.task.one;

public class Rectangle extends Figure {
    private Integer sideHeight;
    private Integer sideWidth;

    public Rectangle(Integer sideHeight, Integer sideWidth) {
        this.sideHeight = sideHeight;
        this.sideWidth = sideWidth;
    }

    public Integer getSideHeight() {
        return sideHeight;
    }

    public void setSideHeight(Integer sideHeight) {
        this.sideHeight = sideHeight;
    }

    public Integer getSideWidth() {
        return sideWidth;
    }

    public void setSideWidth(Integer sideWidth) {
        this.sideWidth = sideWidth;
    }

    @Override
    public void printInformationAboutFigure() {
        System.out.print("Rectangle perimeter: ");
    }

    @Override
    public double getPerimeter() {
        return 2 * (sideHeight + sideWidth);
    }
}
