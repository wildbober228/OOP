package com.wildbober;

import java.io.*;
import java.util.ArrayList;

public class Line extends Polygon implements Externalizable {

    public Line(){

    }

    Line(Point p1, Point p2){
        addPoint(p1);
        addPoint(p2);
    }

    public void PrintLine(){
        for (int i =0; i < GetCountPoints(); i ++) {
            System.out.println("x = "+getPoint(i).x + " y = "+getPoint(i).y + " "+ getPoint(i).color);
        }
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeObject(points);
        out.writeObject(countPoints);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        points = (ArrayList<Point>) in.readObject();
        countPoints = (int) in.readObject();
    }
}
