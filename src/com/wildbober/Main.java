package com.wildbober;


import com.wildbober.utils.Display2;
import com.wildbober.utils.RectangleDrawUtil;

import javax.swing.*;
import java.awt.*;

public class Main extends JPanel {

	public Main(){

	}



    public static void main(String[] args) {
	ObjectManager objectManager = new ObjectManager();
//	objectManager.CreateSquare(0,0,150,200);
//	objectManager.CreateTriangle(0,300,505,0);
//	objectManager.CreateLine(0,0,10,10);
	//objectManager.CreateRectangle(50,50,50,-100,200,-100,200,50);
//	objectManager.CreateCircle(40,20,5);
//	objectManager.CreateParallelogram(0,0,5,40,155,40,150,0);


//		JFrame mainFrame = new JFrame("Лабораторная работа №1, 2");
//		mainFrame.setVisible(true);
//		mainFrame.setMinimumSize(new Dimension(500, 400));
//		mainFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
//		mainFrame.setLocationRelativeTo(null);
//		mainFrame.setVisible(true);
//		mainFrame.setContentPane(new Main());
//		mainFrame.pack();
		//RectangleDrawUtil rectangleDrawUtil = new RectangleDrawUtil();

		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				Display2.createAndShowGui();
			}
		});
    }
}
