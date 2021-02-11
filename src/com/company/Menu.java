package com.company;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    private List<Food> foods = new ArrayList<>();

    public Menu(List<Food> foods) {
        this.foods = foods;
    }

    public List<Food> getFoods() {
        return foods;
    }
}
