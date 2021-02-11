package com.company;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import java.util.ArrayList;
import java.util.List;

@JacksonXmlRootElement(localName = "breakfast_menu")
public class BreakfestMenu {
    @JacksonXmlProperty(localName = "food")
    @JacksonXmlElementWrapper(useWrapping = false)
    private List<FoodDto> foods = new ArrayList<>();

    public List<FoodDto> getFoods() {
        return foods;
    }

    public void setFoods(List<FoodDto> foods) {
        this.foods = foods;
    }
}
