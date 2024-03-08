package com.oops.overriding;

public class OverrideDemo {
    public static void main(String[] args) {
        String choice = "indoor";
        Sports sports = null;
        if(choice.equals("indoor"))
            sports = new Indoor();
        else if (choice.equals("outdoor")){
            sports = new Outdoor();
        }
        else
            sports = new Sports();

//        Sports sports = new Indoor();

//        String[] inGames = sports.showTypes();
//        for (String game:inGames)
        String[] games = sports.showTypes();
//        for (String game:games)
//            System.out.println(game);

     // sports = new Outdoor();
//        String[] outGames = sports.showTypes();
//        for (String game:outGames)
//            System.out.println(game);

        if(games!=null)
            for(String game:games)
                System.out.println(game);
    }
}
