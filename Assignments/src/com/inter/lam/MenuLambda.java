package com.inter.lam;

public class MenuLambda {
    public static void main(String[] args) {
        IMenu indianMenu = () -> {
            System.out.println("Idly Vada");
            System.out.println("Rice Sambar");
        };
        indianMenu.showMenu();

        IMenu chineseMenu = () -> {
            System.out.println("Gobi Manchurian");
            System.out.println("Noodles");
        };
        chineseMenu.showMenu();

        IMenu italianMenu = () ->{
            System.out.println("Pasta");
            System.out.println("Pizza");
        };
        italianMenu.showMenu();
    }
}
