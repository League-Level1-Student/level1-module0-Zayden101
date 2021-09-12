package _10_cuteness_tv;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ctty implements ActionListener {
JButton button = new JButton();
JButton button2 = new JButton();
JButton button3 = new JButton();
public void run() {
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


	
	button.addActionListener(this);
	button2.addActionListener(this);
	button3.addActionListener(this);
}

	void showDucks() {
	      playVideo("https://www.youtube.com/watch?v=MtN1YnoL46Q");
	 }

	void showFrog() {
	      playVideo("https://www.youtube.com/watch?v=cBkWhkAZ9ds");
	 }

	void showFluffyUnicorns() {
	      playVideo("https://www.youtube.com/watch?v=a-xWhG4UU_Y");
	 }

	void playVideo(String videoID) {
	     
	     // Workaround for Linux because "Desktop.getDesktop().browse()" doesn't 
	     //work on some Linux implementations 
	      try {
	      if (System.getProperty("os.name").toLowerCase().contains("linux")) {
	      if (Runtime.getRuntime().exec(new String[] { 
	       "which", "xdg- open" }).getInputStream().read() != -1) {
	      Runtime.getRuntime().exec(new String[] { "xdg-open", videoID }); 
	      }
	      } else {
	           URI uri = new URI(videoID);
	           java.awt.Desktop.getDesktop().browse(uri);
	      }      } catch (Exception e) {
	           e.printStackTrace();
	      }
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
		JButton buttonclick = (JButton) arg0.getSource();
		if (buttonclick == button) {
			showDucks();
		}
		if (buttonclick == button2) {
			showFrog();
		}
		if (buttonclick == button3) {
			showFluffyUnicorns();
		}
	}
}

