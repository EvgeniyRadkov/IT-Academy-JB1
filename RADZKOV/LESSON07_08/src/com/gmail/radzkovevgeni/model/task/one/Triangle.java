package com.gmail.radzkovevgeni.model.task.one;

public class Triangle extends Figure {
    private Integer sizeSideLegOne;
    private Integer sizeSideLegTwo;
    private Integer sizeSideHypotenuse;

    public Triangle(Integer sizeSideLegOne, Integer sizeSideLegTwo, Integer sizeSideHypotenuse) {
        this.sizeSideLegOne = sizeSideLegOne;
        this.sizeSideLegTwo = sizeSideLegTwo;
        this.sizeSideHypotenuse = sizeSideHypotenuse;
    }

    public Integer getSizeSideLegOne() {
        return sizeSideLegOne;
    }

    public void setSizeSideLegOne(Integer sizeSideLegOne) {
        this.sizeSideLegOne = sizeSideLegOne;
    }

    public Integer getSizeSideLegTwo() {
        return sizeSideLegTwo;
    }

    public void setSizeSideLegTwo(Integer sizeSideLegTwo) {
        this.sizeSideLegTwo = sizeSideLegTwo;
    }

    public Integer getSizeSideHypotenuse() {
        return sizeSideHypotenuse;
    }

    public void setSizeSideHypotenuse(Integer sizeSideHypotenuse) {
        this.sizeSideHypotenuse = sizeSideHypotenuse;
    }

    @Override
    public void printInformationAboutFigure() {
        System.out.print("Triangle perimeter: ");
    }

    @Override
    public double getPerimeter() {
        return sizeSideLegOne + sizeSideLegTwo + sizeSideHypotenuse;
    }
}
