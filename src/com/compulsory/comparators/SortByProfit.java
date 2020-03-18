package com.compulsory.comparators;

import com.compulsory.Item;

import java.util.Comparator;

public class SortByProfit implements Comparator<Item> {
    @Override
    public int compare(Item item, Item t1) {
        return (int)(item.profitFactor()*100) - (int)(t1.profitFactor()*100);
    }
}
