package com.company;

public class Food {
    private String name;
    private double price;
    private String description;
    private int calories;

    public Food(String name, double price, String description, int calories) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.calories = calories;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public int getCalories() {
        return calories;
    }
}
