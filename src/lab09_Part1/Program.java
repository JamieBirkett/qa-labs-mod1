package lab09_Part1;

import java.awt.Color;
import java.awt.Point;
import java.util.ArrayList;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Rectangle rectangle = new Rectangle(Color.black, new Point(10,15), 30, 60);
		Circle circle = new Circle(Color.green, new Point(10,20), 30);
		Sphere sphere = new Sphere(Color.blue, new Point(10,25), 30);
		
		ArrayList<Shape> shapes = new ArrayList<>();
		
		shapes.add(rectangle);
		shapes.add(circle);
		shapes.add(sphere);
		
		for(Shape shape : shapes) {
			System.out.println(shape.getCharacteristics());
		}
		
	}

}

