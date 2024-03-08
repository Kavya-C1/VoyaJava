package com.inter.lam;

public class ShapeFactory {
    void printAreas(IShape shape, int x, int y){
        System.out.println("Printing area");
        shape.area(x,y);
        System.out.println("Completed");
    }
}
