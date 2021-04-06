package com.wildbober.utils;

import com.wildbober.Point;
import com.wildbober.Rectangle;

import javax.swing.*;
import javax.swing.event.MouseInputListener;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RectangleDrawUtil extends JFrame implements MouseInputListener {
    Rectangle rectangle;
    Point point;
    Point point1;
    boolean pressed = false;
    public RectangleDrawUtil(){
        //this.rectangle = rectangle;
        setSize(400,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
        addMouseListener(this);
        addMouseMotionListener(this);
        addMouseListener(new MouseAdapter() {
                             @Override
                             public void mousePressed(MouseEvent e) {
                                 point = new Point(e.getX(),e.getY());
                                 pressed = true;
                             }
                         }
        );

        addMouseListener(new MouseAdapter() {
                             @Override
                             public void mouseReleased(MouseEvent e) {
                                 point1 = new Point(e.getX(),e.getY());
                                 //pressed = false;
                                 repaint();
                             }
                         }

        );

        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseMoved(MouseEvent e) {
                System.out.println("Mouse movement detected! Actual mouse position is: " + e.getX()+ "," + e.getY() + ".");
            }
        });
    }

    public void paint(Graphics g){
        if(point != null){
            rectangle = new Rectangle(point, point1);
            g.drawPolyline(rectangle.getXs(), rectangle.getYs(), rectangle.getPointsCount());
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    public void mouseDragged(MouseEvent e) {

    }



    @Override
    public void mouseMoved(MouseEvent e) {

    }
}
