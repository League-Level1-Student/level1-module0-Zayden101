package _10_cuteness_tv;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.net.URI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ctty {
public static void main(String[] args) {
	System.out.println("Button clicked");
	JFrame frame = new JFrame();
	frame.setVisible(true);
	

	Dimension SMALL = new Dimension(200, 200);
	
	JButton button = new JButton();
	frame.add(button);
	frame.pack();
	button.setSize(SMALL);

	JButton button2 = new JButton();
	frame.add(button2);
	frame.pack();
	button2.setSize(SMALL);

	JButton button3 = new JButton();
	frame.add(button3);
	frame.pack();
	button3.setSize(SMALL);


	
	//button.addActionListener(this);
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
}

