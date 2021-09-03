import org.jointheleague.graphical.robot.Robot;

public class bbvgvg {
public static void main(String[] args) {
	int x = 1;
	
	Robot a = new Robot();
	a.miniaturize();
	a.setSpeed(999999);
	
	a.turn(90);
	a.move(500);
	a.turn(90);
	a.move(150);
	
for (int i = 0; i < 1000; i++) {
	a.penDown();
	x+=3;
	a.move(x);
	a.turn(90);
}
}
}
