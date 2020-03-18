package com.compulsory.comparators;

import com.compulsory.Item;

import java.util.Comparator;

public class SortByName implements Comparator<Item> {
    @Override
    public int compare(Item item, Item t1) {
        return item.getName().compareTo(t1.getName());
    }
}
