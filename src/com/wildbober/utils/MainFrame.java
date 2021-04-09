package com.wildbober.utils;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MainFrame extends JPanel implements KeyListener {

    MyFrame myFrame;

    MainFrame(MyFrame myFrame){
        this.myFrame = myFrame;
    }

    public void keyTyped(KeyEvent e) {
        if(e.getKeyChar() == '1'){
            myFrame.typeObject = 0;
        }
        if(e.getKeyChar() == '2'){
            myFrame.typeObject = 1;
        }
        if(e.getKeyChar() == '3'){
            myFrame.typeObject = 2;
        }
        if(e.getKeyChar() == '4'){
            myFrame.typeObject = 3;
        }
        if(e.getKeyChar() == '5'){
            myFrame.typeObject = 4;
        }
        if(e.getKeyChar() == '6'){
            myFrame.typeObject = 5;
        }
    }
    public void keyPressed(KeyEvent e) {

    }
    public void keyReleased(KeyEvent e) {

    }
}
