package com.gmail.radzkovevgeni.model.task.one;

import static java.lang.Math.*;

public class Circle extends Figure {
    private Integer sizeRadius;

    public Circle(Integer sizeRadius) {
        this.sizeRadius = sizeRadius;
    }

    public Integer getSizeRadius() {
        return sizeRadius;
    }

    public void setSizeRadius(Integer sizeRadius) {
        this.sizeRadius = sizeRadius;
    }

    @Override
    public void printInformationAboutFigure() {
        System.out.print("Circle perimeter: ");
    }

    @Override
    public double getPerimeter() {
        return 2 * sizeRadius * PI;
    }
}
