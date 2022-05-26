import java.awt.Color;
import java.util.Iterator;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class move {
public static void main(String[] args) {

	int ang = 0;
	int dis = 50;
	int rep = 100;
	String col = "Black";
	
	
	Robot a = new Robot();
	
	a.penDown();
	a.setSpeed(9999999);
	a.setPenColor(Color.black);

	
	
	for (int i = 0; i < 100; i++) {
	
	int move = JOptionPane.showOptionDialog(null, "Menu" + "          " + rep, "Title", 0, JOptionPane.INFORMATION_MESSAGE, null,
			new String[] { "Forwards", "Backwards", "Left", "Right", "Turn", "Travel Distance", "Color", "Miniaturize", "Stop" }, null); //ADD LINE THINKNESS, COLOR, (SIZE)
	
	//Forwards
	if (move==0) {
		a.move(dis);
	}
	//Backwards
	if (move==1) {
		a.move(-dis);
	}
	//Left
	if (move==2) {
		a.turn(-90);
		ang-=90;
	}
	//Right
	if (move==3) {
		a.turn(90);
		ang+=90;
	} 
	//Turn
	if (move==4) {
		for (int o = 0; i < 360; i++) {
		int turn = JOptionPane.showOptionDialog(null, "Select Degree of Turn" + "         Angle:" + ang, "Title", 0, JOptionPane.INFORMATION_MESSAGE, null,
				new String[] { "1", "10", "45", "-1", "-10", "-45", "Back to Menu" }, null);
		//1
		if (turn==0) {
			a.turn(1);
			ang+=1;
		}
		//10
		if (turn==1) {
			a.turn(10);
			ang+=10;
		}
		//45
		if (turn==2) {
			a.turn(45);
			ang+=45;
		}
		//-1
		if (turn==3) {
			a.turn(-1);
			ang-=1;
		} 
		//-10
		if (turn==4) {
			a.turn(-10);
			ang-=10;
		}
		//-45
		if (turn==5) {
			a.turn(-45);
			ang-=45;
		} 
		//Back to Menu
		if (turn==6) {
			break;
		} 
		
		if(ang>360) {
			ang=ang-360;
		}
		
		if(ang<0) {
			ang=ang+360;
		}
		
	}
	}
	
	//Stop
	if (move==5) {
		for (int o = 0; i < 100; i++) {
		int distance = JOptionPane.showOptionDialog(null, "Select Travel Distance" + "         Travel Distance:" + dis, "Title", 0, JOptionPane.INFORMATION_MESSAGE, null,
				new String[] { "10", "20", "30", "40", "50", "100", "Back to Menu" }, null);
		//10
		if (distance==0) {
			dis=10;
		}
		//20
		if (distance==1) {
			dis=20;
		}
		//30
		if (distance==2) {
			dis=30;
		}
		//40
		if (distance==3) {
			dis=40;
		} 
		//-10
		if (distance==4) {
			dis=50;
		}
		//-45
		if (distance==5) {
			dis=100;
		} 
		//Back to Menu
		if (distance==6) {
			break;
		} 
	}
	}
	
	
	//color
	if (move==6) {

		for (int o = 0; i < 100; i++) {
		int color = JOptionPane.showOptionDialog(null, "Select Travel Distance" + "               Color: " + col, "Title", 0, JOptionPane.INFORMATION_MESSAGE, null,
				new String[] { "Black", "White", "Red", "Orange", "Yellow", "Green", "Blue", "Back to Menu" }, null);
		//black
		if (color==0) {
			a.setPenColor(Color.black);
			col = "Black";
		}
		//white
		if (color==1) {
			a.setPenColor(Color.white);
			col = "White";
		}
		//red
		if (color==2) {
			a.setPenColor(Color.red);
			col = "Red";
		}
		//orange
		if (color==3) {
			a.setPenColor(Color.orange);
			col = "Orange";
		} 
		//yellow
		if (color==4) {
			a.setPenColor(Color.yellow);
			col = "Yellow";
		}
		//green
		if (color==5) {
			a.setPenColor(Color.green);
			col = "Green";
		} 
		//blue
		if (color==6) {
			a.setPenColor(Color.blue);
			col = "Blue";
		} 
		//Back to Menu
		if (color==7) {
			break;
		} 
	}
	}
		
	
	//Miniaturize
	if (move==7) {
	int mini = JOptionPane.showOptionDialog(null, "Are You Sure You Want To Miniaturize Your Robot? This Cannot Be Undone!", "Title", 0, JOptionPane.INFORMATION_MESSAGE, null,
			new String[] { "Yes", "No" }, null);
	//yes
	if (mini==0) {
		a.miniaturize();
	}
	//no
	if (mini==1) {
		a.move(0);
	}
	}
	
	
	
	//Stop
	if (move==8) {
		System.exit(0);
	}
	
	
	
	rep-=1;
	
	
	
	
	
	
	
	
	if(ang>360) {
		ang=ang-360;
	}
	
	if(ang<0) {
		ang=ang+360;
	}
	
	
	
	
	
	
	}
	
}
}
