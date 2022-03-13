import org.jointheleague.graphical.robot.Robot;

public class ZAYDEN101 {

	public static void main(String[] args) {
		
		Robot a = new Robot();
		a.setSpeed(99999);
		a.penDown();
		a.setAngle(90);
		a.miniaturize();;
		a.hide();
		
		a.moveTo(900,500);
		
		for (int o = 0; o < 4; o++) {
			
		for (int i = 0; i < 9; i++) {
		a.move(100);
		a.turn(-135);
		}
		
		a.turn(45);
		
		}
		
		
		
		Robot b = new Robot();
		b.setSpeed(99999);
		b.setAngle(90);
		b.miniaturize();
		b.hide();
		
		b.moveTo(900,500);
		
		b.move(-50);
		b.turn(90);
		b.move(50);
		b.turn(-90);
		
		b.penDown();
		
		for (int o = 0; o < 4; o++) {
			
		for (int i = 0; i < 9; i++) {
		b.move(200);
		b.turn(-135);
		}
		
		b.turn(45);
		
		}
		
		
		
		Robot c = new Robot();
		c.setSpeed(99999);
		c.setAngle(90);
		c.miniaturize();
		c.hide();
		
		c.moveTo(900,500);
		
		c.move(-100);
		c.turn(90);
		c.move(100);
		c.turn(-90);
		
		c.penDown();
				
		for (int o = 0; o < 4; o++) {
			
		for (int i = 0; i < 9; i++) {
		c.move(300);
		c.turn(-135);
		}
		
		c.turn(45);
		
		}
		
		
		Robot d = new Robot();
		d.setSpeed(99999);
		d.setAngle(90);
		d.miniaturize();
		d.hide();
		
		d.moveTo(900,500);
		
		d.move(-150);
		d.turn(90);
		d.move(150);
		d.turn(-90);
		
		d.penDown();
		
		for (int o = 0; o < 4; o++) {
			
		for (int i = 0; i < 9; i++) {
		d.move(400);
		d.turn(-135);
		}
		
		d.turn(45);
		
		}
		
		
		
		Robot e = new Robot();
		e.setSpeed(99999);
		e.setAngle(90);
		e.miniaturize();
		e.hide();
		
		e.moveTo(900,500);
		
		e.move(-200);
		e.turn(90);
		e.move(200);
		e.turn(-90);
		
		e.penDown();
				
		for (int o = 0; o < 4; o++) {
			
		for (int i = 0; i < 9; i++) {
		e.move(500);
		e.turn(-135);
		}
		
		e.turn(45);
		
		}
		

		

		
		
		
	}
	
	
}
