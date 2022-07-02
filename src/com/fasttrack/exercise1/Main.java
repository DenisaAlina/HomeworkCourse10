package com.fasttrack.exercise1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> fruitBasket = new ArrayList<>();
        fruitBasket.add("apple");
        fruitBasket.add("banana");
        fruitBasket.add("peach");
        fruitBasket.add("kiwi");
        fruitBasket.add("peach");
        fruitBasket.add("grapes");
        fruitBasket.add("strawberry");
        fruitBasket.add("pear");
        fruitBasket.add("lemon");
        fruitBasket.add("peach");
        fruitBasket.add("pineapple");
        Basket basket = new Basket(fruitBasket);
        System.out.println(basket.find("watermelon"));
        System.out.println(basket.remove("pear"));
        System.out.println(basket);
        System.out.println(basket.position("pear"));
        System.out.println((basket.distinct()).toString());
        System.out.println(basket);
        basket.add("mango");
        basket.add("orange");
        System.out.println(basket);
        System.out.println(basket.count());
        System.out.println(basket.customCount());


    }
}
