package com.objects.overiding;

public class Restaurant {

    public static void main(String[] args) {
        Menu menu = new Chinese();
        menu.showItems("starters");


// cast exception
//      menu = new Indian();
//        menu.showItems("lunch");

        //downcast
//        Chinese chinese =  menu;
//        chinese.printGames();


        Chinese chinese = (Chinese) menu;
        chinese.printGames();

//        Menu menu1 = new Indian();
//        menu1.showItems("lunch");

        menu = new Indian();
        menu.showItems("lunch");
    }
}
