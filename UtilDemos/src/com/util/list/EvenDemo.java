package com.util.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EvenDemo {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(11,20,25,60,45);
        List<Integer> evenNum = new ArrayList<>();

        for(Integer num:numbers){
            if(num%2==0){
                evenNum.add(num);
            }
        }

        for(Integer num:evenNum){
            System.out.println(num);
        }
    }
}
