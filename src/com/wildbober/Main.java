package com.wildbober;

import com.wildbober.utils.DeSerializer;
import com.wildbober.utils.Serializer;
import com.wildbober.utils.Figure;

import java.io.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Controller controller = new Controller();
        controller.Start();

//        String filename = "people.dat";
//        // создадим список объектов, которые будем записывать
//        Line line = new Line(new Point(44,22),new Point(21,67));
//        Line line1 = new Line(new Point(0,0),new Point(1,1));
//        Line line2 = new Line(new Point(5,5),new Point(55,55));
//        Line line3 = new Line(new Point(11,11),new Point(22,22));
//
//
//
//
//        ArrayList<Line> lines = new ArrayList<Line>();
//
//        lines.add(line);
//        lines.add(line1);
//        lines.add(line2);
//        lines.add(line3);
//
//        Figure figure = new Figure(lines);
//        serializer.SerializeToObject(figure, "square.dat");
//        Figure figure1 = (Figure) deSerializer.DeSerializeToClass("square.dat");
//        figure1.printSquare();
//        System.out.println("  ");
//        serializer.SerializeToObject(line, "line.dat");
//        Line newLine = (Line) deSerializer.DeSerializeToClass("line.dat");
//        newLine.PrintLine();
    }
}

