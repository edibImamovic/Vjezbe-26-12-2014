import javax.swing.JFrame;
import javax.swing.JPanel;


public class Play extends JPanel{

	public static void main(String[] args) {
		
		JFrame window = new JFrame();
		window.setSize(500, 500);
		GameGrapics graf = new  GameGrapics(500, 500);
		window.setContentPane(graf);
		
		window.setDefaultCloseOperation(window.EXIT_ON_CLOSE);
		window.setVisible(true);
	

	}

}
