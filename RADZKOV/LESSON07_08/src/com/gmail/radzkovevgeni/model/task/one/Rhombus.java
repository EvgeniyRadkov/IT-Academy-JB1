package com.gmail.radzkovevgeni.model.task.one;

public class Rhombus extends Figure {
    private Integer sizeSideRhombus;

    public Rhombus(Integer sizeSideRhombus) {
        this.sizeSideRhombus = sizeSideRhombus;
    }

    public Integer getSizeSideRhombus() {
        return sizeSideRhombus;
    }

    public void setSizeSideRhombus(Integer sizeSideRhombus) {
        this.sizeSideRhombus = sizeSideRhombus;
    }

    @Override
    public void printInformationAboutFigure() {
        System.out.print("Rhombus perimeter: ");
    }

    @Override
    public double getPerimeter() {
        return 4 * sizeSideRhombus;
    }
}
