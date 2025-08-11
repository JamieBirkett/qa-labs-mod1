package lab09_Part1;

import java.awt.Color;
import java.awt.Point;

class Circle extends Shape{
	private int radius;

	public Circle(Color colour, Point position, int radius) {
		super(colour, position);
		setRadius(radius);
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	public int getRadius() {
		return radius;
	}

	
	public double getArea() {
		double area = Math.PI * Math.pow(radius,2);
		return area;
	}
	
	public double getCircumference() {
		double circumference = 2 * Math.PI * radius;
		return circumference;
	}
	
	public int getDiameter() {
		int diameter = 2 * radius;
		return diameter;
	}
	
	public String getCharacteristics() {
		String characteristics = String.format(
				"Circle Characteristics\n\n"
				+ "Radius: 	%d\n"
				+ "Area:		%g\n"
				+ "Circumference:	%g\n"
				+ "Diameter:	%d\n"
				+ "Colour:		%s\n"
				+ "-------------------------------\n",
				getRadius(), 
				getArea(), 
				getCircumference(), 
				getDiameter(), 
				getColour().toString()
				);
		return characteristics; 
	}
	


	
}