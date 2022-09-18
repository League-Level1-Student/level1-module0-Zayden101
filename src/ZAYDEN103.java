import org.jointheleague.graphical.robot.Robot;

public class ZAYDEN103 {

	public static void main(String[] args) {
		
		Robot a = new Robot();
		a.setSpeed(99999);
		a.penDown();
		a.setAngle(90);
		a.miniaturize();;
		a.hide();
		
		a.moveTo(900,475);
		
		for (int o = 0; o < 4; o++) {
			
		for (int i = 0; i < 9; i++) {
		a.move(100);
		a.turn(-100);
		}
		
		a.turn(45);
		
		}
		
		
		
		Robot b = new Robot();
		b.setSpeed(99999);
		b.setAngle(90);
		b.miniaturize();
		b.hide();
		
		b.moveTo(900,475);
		
		b.move(-50);
		b.turn(90);
		b.move(50);
		b.turn(-90);
		
		b.penDown();
		
		for (int o = 0; o < 4; o++) {
			
		for (int i = 0; i < 9; i++) {
		b.move(200);
		b.turn(-100);
		}
		
		b.turn(45);
		
		}
		
		
		
		Robot c = new Robot();
		c.setSpeed(99999);
		c.setAngle(90);
		c.miniaturize();
		c.hide();
		
		c.moveTo(900,475);
		
		c.move(-100);
		c.turn(90);
		c.move(100);
		c.turn(-90);
		
		c.penDown();
				
		for (int o = 0; o < 4; o++) {
			
		for (int i = 0; i < 9; i++) {
		c.move(300);
		c.turn(-100);
		}
		
		c.turn(45);
		
		}
		
		
		Robot d = new Robot();
		d.setSpeed(99999);
		d.setAngle(90);
		d.miniaturize();
		d.hide();

		

		

		
		
		
	}
	
	
}
