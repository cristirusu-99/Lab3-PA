package com.compulsory;

import com.compulsory.comparators.SortByName;
import com.compulsory.comparators.SortByProfit;
import com.compulsory.comparators.SortByValue;

public class Main {

    public static void main(String[] args) {
        SortByName sortByName = new SortByName();
        SortByProfit sortByProfit = new SortByProfit();
        SortByValue sortByValue = new SortByValue();
        Knapsack knapsack = new Knapsack(10);
        Weapon weapon = new Weapon(Weapon.weaponType.Sword, 5, 100);
        knapsack.addItem(weapon);
        Food food1 = new Food("Cabbage", 2);
        knapsack.addItem(food1);
        Food food2 = new Food("Rabbit", 2);
        knapsack.addItem(food2);
        Book book1 = new Book("Dragon Rising", 300, 5);
        knapsack.addItem(book1);
        Book book2 = new Book("A Blade in the Dark", 320, 5);
        knapsack.addItem(book2);
        System.out.println(knapsack);
        knapsack.sortItems(sortByName);
        System.out.println(knapsack);
        knapsack.sortItems(sortByValue);
        System.out.println(knapsack);
        knapsack.sortItems(sortByProfit);
        System.out.println(knapsack);


    }
}
