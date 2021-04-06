package com.wildbober;

public class Circle extends Polygone {
    int R = 1;
    Circle(Point p, int r){
        R = r;
        addPoint(p);
        System.out.print("");
        System.out.print("Circle init ");
        System.out.print("("+super.getXs()[0] +","+super.getYs()[0]+") ");
        System.out.print("R = "+ r);
        System.out.print(" ");
    }

}
