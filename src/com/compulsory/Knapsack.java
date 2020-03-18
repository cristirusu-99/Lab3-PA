package com.compulsory;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Knapsack {
    private double capacity;
    private List<Item> items = new ArrayList<>();

    public Knapsack(double capacity) {
        this.capacity = capacity;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public void addItem(Item item){
        this.items.add(item);
    }

    public void addItems(List<Item> items){
        this.items.addAll(items);
    }

    public void sortItems(Comparator<Item> itemComparator){
        Collections.sort(items, itemComparator);
    }

    @Override
    public String toString() {
        return "Knapsack{" +
                "capacity =" + capacity +
                "\navailable items:\n" + items +
                '}';
    }
}
