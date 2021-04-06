package com.wildbober;

public class Triangle  extends Polygone {

    Triangle(Point _p1, Point _p2){
        addPoint(_p1);
        addPoint(_p2);
        System.out.println("Triangle init ("+super.getXs()[0]+" , "+super.getYs()[0]+") "+"("+super.getXs()[0]+" , "+super.getYs()[1]+") ("+super.getXs()[1]+" , "+super.getYs()[1]+")");
    }

}
