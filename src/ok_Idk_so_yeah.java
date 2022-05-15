import org.jointheleague.graphical.robot.Robot;

public class ok_Idk_so_yeah {
public static void main(String[] args) {
	
	int x = 10;
	int y = 50;
	
	Robot a = new Robot();
	
	
	a.setSpeed(9999999);
	a.miniaturize();
	a.penDown();
	
	
		for (int o = 0; o < 250; o++) {
	
	for (int i = 0; i < 7; i++) {
		
	a.move(50);
	a.turn(y);
	y-=1;
	}
	
	y+=8;
	
		}
	
	
	
}
	
	
}
