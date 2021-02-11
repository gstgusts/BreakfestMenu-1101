package com.company;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator;

import java.io.File;
import java.io.IOException;
import java.util.stream.Collectors;

public class MenuManager {

    private static final String FILE_PATH = "src/com/company/menu.xml";

    public Menu getMenu() {
        var result = load();

        var foods = result.getFoods()
                .stream()
                .map(f -> new Food(f.getName(), getDouble(f.getPrice()), f.getDescription(), f.getCalories()))
                .collect(Collectors.toList());

        var menu = new Menu(foods);
        return menu;
    }

    public void saveMenu(Menu menu) {
        var bm = new BreakfestMenu();

        var result = menu.getFoods()
                .stream()
                .map(f -> new FoodDto(f.getName(), getPrice(f.getPrice()), f.getDescription(), f.getCalories()))
                .collect(Collectors.toList());

        bm.setFoods(result);

        save(bm);
    }

    private void save(BreakfestMenu bm) {
        var mapper = new XmlMapper();
        //mapper.enable(ToXmlGenerator.Feature.WRITE_XML_DECLARATION);
        try {
            mapper.writerWithDefaultPrettyPrinter().writeValue(new File(FILE_PATH), bm);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private BreakfestMenu load() {
        var mapper = new XmlMapper();
        try {
            return mapper.readValue(new File(FILE_PATH), BreakfestMenu.class);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }

    private double getDouble(String price) {
        // $45.66
        return Double.parseDouble(price.substring(1));
    }

    private String getPrice(double price) {
        return "$" + price;
    }
}
