package com.wildbober;

import java.awt.*;

public class Rectangle extends Polygone {
    
    public Rectangle() {

    }

    public Rectangle(Point topLeft, int width, int height){
        addPoint(new Point(topLeft.x, topLeft.y));
        addPoint(new Point(topLeft.x + width, topLeft.y));
        addPoint(new Point(topLeft.x + width, topLeft.y + height));
        addPoint(new Point(topLeft.x, topLeft.y + height));
        addPoint(new Point(topLeft.x, topLeft.y));
    }

    public Rectangle(Point p,Point p1){
        addPoint(p);
        addPoint(new Point(p1.x , p.y));
        addPoint(p1);
        addPoint(new Point(p.x, p1.y));
        addPoint(p);
    }


}
