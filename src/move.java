import java.awt.Color;
import java.util.Iterator;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class move {
public static void main(String[] args) {

int ang = 0;
int dis = 50;
int rep = 100;
int wid = 1;
String penv = "On";
String col = "Black";


Robot a = new Robot();

a.penDown();
a.setSpeed(9999999);
a.setPenColor(Color.black);
a.setPenWidth(1);


for (int i = 0; i < 100; i++) {

int move = JOptionPane.showOptionDialog(null, "Menu" + "                                   Angle: " + ang + "                   Travel Distance: " +  dis + "                  Color: " + col + "                 Pen Thickness: " + wid + "                     Pen: " + penv, "Title", 0, JOptionPane.INFORMATION_MESSAGE, null,
new String[] { "Forwards", "Backwards", "Left", "Right", "Turn", "Travel Distance", "Color", "Thinkness", "Pen", "Effects", "Stop" }, null); //ADD LINE THINKNESS, COLOR, (SIZE)

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
int color = JOptionPane.showOptionDialog(null, "Select Color" + "               Color: " + col, "Title", 0, JOptionPane.INFORMATION_MESSAGE, null,
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




//Thickness
if (move==7) {

for (int o = 0; i < 100; i++) {
int width = JOptionPane.showOptionDialog(null, "Select Line Thickness" + "               Thickness: " + wid, "Title", 0, JOptionPane.INFORMATION_MESSAGE, null,
new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Back to Menu" }, null);
//1
if (width==0) {
a.setPenWidth(1);
wid = 1;
}
//2
if (width==1) {
a.setPenWidth(2);
wid = 2;
}
//3
if (width==2) {
a.setPenWidth(3);
wid = 3;
}
//4
if (width==3) {
a.setPenWidth(4);
wid = 4;
}
//5
if (width==4) {
a.setPenWidth(5);
wid = 5;
}
//6
if (width==5) {
a.setPenWidth(6);
wid = 6;
}
//7
if (width==6) {
a.setPenWidth(7);
wid = 7;
}
//8
if (width==7) {
a.setPenWidth(8);
wid = 8;
}
//9
if (width==8) {
a.setPenWidth(9);
wid = 9;
}
//10
if (width==9) {
a.setPenWidth(10);
wid = 10;
}
//Back to Menu
if (width==10) {
break;
}
}
}


if (move==8) {
int pen = JOptionPane.showOptionDialog(null, "Pen:    " + penv, "Title", 0, JOptionPane.INFORMATION_MESSAGE, null,
new String[] { "Off", "On"}, null);
if(pen==0) {
a.penUp();
penv="Off";
}

if(pen==1) {
a.penDown();
penv="On";
}

}



//Effect
if (move==9) {
int effect = JOptionPane.showOptionDialog(null, "Effects", "Title", 0, JOptionPane.INFORMATION_MESSAGE, null,
new String[] { "Sparkle", "Miniaturize", "Invisible" }, null);

if(effect==0)
{
int sparkle = JOptionPane.showOptionDialog(null, "Activate and Deactive Sparkle Here", "Title", 0, JOptionPane.INFORMATION_MESSAGE, null,
new String[] { "Activate", "Deactivate" }, null);
//yes
if (sparkle==0) {
a.sparkle();
}
//no
if (sparkle==1) {
a.unSparkle();
}
}



if(effect==1)
{
int mini = JOptionPane.showOptionDialog(null, "Activate and Deactivate Miniaturize Here", "Title", 0, JOptionPane.INFORMATION_MESSAGE, null,

new String[] { "Activate", "Deactivate" }, null);
//yes
if (mini==0) {
a.miniaturize();
}
//no
if (mini==1) {
a.expand();
}
}

if(effect==2)
{
int show = JOptionPane.showOptionDialog(null, "Activate and Deactivate Invisiblity Here", "Title", 0, JOptionPane.INFORMATION_MESSAGE, null,

new String[] { "Activate", "Deactivate" }, null);
//yes
if (show==0) {
a.hide();
}
//no
if (show==1) {
a.show();
}
}

}






//Stop
if (move== 10) {
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

