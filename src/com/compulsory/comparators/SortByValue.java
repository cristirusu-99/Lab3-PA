package com.compulsory.comparators;

import com.compulsory.Item;

import java.util.Comparator;

public class SortByValue implements Comparator<Item> {
    @Override
    public int compare(Item item, Item t1) {
        return (int) (item.getValue()-t1.getValue());
    }
}
