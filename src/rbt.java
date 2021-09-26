import java.awt.Color;
import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class rbt {
public static void main(String[] args) {
	int x=1;
	
	Robot a = new Robot();
	
	a.miniaturize();
	a.setSpeed(999999);
	a.hide();
	a.setPenWidth(3);
	
	a.turn(90);
	a.move(500);
	a.turn(90);
	a.move(150);
	a.setWindowColor(Color.black);
	
	for (int i = 0; i < 300; i++) {
	a.penDown();
	int z = new Random().nextInt(5);
	int y = new Random(75).nextInt(120); 
	int w = new Random().nextInt(2);
		x+=z;
	a.move(x);
	a.turn(y);
	a.setPenColor(Color.blue);
	z = new Random().nextInt(5);
	y = new Random(75).nextInt(120); 
		x+=z;
	a.move(x);
	a.turn(y);
	a.setPenColor(Color.green);
	z = new Random().nextInt(5);
	y = new Random(75).nextInt(120); 
		x+=z;
	a.move(x);
	a.turn(y);
	a.setPenColor(Color.blue);
	z = new Random().nextInt(5);
	y = new Random(75).nextInt(120); 
		x+=z;
	a.move(x);
	a.turn(y);
	a.setPenColor(Color.green);
	//z = new Random().nextInt(5);
	//y = new Random(75).nextInt(120); 
		//x+=z;
	//a.move(x);
	//a.turn(y);
	//a.setPenColor(Color.blue);
}
	
	
}
}
