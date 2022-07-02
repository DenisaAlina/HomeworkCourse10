package com.fasttrack.exercise2;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("Dahlia");
        set.add("Carnation");
        set.add("Hyacinth");
        set.add("Lily");
        set.add("Peony");
        set.add("Orchid");
        set.add("Lilac");
        set.add("Tulip");
        set.add("Hydrangea");
        set.add("Rose");
        Bouquet bouquet = new Bouquet(set);
        System.out.println(bouquet.getAll());
        bouquet.add("Poppy");
        System.out.println(bouquet);
        bouquet.remove("Carnation");
        System.out.println(bouquet);
    }
}
