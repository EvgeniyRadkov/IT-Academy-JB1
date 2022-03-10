package com.gmail.radzkovevgeni.service.impl;

import com.gmail.radzkovevgeni.model.task.one.*;
import com.gmail.radzkovevgeni.service.TaskService;

public class TaskOneServiceImpl implements TaskService {
    @Override
    public void runTask() {

        Figure figureOne = new Triangle(4,5,6);
        Figure figureTwo = new Square(6);
        Figure figureThree = new Rectangle(8,3);
        Figure figureFour = new Circle(7);
        Figure figureFive = new Rhombus(9);

        System.out.println("-------------------------Task One-------------------------");
        System.out.println("                    Perimeters of figures            ");

        Figure[] figures = {figureOne, figureTwo, figureThree, figureFour, figureFive};
        for (Figure figure : figures) {
            figure.printInformationAboutFigure();
            System.out.println(figure.getPerimeter());
        }
        System.out.println();
    }
}
