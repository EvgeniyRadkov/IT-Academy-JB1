package com.gmail.radzkovevgeni.model.task.two;

public class RussianAutomobile extends Automobile {
    private int ratingAuto;
    private static final String COUNTRY_OF_AUTO_PRODUCTION = "Russia";

    public RussianAutomobile(int ratingAuto) {
        this.ratingAuto = ratingAuto;
    }

    public int getRatingAuto() {
        return ratingAuto;
    }

    public void setRatingAuto(int ratingAuto) {
        this.ratingAuto = ratingAuto;
    }

    @Override
    public String getDescription() {
        return (super.getDescription() + COUNTRY_OF_AUTO_PRODUCTION);
    }

    @Override
    public int getRate() {
        return ratingAuto;
    }
}
