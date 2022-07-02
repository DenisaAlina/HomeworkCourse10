package com.fasttrack.exercise1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class Basket {
    private ArrayList<String> basket;

    public Basket(ArrayList<String> basket) {
        this.basket = basket;
    }

    @Override
    public String toString() {
        return "Basket{" +
                "basket=" + basket +
                '}';
    }

    public boolean find(String fruit) {
        boolean b = false;
        for (String string : basket) {
            if (fruit.equals(string)) {
                b = true;
            }
        }
        return b;
    }

    public boolean remove(String fruit) {
        boolean b = false;
        for (int i = 0; i < basket.size(); i++) {
            if (fruit.equals(basket.get(i))) {
                b = true;
                basket.remove(i);
            }
        }
        return b;
    }

    public int position(String fruit) {
        int position = -1;
        for (int i = 0; i < basket.size(); i++) {

            if (fruit.equals(basket.get(i))) {
                position = i;
            }
        }
        if (position == -1) {
            System.out.println("The received fruit is not in the basket");
        }
        return position;
    }

    public Collection<String> distinct() {
        Set<String> set = new HashSet<>(basket);
        return set;
    }

    public void add(String fruit) {
        basket.add(fruit);
    }

    public int count() {
        return basket.size();
    }

    public int customCount() {
        int counter = 0;
        for (String string : basket) {
            counter++;
        }
        return counter;
    }
}
