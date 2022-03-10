package com.gmail.radzkovevgeni.model;

public class Track {
    private final String name;
    private final Integer length;

    public Track(String name, Integer length) {
        this.name = name;
        this.length = length;
    }

    public String getName() {
        return name;
    }

    public Integer getLength() {
        return length;
    }

    @Override
    public String toString() {
        return "Track{" +
                "name='" + name + '\'' +
                ", length='" + length + '\'' +
                '}';
    }
}
