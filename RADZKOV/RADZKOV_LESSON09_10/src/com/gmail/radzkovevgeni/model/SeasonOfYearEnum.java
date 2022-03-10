package com.gmail.radzkovevgeni.model;

public enum SeasonOfYearEnum {
    Winter("Cold season", 90),
    Spring("Warm season", 92),
    Summer("Hot season", 91),
    Autumn("Rainy season", 92);

    private String description;
    private Integer countOfDay;

    SeasonOfYearEnum(String description, Integer countOfDay) {
        this.description = description;
        this.countOfDay = countOfDay;
    }

    public String getDescription() {
        return description;
    }

    public Integer getCountOfDay() {
        return countOfDay;
    }

    @Override
    public String toString() {
        return "description = " + description +
                ", countOfDay = " + countOfDay;
    }

}
