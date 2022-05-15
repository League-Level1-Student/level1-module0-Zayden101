import java.awt.Color;


import org.jointheleague.graphical.robot.Robot;


public class IDK {


public static void main(String[] args) {

	

	int x=0;

	int y=0;

	int z=0;

	

	int r=1;

	int g=1;

	int b=1;

	

	Robot a = new Robot();

	

	a.setPenWidth(2);

	a.setSpeed(999999);

	a.miniaturize();

	a.penDown();

	a.setPenColor(Color.BLUE);

	

	for (int i = 0; i < 5000; i++) {


	a.move(x);

	a.turn(y);

	

	x+=1;

	y+=1;

	

	if (y==25) {

		z+=1;

	}

	

	if (z==1) {

		z=2;

		y=1;

		x+=-22;

		a.setPenColor(Color.RED);

		

	}

	

	if (z==3) {

		z=4;

		y=1;

		x+=-22;

		a.setPenColor(Color.RED);

		

	}

	

	if (z==5) {

		z=6;

		y=1;

		x+=-22;

		a.setPenColor(Color.BLUE);

		

	}

	

	if (z==7) {

		z=8;

		y=1;

		x+=-22;

		a.setPenColor(Color.BLUE);

		

	}

	

	

	

	if (z==9) {

		z=10;

		y=1;

		x+=-22;

		a.setPenColor(Color.GREEN);

		

	}

	

	if (z==11) {

		z=0;

		y=1;

		x+=-22;

		a.setPenColor(Color.GREEN);

		

	

	

	

	}

	

	

	}

	

	

	

	

}	

	

	

	

	

}


