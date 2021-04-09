package com.wildbober;

import sun.plugin2.message.Serializer;

import java.awt.*;
import java.io.Serializable;

public class Point extends MyColor implements Serializable {

    int x;
    int y;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Point(int x, int y) {
        super(Color.RED);
        this.x = x;
        this.y = y;
    }
}
