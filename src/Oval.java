import java.awt.Color;
import java.awt.Graphics;


public class Oval extends Body {

	private int width;

	public Oval(int x, int y, int width, int height, Color color, int speedX,int speedY) {
		super(x, y, width, height, color, speedX, speedY);
		
	}
	
	@Override
	public void draw(Graphics g){
		super.draw(g);
		g.fillOval(getX(), getY(), getWidth(), getHeigth());
		
	}
	
	
	

}