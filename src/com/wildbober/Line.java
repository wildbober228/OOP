package com.wildbober;

public class Line extends Polygone {
    public Line(Point p){
        addPoint(p);
        addPoint(p);
    }

    public Line(Point a, Point b){
        addPoint(a);
        addPoint(b);
        System.out.println(a.x+" "+a.y);
        System.out.println(b.x+" "+b.y);
        int d = (b.x-a.x)^2+(b.y-a.y)^2;
        System.out.println(Math.sqrt(d));
    }

}
