package com.wildbober;

public class Triangle  extends Polygone {

    public Triangle(Point _p1, Point _p2){
        addPoint(_p1);
        addPoint(new Point(_p1.x,_p2.y));
        addPoint(_p2);
        addPoint(_p1);
    }


}
