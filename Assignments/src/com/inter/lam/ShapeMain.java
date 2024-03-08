package com.inter.lam;


public class ShapeMain {
    public static void main(String[] args) {
        ShapeFactory factory = new ShapeFactory();

        //create a reference of IShape
        IShape shape =  new Rectangle();

        //pass this as parameter
        factory.printAreas(shape,10,20);
        System.out.println("..........");
        //using anonymous inner class
        factory.printAreas(new IShape() {
            @Override
            public void area(int x, int y) {
                System.out.println("Calculating tri areas");
                System.out.println("Tri "+(x*y*0.5));
            }
        },10,20);
        System.out.println("..........");
        //using Lambda expression
        factory.printAreas((int x, int y)->{
            System.out.println("Calculating sq areas");
            System.out.println("sq "+(x*x));
        },2,3);
        System.out.println("..........");
    }
}
