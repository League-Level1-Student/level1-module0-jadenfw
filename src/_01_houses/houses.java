package _01_houses;
import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class houses {
//	Robot rob = new Robot();
// void house() {
//		
//		rob.setSpeed(10);
//		rob.moveTo(10, 500);
//		rob.penDown();
//		rob.setPenWidth(5); 
//	 for (int i = 0; i < 10; i++)
//	 {
//	Random ran = new Random();
//	int r = ran.nextInt(50)+50;
//	Random rann = new Random();
//	int r2 = rann.nextInt(255);
//	Random rannn = new Random();
//	int r3 = rannn.nextInt(3);
//	Random rannnn = new Random();
//	int r4 = rannnn.nextInt(2);
//	if(r3 == 1)
//	{
//		rob.setPenColor(r2, 0, 0);
//	}
//	if(r3 == 2)
//	{
//		rob.setPenColor(0, r2, 0);
//	}
//	if(r3 == 3)
//	{
//		rob.setPenColor(0, 0, r2);
//	}
//	rob.move(r);
//	if(r4==1)
//	{
//		rob.turn(90);
//		rob.move(20);
//		rob.turn(90);
//	}
//	else
//	{
//		rob.turn(45);
//		rob.move(10);
//		rob.turn(90);
//		rob.move(10);
//		rob.turn(45);
//	}
//	rob.move(r);
//	rob.turn(-90);
//	rob.setPenColor(0, 255, 0);
//	rob.move(20);
//	rob.turn(-90);
//	
//	
//	 }
//	 rob.hide();
//	}*/
public static void main(String[] args) {
	
//houses h= new houses();
//h.house();
	 
Robot rob = new Robot();
rob.setSpeed(10);
rob.moveTo(10, 500);
rob.penDown();
rob.setPenWidth(5);
for (int i = 0; i < 24; i++)
{
Random ran = new Random();
int r = ran.nextInt(50)+50;
Random rr = new Random();
int r2 = rr.nextInt(255);
Random rann = new Random();
int r3 = rann.nextInt(3);
Random rannn = new Random();
int r4 = rannn.nextInt(2);
rob.setPenColor(r2, 0, 0);

if(r3 == 1)
{
	rob.setPenColor(r2, 0, 0);
}
else if(r3 == 2)
{
	rob.setPenColor(0, r2, 0);
}
else
{
	rob.setPenColor(0, 0, r2);
}
rob.move(r);
if(r4 == 1)
{
rob.turn(90);
rob.move(20);
rob.turn(90);
}
else
{
rob.turn(45);
rob.move(10);
rob.turn(90);
rob.move(10);
rob.turn(45);
}
rob.move(r);
rob.turn(-90);
rob.setPenColor(0, 255, 0);
rob.move(20);
rob.turn(-90);

}	
rob.hide();	

}
}
