package com.gmail.radzkovevgeni.task.three.model;

public class Product {
    private String name;
    private Integer uniqueNumber;
    private Integer price;
    private Integer count;
    private String production;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getUniqueNumber() {
        return uniqueNumber;
    }

    public void setUniqueNumber(Integer uniqueNumber) {
        this.uniqueNumber = uniqueNumber;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public String getProduction() {
        return production;
    }

    public void setProduction(String production) {
        this.production = production;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", uniqueNumber=" + uniqueNumber +
                ", price=" + price +
                ", count=" + count +
                ", production='" + production + '\'' +
                '}';
    }
}
