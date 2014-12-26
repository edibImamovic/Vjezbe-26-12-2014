import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.Timer;


public class GameGrapics extends JPanel implements ActionListener{
	
	private Timer animation ;
	Body [] elements;
	int elementsCount;
	int width;
	int height;
	
	public GameGrapics(int width, int height) {
		super();
		animation = new Timer(200, this);
		elements = new Body[3];
		elementsCount =0;
		//ovo smo stavili samo radi debugginga
		elementsCount=1;
		elements[0]=new Oval(0, 0, 20, 30, Color.RED, 3, 1);
		animation.start();
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
	repaint();
		
	}
	
	@Override
	public void paintComponent (Graphics g){
		super.paintComponent(g);
		this.setBackground(new Color(194, 212, 245));
		g.setColor(new Color(54, 140, 22));
		g.fill3DRect(0, 400, 500, 100, true);
		for(int i =0; i<elementsCount; i++){
			elements[i].draw(g);
		}
	}
	
	
	
}
