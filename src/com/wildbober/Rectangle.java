package com.wildbober;

import java.awt.*;

public class Rectangle extends Polygone {


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


    public void refreshShape(Point point){
        setPoint(1, new Point(point.x, getPoint(0).y));
        setPoint(2, point);
        setPoint(3, new Point(getPoint(0).x, point.y));
    }

    public Rectangle() {

    }

    public void draw(Graphics g){
        g.setColor(getBorderColor());
        g.drawPolyline(getXs(), getYs(), getPointsCount());//Stream java 8
    }

    protected void printFigure(){
        System.out.println("");
        System.out.print("Rectangle init ");
        System.out.print("("+super.getXs()[0]+","+super.getXs()[0]+") ");
        System.out.print("("+super.getXs()[1]+","+super.getXs()[1]+") ");
        System.out.print("("+super.getXs()[2]+","+super.getXs()[2]+") ");
        System.out.print("("+super.getXs()[3]+","+super.getXs()[3]+") ");
        System.out.println("");
    }

    Rectangle(Point _p1, Point _p2,Point _p3, Point _p4){
        addPoint(_p1);
        addPoint(_p2);
        addPoint(_p3);
        addPoint(_p4);
        printFigure();

    }


//    Rectangle (Point p1, Point p2){
//        addPoint(p1);
//        addPoint(p2);
//        System.out.println("");
//        System.out.print("Square init ");
//        System.out.print("("+super.getXs()[0]+","+super.getXs()[0]+") ");
//        System.out.print("("+super.getXs()[0]+","+super.getXs()[1]+") ");
//        System.out.print("("+super.getXs()[1]+","+super.getXs()[0]+") ");
//        System.out.print("("+super.getXs()[1]+","+super.getXs()[1]+") ");
//        System.out.println("");
//    }
}
