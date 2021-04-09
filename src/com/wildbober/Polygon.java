package com.wildbober;

import java.util.ArrayList;

public class Polygon {

    public int countPoints;
    ArrayList<Point> points = new ArrayList<Point>();

    public void addPoint(Point point){
        countPoints++;
        points.add(point);
    }

    public Point getPoint(int index){
        return points.get(index);
    }

    protected int GetCountPoints(){
        return countPoints;
    }



}
