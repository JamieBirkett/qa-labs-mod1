package lab03a;

class Ball {
	public int x,y,w,h,dirX, dirY;
	static int worldH,worldW;

	public static void setWorld(int w, int h) {
		worldH = h;
		worldW = w;
	}
	
	
	public Ball(int x, int y, int w, int h, int dirX, int dirY) {
		this.x = x; this.y = y; this.w = w; this.h = h; this.dirX = dirX; this.dirY = dirY;
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
