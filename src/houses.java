import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class houses {
	
public static void main(String[] args) {
	
	
Robot rob = new Robot();
rob.setSpeed(10);
rob.moveTo(10, 500);
rob.penDown();
rob.setPenWidth(5);
for (int i = 0; i < 10; i++)
{
Random ran = new Random();
int r = ran.nextInt(50)+50;
rob.move(r);
rob.turn(90);
rob.move(20);
rob.turn(90);
rob.move(r);
rob.turn(-90);
rob.setPenColor(0, 255, 0);
rob.move(20);
rob.turn(-90);
rob.setPenColor(0, 0, 0);
}	
rob.hide();	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
