package Lab07;

import java.awt.Color;
import java.awt.Point;

public class Shape {
	private Color colour;
	private Point position;
	
	public Shape(Color colour, Point position) {
		setColour(colour);
		setPosition(position);
	}
	public Color getColour() {
		return colour;
	}
	public void setColour(Color colour) {
		this.colour = colour;
	}
	public Point getPosition() {
		return position;
	}
	public void setPosition(Point position) {
		this.position = position;
	}
	
	// To satisfy subclass implementations
	public String getCharacteristics(){
		return null;
	}
	
	
}

