package com.gmail.radzkovevgeni.model.task.three;

public abstract class Worker {
    private String name;
    private String secondName;
    private String position;
    private String department;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return name + " " + secondName
                + ", " + position
                + ", " + department;
    }

    public abstract double getSalary();
}
