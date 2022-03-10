package com.gmail.radzkovevgeni.model.task.two;

public class EnglandAutomobile extends Automobile {
    private Integer ratingAuto;
    private static final String COUNTRY_OF_AUTO_PRODUCTION = "England";

    public EnglandAutomobile(Integer ratingAuto) {
        this.ratingAuto = ratingAuto;
    }

    public int getRatingAuto() {
        return ratingAuto;
    }

    public void setRatingAuto(Integer ratingAuto) {
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
