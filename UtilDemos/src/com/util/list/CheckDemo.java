package com.util.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CheckDemo {
    public static void main(String[] args) {
        List<String> fruitsList = new ArrayList<>();
        List<String> fruitsList1 = new ArrayList<>();
        fruitsList.add("Apple");
        fruitsList.add("Banana");
        fruitsList.add("Watermelon");
        fruitsList.add("Strawberry");
        fruitsList.add("Orange");
        fruitsList.add("Grapes");
        fruitsList.add("Blueberry");

        System.out.println(fruitsList);


       for(String fruit:fruitsList){
           if (fruit.startsWith("B"))
           {
               fruitsList1.add(fruit);
           }
       }

       for (String fruit:fruitsList1){
           System.out.println(fruit);
       }


    }
}
