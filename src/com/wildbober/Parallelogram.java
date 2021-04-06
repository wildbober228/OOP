package com.wildbober;

public class Parallelogram extends Rectangle {
    Parallelogram(Point _p1, Point _p2, Point _p3, Point _p4) {
        super(_p1, _p2, _p3, _p4);
    }

    @Override
    protected void printFigure() {
        System.out.println("");
        System.out.print("Parallelogram init ");
        System.out.print("("+super.getXs()[0]+","+super.getXs()[0]+") ");
        System.out.print("("+super.getXs()[1]+","+super.getXs()[1]+") ");
        System.out.print("("+super.getXs()[2]+","+super.getXs()[2]+") ");
        System.out.print("("+super.getXs()[3]+","+super.getXs()[0]+") ");
        System.out.println("");
    }
}
