package com.exception.basics;

public class MultiCatch {
    public static void main(String[] args) {
        try {
            System.out.println("Welcome");
            String value = args[0];
            System.out.println("Value " + value);
            int num = Integer.parseInt(value);
            System.out.println("Number " + num);
            int result = 100 / num;
            System.out.println(result);
            int nums [] = null;
            System.out.println(nums[0]);
        } catch (ArrayIndexOutOfBoundsException |
        NullPointerException |
        NumberFormatException |
        ArithmeticException e) {
            System.out.println(e.getMessage());
            System.out.println("Please enter number");
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
//            e.printStackTrace();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("completed");
    }
}
