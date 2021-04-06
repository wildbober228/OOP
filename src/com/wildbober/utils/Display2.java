package com.wildbober.utils;

import com.wildbober.Line;
import com.wildbober.Point;
import com.wildbober.Rectangle;
import com.wildbober.Square;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.*;


class Points {
    public static Point point;
    public static Point point1;
}

@SuppressWarnings("serial")
public class Display2 extends JPanel {
    private int prefW;
    private int prefH;
    Rectangle rectangle;
    Line line;
    Square square;
    int typeObject = 2;

    public Display2(int prefW, int prefH) {
        this.prefW = prefW;
        this.prefH = prefH;
        MyMouseAdapter myMouseAdapter = new MyMouseAdapter(this);
        addMouseListener(myMouseAdapter);
        addMouseMotionListener(myMouseAdapter);
    }



    @Override
    public Dimension getPreferredSize() {
        if (isPreferredSizeSet()) {
            return super.getPreferredSize();
        }
        return new Dimension(prefW, prefH);
    }

    public static void createAndShowGui() {
        Display2 mainPanel = new Display2(500, 500);

        JFrame frame = new JFrame("Display");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.getContentPane().add(mainPanel);
        frame.pack();
        frame.setLocationByPlatform(true);
        frame.setVisible(true);
    }

    public void paint(Graphics g){
        if(Points.point != null){
            if(typeObject == 0) {
                rectangle = new Rectangle(Points.point, Points.point1);
                g.drawPolyline(rectangle.getXs(), rectangle.getYs(), rectangle.getPointsCount());
            }
            else if(typeObject == 1){
                line = new Line(Points.point, Points.point1);
                g.drawPolyline(line.getXs(), line.getYs(), line.getPointsCount());
            }
            else if(typeObject == 2){
                int d = (Points.point1.x-Points.point.x)^2+(Points.point1.y-Points.point.y)^2;
                int side = (int) Math.sqrt(d);
                square = new Square(Points.point, side);
                g.drawPolyline(square.getXs(), square.getYs(), square.getPointsCount());
            }
        }
    }

    public void startPaint(){
        repaint();
    }

}

class MyMouseAdapter extends MouseAdapter {


    boolean pressed = false;
    Rectangle rectangle;
    Display2 display2;

   MyMouseAdapter(Display2 display2){
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
