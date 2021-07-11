import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class raimbbbo {
public static void main(String[] args) {
	Robot a=new Robot();
	a.miniaturize();
	a.setSpeed(9999999);

	for (int i = 0; i < 1000000; i++) {
	int rand = new Random().nextInt(255);
	int randd = new Random().nextInt(255);
	int randdd = new Random().nextInt(255);
	a.setWindowColor(rand, randd, randdd);
	a.move(1);
}
	
}
}
