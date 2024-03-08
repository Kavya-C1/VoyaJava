package com.inter.lam;

public class ShapeDemo implements IShape {
    @Override
    public void area(int x, int y) {
        System.out.println(x*y);

    }
}
