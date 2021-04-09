package com.wildbober.utils;


import com.wildbober.*;
import com.wildbober.Point;
import com.wildbober.Rectangle;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class Points {
    public static Point point;
    public static Point point1;
}

public class MyFrame extends JFrame {

    private int prefW;
    private int prefH;
    Rectangle rectangle;
    Line line;
    Square square;
    Circle circle;
    Triangle triangle;
    public int typeObject = 0;

    public MyFrame() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(500,500);
        MainFrame mainFrame = new MainFrame(this);
        mainFrame.addKeyListener(mainFrame);
        mainFrame.setFocusable(true);
        add(mainFrame);
        setVisible(true);
        MyMouseAdapter myMouseAdapter = new MyMouseAdapter(this);
        addMouseListener(myMouseAdapter);
        addMouseMotionListener(myMouseAdapter);
    }

    public void paint(Graphics g){
        if(Points.point != null){
            if(typeObject == 0) {
                rectangle = new Rectangle(Points.point, Points.point1);
                g.drawPolyline(rectangle.getXs(), rectangle.getYs(), rectangle.getPointsCount());
            } else if(typeObject == 1) {
                line = new Line(Points.point, Points.point1);
                g.drawPolyline(line.getXs(), line.getYs(), line.getPointsCount());
            } else if(typeObject == 2) {
                double d = Math.pow((Points.point1.x-Points.point.x),2)+Math.pow((Points.point1.y-Points.point.y),2);
                int side = (int) Math.sqrt(d);
                square = new Square(Points.point, side);
                g.drawPolyline(square.getXs(), square.getYs(), square.getPointsCount());
            } else if(typeObject == 3) {
                double d = Math.pow((Points.point1.x-Points.point.x),2)+Math.pow((Points.point1.y-Points.point.y),2);
                int radius = (int) Math.sqrt(d);
                circle = new Circle(Points.point, radius);
                g.drawOval(circle.getXs()[0], circle.getYs()[0], radius,radius);
            } else if(typeObject == 4) {
                double d = Math.pow((Points.point1.x-Points.point.x),2)+Math.pow((Points.point1.y-Points.point.y),2);
                int radius = (int) Math.sqrt(d);
                circle = new Circle(Points.point, radius);
                g.drawOval(circle.getXs()[0], circle.getYs()[0], radius,radius/2);
            } else if(typeObject == 5) {
                triangle = new Triangle(Points.point,Points.point1);
                g.drawPolyline(triangle.getXs(), triangle.getYs(), triangle.getPointsCount());
            }
        }
    }

    public void startPaint(){
        repaint();
    }

}

