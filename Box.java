package org.example;

import java.util.ArrayList;
import java.util.List;

public class Box<B extends Fruit> {
    private List<B> fruits;
    private int weight;

    public Box() {
        this.fruits = new ArrayList<>();
    }

    public int getWeight() {
        int sum = 0;
        for (Fruit e : fruits) {
            sum += e.getWeight();
        }
        return sum;
    }

    public void add(B x) {
        fruits.add(x);
    }

    public void move(Box<B> another) {
        if (this != another) {
            this.fruits.addAll(another.fruits);
            another.fruits.clear();
        } else System.out.println("Одинаковые коробки ");
    }
}


