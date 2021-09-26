import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Controolrobot {
public static void main(String[] args) {
	
	

		JButton button = new JButton();
		JButton button2 = new JButton();
		JButton button3 = new JButton();

			System.out.println("Button clicked");
			JFrame frame = new JFrame();
			JPanel panel = new JPanel();
			frame.setVisible(true);
			

			Dimension SMALL = new Dimension(200, 200);
			
			
			panel.add(button);
			frame.pack();
			button.setSize(SMALL);

			
			panel.add(button2);
			frame.pack();
			button2.setSize(SMALL);

			
			panel.add(button3);
			frame.pack();
			button3.setSize(SMALL);
		frame.add(panel);



		}
	
	
	
	
	
	
}
