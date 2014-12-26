
public class Point {
	private int x;

	
	
	
	
	public Point(int x, int y){
		
		this.x=x;
		this.y=y;
		
	}
	
	public Point(int i) {
		// TODO Auto-generated constructor stub
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	private int y;
	
	public int getDistance (Point other){
		
		
		int dx = this.x-other.x;
		int dy = this.y-other.y;
		
		int dxy = dx*dx+dy*dy;
		int d=(int)(Math.sqrt(dxy));
		
		return d;
		
	}
	
	public void move(int speedX, int speedY){
		
		this.x+=speedX;
		this.y+=speedY;
	}
	
}
