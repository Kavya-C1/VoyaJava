package com.objects.overiding;

public class Indian extends Menu {
    @Override
    void showItems(String type) {

        if (type.equals("breakfast")) {
            System.out.println("breakfast: idly vada");
        } else if (type.equals("lunch")) {
            System.out.println("lunch: south thali");
        } else {
            System.out.println("dessert: gulab jamun");
        }
    }
}
