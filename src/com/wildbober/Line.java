package com.wildbober;

public class Line extends Polygone {
    public Line(Point p){
        addPoint(p);
        addPoint(p);
    }

    public Line(Point a, Point b){
        addPoint(a);
        addPoint(b);
        System.out.println(b.x-a.x);
        System.out.println(b.y-a.y);
        int d = (int) (Math.pow((b.x-a.x),2)+Math.pow((b.y-a.y),2));
        System.out.println(Math.sqrt(d));
    }

}
