package lab05_Part1;

import java.awt.Color;

class Shape {
	public int x,y,w,h,dirX, dirY;
	static int worldH,worldW;
	private Color colour;
	private ShapeType shapeType;
	
	
	
	public static void setWorld(int w, int h) {
		worldH = h;
		worldW = w;
	}
	
	
	public Shape(ShapeType shapeType, Color colour, int x, int y, int w, int h, int dirX, int dirY) {
		this.shapeType = shapeType;
		this.colour = colour;
		this.x = x; this.y = y; this.w = w; this.h = h; this.dirX = dirX; this.dirY = dirY;
	}
	
	//Constructor for Ovals
	public Shape(int x, int y, int dirX, int dirY) {
		this(ShapeType.Oval, Color.black, x, y, 30, 30, dirX, dirY);
	}
	
	
	public ShapeType getShapeType() {
		return shapeType;
	}
	
	public Color getColour() {
		return colour;
	}
	
	public void move() {

		x += dirX;
		y += dirY;
		
		if(x + w > worldW) {
			y = worldW - w;
			dirX = -dirX;
		}
		
		if( x < 0) {
			x=0;
			dirX = -dirX;
		}
		
		if( y < 0) {
			y=0;
			dirY = -dirY;
		}
		
		if(y + h > worldH) {
			y = worldH - h;
			dirY = -dirY;
		}
	}



}
