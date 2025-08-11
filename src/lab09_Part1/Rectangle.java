package lab09_Part1;

import java.awt.Color;
import java.awt.Point;

class Rectangle extends Shape{
	private int sideA, sideB;
	
	public Rectangle(Color colour, Point position, int sideA, int sideB) {
		super(colour, position);
		this.sideA = sideA;
		this.sideB = sideB;
		
	}
	public int getArea() {
		int area = this.sideA * this.sideB;
		return area;
	}
	
	//lab doc said circumference but think it supposed to be perimeter
	public int getPerimeter() {
		int perimeter = (sideA + sideB) * 2;
		return perimeter;
	}
	
	public String getCharacteristics() {
		String characteristics = String.format(
				"Rectangle Characteristics\n\n"
				+ "Side A: 	%d\n"
				+ "Side B: 	%d\n"
				+ "Area: 		%d\n"
				+ "Perimeter: 	%d\n"
				+ "Colour: 	%s\n"
				+ "-------------------------------\n",
				sideA, 
				sideB, 
				getArea(), 
				getPerimeter(),
				getColour().toString()
				);
		return characteristics; 
	}
	

}