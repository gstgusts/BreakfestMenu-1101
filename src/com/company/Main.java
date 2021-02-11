package com.company;

import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        var mm = new MenuManager();
        var menu = mm.getMenu();

//        var foods = menu.getFoods().stream()
//                .filter(f->f.getPrice() < 5)
//                .collect(Collectors.toList());
//
//        if(menu != null) {
//            for (var food :
//                    foods) {
//                System.out.println(food.getPrice());
//            }
//        }

        mm.saveMenu(menu);
    }
}
