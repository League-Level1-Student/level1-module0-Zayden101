import org.jointheleague.graphical.robot.Robot;

public class COOL {
public static void main(String[] args) {
	
	Robot a = new Robot();
	a.setSpeed(99999999);
	a.miniaturize();
	a.penDown();
	Robot b = new Robot();
	b.setSpeed(99999999);
	b.miniaturize();
	b.penDown();
	Robot c = new Robot();
	c.setSpeed(99999999);
	c.miniaturize();
	c.penDown();
	Robot d = new Robot();
	d.setSpeed(99999999);
	d.miniaturize();
	d.penDown();
	
	a.turn(-45);
	b.turn(45);
	c.turn(-45);
	d.turn(45);
	
	
	
	for (int i = 0; i < 74; i++) {
	a.move(100);
	a.move(-90);
	a.turn(5);
	
	b.move(100);
	b.move(-90);
	b.turn(-5);
	
	c.move(-100);
	c.move(90);
	c.turn(5);
	
	d.move(-100);
	d.move(90);
	d.turn(-5);
	}
	
	
	
	
	
	
	
	
	
}
}
