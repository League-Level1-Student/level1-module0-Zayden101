import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class azazazazdww {
public static void main(String[] args) {
	
	Robot a=new Robot();
	a.miniaturize();
	a.setSpeed(9999);
	a.penDown();
	
	for (int i = 0; i < 100; i++) {
	
	int x = new Random().nextInt(360); 
	int y = new Random().nextInt(5); 
	if(y==(1)) {
	a.setRandomPenColor();
	}
	
	a.move(25);
	a.turn(x);
	
	}
	
	
	
}
}
