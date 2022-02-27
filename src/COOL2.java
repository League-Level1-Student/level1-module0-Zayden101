import org.jointheleague.graphical.robot.Robot;

public class COOL2 {
public static void main(String[] args) {
	
	int x = 20;
	
	Robot a = new Robot();
	a.setSpeed(99999999);
	a.miniaturize();
	Robot b = new Robot();
	b.setSpeed(99999999);
	b.miniaturize();
	Robot c = new Robot();
	c.setSpeed(99999999);
	c.miniaturize();
	Robot d = new Robot();
	d.setSpeed(99999999);
	d.miniaturize();
	
	a.turn(90);
	a.move(500);
	a.turn(90);
	a.move(175);
	b.turn(90);
	b.move(500);
	b.turn(90);
	b.move(175);
	c.turn(90);
	c.move(500);
	c.turn(90);
	c.move(175);
	d.turn(90);
	d.move(500);
	d.turn(90);
	d.move(175);
	
	a.penDown();
	b.penDown();
	c.penDown();
	d.penDown();

	
	
	a.turn(-35);
	b.turn(35);
	c.turn(-35);
	d.turn(35);
	
	
	
	
	for (int i = 0; i < 125; i++) {
		
	
	for (int ii = 0; ii < 6; ii++) {
	a.move(x);
	a.turn(20);
	
	b.move(x);
	b.turn(-20);
	
	c.move(-x);
	c.turn(20);
	
	d.move(-x);
	d.turn(-20);
	}
	
	for (int ii = 0; ii < 6; ii++) {
		
	a.penUp();
	b.penUp();
	c.penUp();
	d.penUp();
	
	
	a.move(x);
	a.turn(20);
	
	b.move(x);
	b.turn(-20);
	
	c.move(-x);
	c.turn(20);
	
	d.move(-x);
	d.turn(-20);
	}
	
	for (int ii = 0; ii < 6; ii++) {
		
		a.penDown();
		b.penDown();
		c.penDown();
		d.penDown();
		
	a.move(x);
	a.turn(20);
	
	b.move(x);
	b.turn(-20);
	
	c.move(-x);
	c.turn(20);
	
	d.move(-x);
	d.turn(-20);
	}
	
	x+=10;
	
	}
	
	
}
}
