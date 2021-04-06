package com.wildbober;

import com.wildbober.utils.RectangleDrawUtil;

public class ObjectManager {

    public void CreateSquare(int x1, int y1, int x2, int y2){
        Point p1 = new Point(x1,y1);
        Point p2 = new Point(x2,y2);
        Rectangle rectangle = new Rectangle(p1,p2);
    }

    public void CreateTriangle(int x1, int y1, int x2, int y2){
        Point p1 = new Point(x1,y1);
        Point p2 = new Point(x2,y2);
        Triangle triangle = new Triangle(p1,p2);
    }

    public void CreateLine(int x1, int y1, int x2, int y2){
        Point p1 = new Point(x1,y1);
        Point p2 = new Point(x2,y2);
        Line line = new Line(p1,p2);
    }

    public void CreateLine(int x){
        Point p1 = new Point(x,x);
        Line line = new Line(p1);
    }

    public void CreateCircle(int x1, int y1, int R){
        Point p1 = new Point(x1,y1);
        Circle circle = new Circle(p1, R);
    }

    public void CreateRectangle(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4){
        Point p1 = new Point(x1,y1);
        Point p2 = new Point(x2,y2);
        Point p3 = new Point(x3,y3);
        Point p4 = new Point(x4,y4);
        Rectangle rectangle = new Rectangle(p1,p2,p3,p4);
        RectangleDrawUtil rectangleDrawUtil = new RectangleDrawUtil();
    }

    public void CreateParallelogram(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4){
        Point p1 = new Point(x1,y1);
        Point p2 = new Point(x2,y2);
        Point p3 = new Point(x3,y3);
        Point p4 = new Point(x4,y4);
        Rectangle rectangle = new Parallelogram(p1,p2,p3,p4);
    }

}
