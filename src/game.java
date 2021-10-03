import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class game {
public static void main(String[] args) {
	
	Robot a = new Robot();
	a.setSpeed(999999);
	a.hide();
	a.miniaturize();
	a.penDown();
	
//String q=JOptionPane.showInputDialog(null,"choose");{
	
	
	
	//if(q.equals("a")); {
		int x = 1;
		int y = 1;
		for (int i = 0; i < 12; i++) {
		for (int o = 0; o < 20; o++) {
		
			a.move(x);
			a.turn(90);
		x+=y;
		y+=1;
		
		}
		for (int o = 0; o < 20; o++) {
			
			a.move(x);
			a.turn(90);
		x-=y;
		y-=1;
		
		}
		}
	//}
}
}
