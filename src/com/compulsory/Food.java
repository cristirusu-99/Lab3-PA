package com.compulsory;

public class Food implements Item{

    private String name;
    private double weight;
    private double value;

    public Food(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getValue() {
        return value = weight*2;
    }

    @Override
    public double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Food: " +
                getName() +
                ", weight=" + getWeight() +
                ", value=" + getValue() +
                " (profit factor = " + profitFactor() +
                ")\n";
    }
}
