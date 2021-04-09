package com.wildbober;

import java.awt.*;
import java.io.Serializable;

public class MyColor implements Serializable {
    Color color;

    MyColor(Color color){
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
