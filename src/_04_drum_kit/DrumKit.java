package _04_drum_kit;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
 *    Level 1
 */


import java.awt.Component;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.net.MalformedURLException;

import java.io.File;
import java.net.URL;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class DrumKit implements MouseListener {

	JLabel drumLabelWithImage;

	public void run() throws MalformedURLException {

		// 1. Make a JFrame variable and initialize it using "new JFrame()"
JFrame f = new JFrame();
		// 2. Make the frame visible and
		// set its default close operation to JFrame.EXIT_ON_CLOSE
f.setVisible(true);
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 3. Set the size of the frame
f.setSize(500, 500);
		// 4. Set the title of the frame
f.setTitle("frame");
		// 5. Make a JPanel variable and initialize it using "new JPanel().
JPanel j = new JPanel();
		// 6. Add the panel to the frame. (The panel is invisible.)
f.add(j);
		// 7. Download an image of a drum from the Internet. Drop it into your
		// Eclipse project under "recipe package(drum_kit)".
String d= "cymbal.jpg";
		// 8. Put the name of your image file in a String variable.

		// 9. Edit the next line to use your String variable
		// drumLabelWithImage = createLabelImage(drumImageString);
drumLabelWithImage = createLabelImage(d);

		// 10. Add the image to the panel
j.add(drumLabelWithImage);
		// 11. Set the layout of the panel to "new GridLayout()"
j.setLayout(new GridLayout());
		// 12. call the pack() method on the frame. Run your program. Do you see
		// your drum image?
f.pack();
		// 13. add this mouse listener to drumLabelWithImage
drumLabelWithImage.addMouseListener(this);
		// 18. Add more images to make a drumkit. Remember to add this mouse
		// listener to each one.

	}

	public void mouseClicked(MouseEvent e) {
		// 14. Print "mouse clicked" to the console. Run your program and watch
		// the console to see when this is printed.
System.out.println("mouse click");
		JLabel drumClicked = (JLabel) e.getSource(); // This line gets the label
														// that the mouse
														// clicked on

		// 15. Download a drum sound and drop it into your "recipe package(drum_kit)".
		// You can find it on freesound.org. To download it, log in as
		// leagueofamazing/code4life.

		// 16. If they clicked on the drumImage...
if (drumClicked == drumLabelWithImage) {

		// 17. ...use the playSound method to play a drum sound. Test to see if
		// it works
//playSound("drum.wav");
playSound("cymbal.wav");
}
	}

	private JLabel createLabelImage(String fileName) throws MalformedURLException {
		URL imageURL = getClass().getResource(fileName);
		if (imageURL == null) {
			System.err.println("Could not find image " + fileName);
			return new JLabel();
		}
		Icon icon = new ImageIcon(imageURL);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	private void playSound(String soundFile) {
		String path = "src/_04_drum_kit/";
			File sound = new File(path+soundFile);
			if (sound.exists()) {
				new Thread(() -> {
				try {
					Clip clip = AudioSystem.getClip();
					clip.open(AudioSystem.getAudioInputStream(sound));
					clip.start();
					Thread.sleep(clip.getMicrosecondLength()/1000);
				}
				catch (Exception e) {
					System.out.println("Could not play this sound");
				}}).start();
	 		}
			else {
				System.out.println("File does not exist");
			}
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}

}
