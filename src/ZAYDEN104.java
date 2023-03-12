import org.jointheleague.graphical.robot.Robot;

public class ZAYDEN104 {

	public static void main(String[] args) {
		
		Robot a = new Robot();
		a.setSpeed(99999);
		a.penDown();
		a.setAngle(90);
		a.miniaturize();;
		a.hide();
		
		a.moveTo(900,450);
		
		for (int o = 0; o < 4; o++) {
			
		for (int i = 0; i < 6; i++) {
		a.move(50);
		a.turn(-155);
		}
		
		a.turn(45);
		
		}
		
		
		
		Robot b = new Robot();
		b.setSpeed(99999);
		b.setAngle(90);
		b.miniaturize();
		b.hide();
		
		b.moveTo(900,450);
		
		b.move(-50);
		b.turn(90);
		b.move(50);
		b.turn(-90);
		
		b.penDown();
		
		for (int o = 0; o < 4; o++) {
			
		for (int i = 0; i < 6; i++) {
		b.move(100);
		b.turn(-155);
		}
		
		b.turn(45);
		
		}
		
		
		
		Robot c = new Robot();
		c.setSpeed(99999);
		c.setAngle(90);
		c.miniaturize();
		c.hide();
		
		c.moveTo(900,450);
		
		c.move(-100);
		c.turn(90);
		c.move(100);
		c.turn(-90);
		
		c.penDown();
				
		for (int o = 0; o < 4; o++) {
			
		for (int i = 0; i < 6; i++) {
		c.move(150);
		c.turn(-155);
		}
		
		c.turn(45);
		
		}
		
		
		Robot d = new Robot();
		d.setSpeed(99999);
		d.setAngle(90);
		d.miniaturize();
		d.hide();
		
		d.moveTo(900,450);
		
		d.move(-150);
		d.turn(90);
		d.move(150);
		d.turn(-90);
		
		d.penDown();
		
		for (int o = 0; o < 4; o++) {
			
		for (int i = 0; i < 6; i++) {
		d.move(200);
		d.turn(-155);
		}
		
		d.turn(45);
		
		}
		
		
		
		Robot e = new Robot();
		e.setSpeed(99999);
		e.setAngle(90);
		e.miniaturize();
		e.hide();
		
		e.moveTo(900,450);
		
		e.move(-200);
		e.turn(90);
		e.move(200);
		e.turn(-90);
		
		e.penDown();
				
		for (int o = 0; o < 4; o++) {
			
		for (int i = 0; i < 6; i++) {
		e.move(250);
		e.turn(-155);
		}
		
		e.turn(45);
		
		}
		

		

		
		
		
	}
	
	
}
