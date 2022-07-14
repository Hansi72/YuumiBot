import java.awt.AWTException;
import java.awt.Color;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

public class Yuumi {

	public static void main(String[] args) throws AWTException {
		Robot robot = new Robot();
		robot.delay(2000);
	
while(true) {
	for (int o = 0; o < 4; o++) {
		Cast(robot, 1);
		robot.delay(100);
		Cast(robot, 1);
		robot.delay(100);
	for (int i = 0; i < 12; i++) {
		Cast(robot, 3);
		robot.delay(100);
	}
}	
	Cast(robot, 2);
	}

	}

	static void Cast(Robot robot, int spell) {
		switch (spell) {
		case 1:
			robot.keyPress(KeyEvent.VK_1);
			robot.delay(100);
			robot.keyRelease(KeyEvent.VK_1);
			break;

case 2:
	robot.keyPress(KeyEvent.VK_2);
	robot.delay(100);
	robot.keyRelease(KeyEvent.VK_2);	
			break;
			
case 3:
	robot.keyPress(KeyEvent.VK_3);
	robot.delay(50);
	robot.keyRelease(KeyEvent.VK_3);
	break;
case 4:
	
	robot.keyPress(KeyEvent.VK_4);
	robot.delay(50);
	robot.keyRelease(KeyEvent.VK_4);
	break;
case 5:
	
	robot.keyPress(KeyEvent.VK_5);
	robot.delay(50);
	robot.keyRelease(KeyEvent.VK_5);
	break;
		default:
			break;
		}
		
	}

static void click(Robot robot, int x, int y) {
	robot.mouseMove(x, y);
	robot.delay(100);
	robot.mousePress(InputEvent.BUTTON1_MASK);
	robot.delay(50);
	robot.mouseRelease(InputEvent.BUTTON1_MASK);
	robot.delay(100);
	
}


static void mcord(Robot robot) {
	robot.delay(5000);
	Point p = MouseInfo.getPointerInfo().getLocation();
	int x = p.x;
	int y = p.y;
	System.out.println(x +"  "+ y);
	Color c;
	c = robot.getPixelColor(x, y);
	System.out.println("red:"+ c.getRed() + "blue:" + c.getBlue() + "Green:" + c.getGreen());
}
}