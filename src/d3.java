

import org.jointheleague.graphical.robot.Robot;

public class d3 {
public static void main(String[] args) {
	
	Robot a=new Robot();
	a.miniaturize();
	a.setSpeed(999);
	a.penDown();
	a.setPenWidth(3);

	a.move(50);
	a.turn(90);
	a.move(50);
	a.turn(90);
	a.move(50);
	a.turn(90);
	a.move(50);
	a.turn(90);
	a.move(50);
	a.turn(45);
	a.move(30);
	a.turn(-45);
	a.turn(90);
	a.move(50);
	a.turn(90);
	a.move(50);
	a.turn(90);
	a.move(50);
	a.turn(90);
	a.move(50);
	a.turn(90);
	a.move(50);
	a.turn(90);
	a.turn(45);
	a.move(30);
	a.turn(-45);
	a.move(50);
	a.turn(-90);
	a.turn(-45);
	a.move(30);
	a.turn(180);
	a.move(30);
	a.turn(45);
	a.move(50);
	a.turn(90);
	a.turn(45);
	a.move(30);
	
	a.penUp();
	a.move(250);
}
}
