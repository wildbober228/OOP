package com.wildbober;

import java.awt.*;
import java.util.ArrayList;

public class Polygone {
    private ArrayList<Point> points = new ArrayList<>();
    private Color borderColor;

    public Polygone(){ borderColor = Color.BLACK; }

    public Color getBorderColor(){
        return borderColor;
    }


    public Polygone(Point point){
        points.add(point);
        borderColor = Color.BLACK;
    }
    public void addPoint(Point p){
        points.add(p);
    }

    protected void setPoint(int i, Point newPoint){
        if (i < points.size()){
            points.set(i, newPoint);
        } else {
            if (i == points.size()){
                addPoint(newPoint);
            }
        }
    }

    public void addPoint(Point p, Point p1){
        Point point = new Point(p.x, p1.y);
        points.add(point);
    }

    public int[] getXs(){
        return points.stream().mapToInt((s) -> s.x).toArray();
    }

    public int[] getYs(){
        return points.stream().mapToInt((s) -> s.y).toArray();
    }

    public Point getPoint(int i){
        return points.get(i);
    }

    public int getPointsCount(){
        return points.size();
    }

}
