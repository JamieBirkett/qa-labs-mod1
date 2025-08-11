package lab07;

import java.awt.Color;
import java.awt.Point;

class Sphere extends Circle{
	
	public Sphere(Color colour, Point position, int radius) {
		super(colour, position, radius);
	}

	public double getVolume() {
		double volume = (4/3) * Math.PI * Math.pow(this.getRadius(),3);
		return volume;
	}
	
	public String getCharacteristics() {
		String characteristics = String.format(
				"Sphere Characteristics\n\n"
				+ "Radius:		%d\n"
				+ "Area:		%g\n"
				+ "Circumference:	%g\n"
				+ "Diameter:	%d\n"
				+ "Volume:		%g\n"
				+ "Colour:		%s\n"
				+ "-------------------------------\n",
				getRadius(), 
				getArea(), 
				getCircumference(), 
				getDiameter(), 
				getVolume(),
				getColour().toString()
				);
		
		return characteristics; 
	}
	
}