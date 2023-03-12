import java.util.Iterator;

import org.jointheleague.graphical.robot.Robot;

public class test {

public static void main(String[] args) {
	
	
	Robot a = new Robot();
	a.setSpeed(99999);
	a.penDown();
	a.setAngle(90);
	a.miniaturize();;
	//a.hide();
	
	
	for (int j = 0; j < 9; j++) {
		
	for (int i = 0; i < 9; i++) {
	a.move(20);
	a.turn(40);
	}
	
	a.move(-10);
	
	for (int i = 0; i < 9; i++) {
	a.move(40);
	a.turn(40);
	}
	
	a.move(40);
	
	for (int i = 0; i < 9; i++) {
	a.move(-40);
	a.turn(40);
	}
	
	a.move(-10);
	a.turn(40);
	
	}
	
	

		for (int j = 0; j < 9; j++) {
			
		
		for (int i = 0; i < 9; i++) {
		a.move(80);
		a.turn(40);
		}
		
		a.move(15);
		a.turn(40);

		
		for (int i = 0; i < 9; i++) {
		a.move(-80);
		a.turn(40);
		}
		
		a.move(15);
		a.turn(40);
		}







}	

	
	
}
