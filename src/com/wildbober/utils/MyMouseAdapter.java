package com.wildbober.utils;

import com.wildbober.Point;
import com.wildbober.Rectangle;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MyMouseAdapter extends MouseAdapter {

    boolean pressed = false;
    Rectangle rectangle;
    MyFrame display2;

    MyMouseAdapter(MyFrame display2){
        this.display2 = display2;
    }

    @Override
    public void mousePressed(MouseEvent e) {
        Points.point = new Point(e.getX(),e.getY());
        pressed = true;
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        Points.point1 = new Point(e.getX(),e.getY());
        display2.startPaint();
    }

    @Override
    public void mouseDragged(MouseEvent e) {

    }

}
