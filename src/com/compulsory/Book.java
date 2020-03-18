package com.compulsory;

public class Book implements Item {

    private String name;
    private int pageNumber;
    private double weight;
    private double value;

    public Book(String name, int pageNumber, double value) {
        this.name = name;
        this.pageNumber = pageNumber;
        this.value = value;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getValue() {
        return value;
    }

    @Override
    public double getWeight() {
        return weight=(double) pageNumber/100;
    }

    @Override
    public String toString() {
        return "Book: " +
                getName() +
                ", weight=" + getWeight() +
                ", value=" + getValue() +
                " (profit factor = " + profitFactor() +
                ")\n";
    }
}
