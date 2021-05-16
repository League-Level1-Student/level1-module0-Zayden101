import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class robort {
public static void main(String[] args) {
	
	

	
	Robot a=new Robot();
	a.miniaturize();
	a.setSpeed(100);
	a.penDown();
	a.setPenWidth(7);
	
	Robot b=new Robot();
	b.miniaturize();
	b.setSpeed(100);
	b.penDown();
	b.setPenWidth(7);
	
	Robot c=new Robot();
	c.miniaturize();
	c.setSpeed(100);
	c.penDown();
	c.setPenWidth(7);
	
	Robot d=new Robot();
	d.miniaturize();
	d.setSpeed(100);
	d.penDown();
	d.setPenWidth(7);

	Robot e=new Robot();
	e.miniaturize();
	e.setSpeed(100);
	e.penDown();
	e.setPenWidth(7);

	Robot f=new Robot();
	f.miniaturize();
	f.setSpeed(100);
	f.penDown();
	f.setPenWidth(7);
	
	for (int i = 0; i < 250; i++) {
	int x = new Random().nextInt(25); 
	int y = new Random().nextInt(360); 
	a.turn(y);
	a.move(x);
	a.setRandomPenColor();
	int z = new Random().nextInt(25); 
	int w = new Random().nextInt(360); 
	b.turn(w);
	b.move(z);
	b.setRandomPenColor();
	int v = new Random().nextInt(25); 
	int u = new Random().nextInt(360); 
	c.turn(u);
	c.move(v);
	c.setRandomPenColor();
	int s = new Random().nextInt(25); 
	int t = new Random().nextInt(360); 
	d.turn(t);
	d.move(s);
	d.setRandomPenColor();
	int r = new Random().nextInt(25); 
	int q = new Random().nextInt(360); 
	e.turn(q);
	e.move(r);
	e.setRandomPenColor();
	
	int o = new Random().nextInt(50); 
	int p = new Random().nextInt(360); 
	f.move(o);
	f.turn(p);
	f.setRandomPenColor();
	}

}
}
