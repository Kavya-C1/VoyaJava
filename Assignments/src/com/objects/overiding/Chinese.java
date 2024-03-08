package com.objects.overiding;

public class Chinese extends Menu {

    @Override
    void showItems(String type) {

        if (type.equals("starters")) {
            System.out.println("starters: gobi manchuri");
        } else if (type.equals("lunch")) {
            System.out.println("lunch: fried rice");
        } else {
            System.out.println("dessert: cake");
        }

    }

    void printGames(){
        System.out.println("Board games available");
    }
}
