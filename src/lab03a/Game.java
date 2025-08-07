package lab03a;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.util.Timer;
import javax.swing.*;

public class Game extends Canvas {
	
//create an array of 3 balls
	Ball[] balls = new Ball[3];
//call this array balls
	Game() {
		balls[0] = new Ball(12,11,50,50,1,1);
		balls[1] = new Ball(40,100,30,30,2,1);
		balls[2] = new Ball(40,100,80,30,2,2);
		
		JFrame frame = new JFrame();
		this.setSize(400, 400);
		frame.add(this);
		frame.pack();
		frame.setVisible(true);
		
		Ball.setWorld(300,300);
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
//call the move() method of each balls
//Tip: use an enhanced for loop to pick
//each ball in the balls array.
		
		for(Ball ball : balls) {
			ball.move();
		}
		this.repaint();	
	}

	public void paint(Graphics g) {
		g.drawRect(0, 0, Ball.worldW, Ball.worldH);
//move and draw each ball in balls array
//Tip: use an enhanced for loop to pick
// each ball in the balls array.
		for(Ball ball : balls) {
			g.drawOval(ball.x,ball.y, ball.w, ball.h);
		}

	}
}
