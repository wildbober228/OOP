package com.wildbober;

import com.wildbober.utils.DeSerializer;
import com.wildbober.utils.Serializer;
import com.wildbober.utils.Square;

import java.io.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Serializer serializer = new Serializer();
        DeSerializer deSerializer = new DeSerializer();
//	    Line line = new Line(new Point(44,22),new Point(21,67));
//
//        serializer.SerializeToObject(line);
//
//        Line line2 = new Line();
//        line2 = (Line) deSerializer.DesirializeToClass("temp.out");
//        line2.PrintLine();
        String filename = "people.dat";
        // создадим список объектов, которые будем записывать
        Line line = new Line(new Point(44,22),new Point(21,67));
        Line line1 = new Line(new Point(0,0),new Point(1,1));
        Line line2 = new Line(new Point(5,5),new Point(55,55));
        Line line3 = new Line(new Point(11,11),new Point(22,22));




        ArrayList<Line> lines = new ArrayList<Line>();

        lines.add(line);
        lines.add(line1);
        lines.add(line2);
        lines.add(line3);

        Square square = new Square(lines);
        serializer.SerializeToObject(square, "square.dat");
        Square square1 = (Square) deSerializer.DeSerializeToClass("square.dat");
        square1.printSquare();
        System.out.println("  ");
        serializer.SerializeToObject(line, "line.dat");
        Line newLine = (Line) deSerializer.DeSerializeToClass("line.dat");
        newLine.PrintLine();
    }
}

