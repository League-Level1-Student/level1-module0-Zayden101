import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class robort {
public static void main(String[] args) {
	
	

	
	Robot a=new Robot();
	a.miniaturize();
	a.setSpeed(100);
	a.penDown();
	
	Robot b=new Robot();
	b.miniaturize();
	b.setSpeed(100);
	b.penDown();
	
	Robot c=new Robot();
	c.miniaturize();
	c.setSpeed(100);
	c.penDown();
	
	for (int i = 0; i < 250; i++) {
		int x = new Random().nextInt(25); 
		int y = new Random().nextInt(360); 
	a.turn(y);
	a.move(x);
	//a.setRandomPenColor();
	int z = new Random().nextInt(25); 
	int w = new Random().nextInt(360); 
	b.turn(w);
	b.move(z);
	//b.setRandomPenColor();
	int v = new Random().nextInt(25); 
	int u = new Random().nextInt(360); 
	c.turn(u);
	c.move(v);
	//c.setRandomPenColor();
	
	
	}
	
	
}
}
