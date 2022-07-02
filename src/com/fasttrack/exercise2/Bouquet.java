package com.fasttrack.exercise2;

import java.util.Set;

public class Bouquet {
    private Set<String> bouquet;

    public Bouquet(Set<String> bouquet) {
        this.bouquet = bouquet;
    }

    public Set<String> getAll() {
        return bouquet;
    }

    @Override
    public String toString() {
        return "Bouquet{" +
                "bouquet=" + bouquet +
                '}';
    }

    public void add(String flower) {
        bouquet.add(flower);
    }

    public void remove(String flower) {
        bouquet.remove(flower);
    }

}
