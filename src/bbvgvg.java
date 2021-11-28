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
  	x+=2;
  	a.move(x);
  	a.turn(90);
  }
	
//for (int i = 0; i < 2000; i++) {
//	a.penDown();
//	x+=1;
//	a.move(x);
//	a.turn(72);
//}
	
//	for (int i = 0; i < 3000; i++) {
//	a.penDown();
//	x+=1;
//	a.move(x);
//	a.turn(60);
//}
	
//  for (int i = 0; i < 235; i++) {
//	a.penDown();
//	x+=4;
//	a.move(x);
//	a.turn(135);
//	
//}
	
//  for (int i = 0; i < 235; i++) {
//		a.penDown();
//		x+=4;
//		a.move(x);
//		a.turn(150);
//		
//	}
  
//  for (int i = 0; i < 235; i++) {
//		a.penDown();
//		x+=4;
//		a.move(x);
//		a.turn(175);
		
//	}
  
  
}
}

