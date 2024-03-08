package com.inter.lam;

public class ShapeLambda {
    public static void main(String[] args) {
        IShape iShape = (int x, int y) ->{
            System.out.println(" Rect "+(x+y));
        };
        iShape.area(10,20);

        //in single line
        iShape = (x,y)-> System.out.println("Tri "+(0.5*x*y));
        iShape.area(20,20);
    }
}
