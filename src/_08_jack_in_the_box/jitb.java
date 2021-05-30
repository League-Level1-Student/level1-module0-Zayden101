package _08_jack_in_the_box;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class jitb implements ActionListener {
JButton rightButton = new JButton();
JFrame frame = new JFrame();
JPanel panel = new JPanel();
int number;
void setup() {



frame.add(panel);
frame.setVisible(true);
rightButton.setText("Click me!");
rightButton.addActionListener(this);
panel.add(rightButton);
frame.pack();
frame.setTitle("Demanding Buttons");
}

@Override
public void actionPerformed(ActionEvent arg0) {
	JButton buttonPressed = (JButton) arg0.getSource();
number += 1;
System.out.println(number);

	frame.pack();
}


private void showPicture(String fileName) { 
     try {
           JLabel imageLabel = createLabelImage(fileName);
           JFrame frame = new JFrame();
           frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
           frame.add(imageLabel);
           frame.setVisible(true);
           frame.pack();
      } catch (Exception e) {
           e.printStackTrace();
      }
 }



private JLabel createLabelImage(String fileName) {
     try {
	          URL imageURL = getClass().getResource(fileName);
          if (imageURL == null) {
               System.err.println("Could not find image " + fileName);
               return new JLabel();
           } else {
                Icon icon = new ImageIcon(imageURL);
                JLabel imageLabel = new JLabel(icon);
                return imageLabel;
          }
      } catch (Exception e) {
           System.err.println("Could not find image " + fileName);
           return new JLabel();
     }
 }

	

}
