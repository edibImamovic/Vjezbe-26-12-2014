import java.awt.Color;
import java.awt.Graphics;


public class Body {
	
	private int width;
	private int heigth;
	private Color color;
	private Point centar;
	private Point start;
	private int speedX;
	private int speedY;
	
	
	public Body(int x, int y, int width, int heigth, Color color, int speedX, int speedY) {
	
		start = new Point(x, y);
		this.width = width;
		this.heigth = heigth;
		this.color = color;
		this.centar = new Point(x+width/2+y+heigth/2);
		this.speedX = speedX;
		this.speedY =speedY;
	}
	
	
	
	public int getWidth() {
		return width;
	}



	public int getHeigth() {
		return heigth;
	}




	public Point getStart() {
		return start;
	}

	public int getX(){
		return start.getX();
	}
	
	public int getY(){
		return start.getY();
	}
	
	public void draw (Graphics g){
		move();
		return;
		
		
	}
	
	
	
	public boolean checkColision(Body other){
		
		int distance = this.centar.getDistance(other.centar);
		if((distance>this.heigth/2 +other.heigth/2) && (distance>this.width/2 +other.width/2)){
			return false;
		} return true;
		
	}
	
	private void move(){
		this.start.move(speedX, speedY);
		this.centar.move(speedX, speedY);
	}



	
	}


