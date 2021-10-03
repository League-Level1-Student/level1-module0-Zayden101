import java.awt.Color;
import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class iddkdkd {
public static void main(String[] args) {
	Robot a = new Robot();
	
	a.setSpeed(99999);
	a.penDown();
	a.miniaturize();
	
	int x = 10;
	int z = new Random().nextInt(6);
	if(z==1) {
		a.setPenColor(Color.red);
		for (int i = 0; i < 500; i++) {
			a.move(x);
			a.turn(80);
			x+=1;
			}
	}

	if(z==2) {
		a.setPenColor(Color.orange);
		for (int i = 0; i < 500; i++) {
			a.move(x);
			a.turn(60);
			x+=1;
			}
	}
	
	if(z==3) {
		a.setPenColor(Color.yellow);
		for (int i = 0; i < 500; i++) {
			a.move(x);
			a.turn(95);
			x+=1;
			}
	}
	
	if(z==4) {
		a.setPenColor(Color.GREEN);
		for (int i = 0; i < 500; i++) {
			a.move(x);
			a.turn(50);
			x+=1;
			}
	}
	
	if(z==5) {
		a.setPenColor(Color.blue);
		for (int i = 0; i < 500; i++) {
			a.move(x);
			a.turn(110);
			x+=1;
			
			}
	}
	

	if(z==6) {
		int t = 80;
		a.setPenColor(Color.magenta);
		for (int i = 0; i < 500; i++) {
	
			a.move(x);
			a.turn(t);
			x+=1;
			t+=1;
			}
	}
	
}
}
