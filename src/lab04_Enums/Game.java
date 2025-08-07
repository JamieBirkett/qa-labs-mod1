package lab04_Enums;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.util.Timer;
import javax.swing.*;

public class Game extends Canvas {
	
//create an array of 3 balls
	Shape[] shapes = new Shape[3];
//call this array balls
	Game() {
		shapes[0] = new Shape(ShapeType.RoundRectangle, Color.blue, 12,11,50,100,1,1);
		shapes[1] = new Shape(40,100,2,1);  //Default as Black Oval due to constructor chaining
		shapes[2] = new Shape(ShapeType.Arc,Color.green, 40,100,80,80,2,2);
		
		JFrame frame = new JFrame();
		this.setSize(400, 400);
		frame.add(this);
		frame.pack();
		frame.setVisible(true);
		
		Shape.setWorld(300,300);
		Timer t = new Timer();
		TimerTask tt = new TimerTask() {
			@Override
			public void run() {
				draw();
			}
		};

		t.schedule(tt, 0, 50);

		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				t.cancel();
				tt.cancel();
			}
		});
	}

	public void draw() {
		//call the move() method of each shape
		
		for(Shape shape : shapes) {
			shape.move();
		}
		this.repaint();	
	}

	public void paint(Graphics g) {
		g.drawRect(0, 0, Shape.worldW, Shape.worldH);
		
		//move and draw each shape in shapes array
		for(Shape shape : shapes) {
			g.setColor(shape.getColour());
			if(shape.getShapeType() == ShapeType.RoundRectangle) {
				//Last 2 parms Arc Width/Height
				g.drawRoundRect(shape.x,shape.y, shape.w, shape.h, 20, 20);
				//g.drawRoundRect(ALLBITS, ABORT, WIDTH, HEIGHT, WIDTH, HEIGHT);
			}
			else if(shape.getShapeType() == ShapeType.ThreeDRectangle) {
				g.draw3DRect(shape.x,shape.y, shape.w, shape.h, true);
			}
			else if(shape.getShapeType() == ShapeType.Oval) {
				g.drawOval(shape.x,shape.y, shape.w, shape.h);
			}	
			else if(shape.getShapeType() == ShapeType.Arc) {
				//Last 2 prams start angle, arc angle
				g.drawArc(shape.x,shape.y, shape.w, shape.h, 0,180);

			}
			else {
				g.drawRect(shape.x,shape.y, shape.w, shape.h);
			}

		}
	}
}
