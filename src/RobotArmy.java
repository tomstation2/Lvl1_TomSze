
public class RobotArmy {
	public static void main(String[] asd) {
		// 1. create a new human
		Human sub = new Human("John Connor");
		// 2. create a new Robot army of good and evil robots.
		Robot term01 = new Robot(" T-800 Model 101", false);
		Robot term02 = new Robot("T-1000", true);
		Robot term03 = new Robot(" T-801 Model 101", false);
		Robot term04 = new Robot("T-1001", true);
		Robot term05 = new Robot(" T-802 Model 101", false);
		Robot term06 = new Robot("T-1002", true);
		Robot term07 = new Robot(" T-803 Model 101", false);
		Robot term08 = new Robot("T-1003", true);
		Robot term09 = new Robot(" T-804 Model 101", false);
		Robot term10 = new Robot("T-1004", true);
		Robot term11 = new Robot(" T-805 Model 101", false);
		Robot term12 = new Robot("T-1005", true);
		Robot term13 = new Robot(" T-806 Model 101", false);
		Robot term14 = new Robot("T-1006", true);
		Robot term15 = new Robot(" T-807 Model 101", false);
		Robot term16 = new Robot("T-1007", true);
		Robot term17 = new Robot(" T-808 Model 101", false);
		Robot term18 = new Robot("T-1008", true);
		Robot term19 = new Robot(" T-809 Model 101", false);
		Robot term20 = new Robot("T-1009", true);
		Robot term21 = new Robot(" T-810 Model 101", false);
		Robot term22 = new Robot("T-1010", true);
		Robot term23 = new Robot(" T-811 Model 101", false);
		Robot term24 = new Robot("T-1011", true);
		// 3. command your robot army to destroy a human
		term01.destroy(sub);
		term02.destroy(sub);
		term03.destroy(sub);
		term04.destroy(sub);
		term05.destroy(sub);
		term06.destroy(sub);
		term07.destroy(sub);
		term08.destroy(sub);
		term09.destroy(sub);
		term10.destroy(sub);
		term11.destroy(sub);
		term12.destroy(sub);
		term13.destroy(sub);
		term14.destroy(sub);
		term15.destroy(sub);
		term16.destroy(sub);
		term17.destroy(sub);
		term18.destroy(sub);
		term19.destroy(sub);
		term20.destroy(sub);
		term21.destroy(sub);
		term22.destroy(sub);
		term23.destroy(sub);
		term24.destroy(sub);
	}
}

/**
 * Human Class
 */
class Human {
	String name;
	boolean isAlive;

	public Human(String name) {
		this.name = name;
		this.isAlive = true;
	}

	public String getName() {
		return name;
	}

	public void die() {
		isAlive = false;
	}
}

/**
 * Robot Class
 */
class Robot {
	boolean isEvil;
	String name;

	public Robot(String name, boolean isEvil) {
		this.name = name;
		this.isEvil = isEvil;
	}

	public void destroy(Human man) {
		if (isEvil) {
			System.out
					.println("Beep Boop Pew! Oh no! the robot " + name + " blasted " + man.getName() + "'s head off!");
			man.die();
		} else {
			System.out.println("No! The robot " + name + " loves " + man.getName() + "!");
		}
	}
}
// When i'm a walking i strut my stuff and i'm so strung out
// i'm high as a kite and i just might start to check you out
// Let me go on like I
// Blister in the sun
// Let me go on
// Big hands, I know you're the one
// Body and beats,
// I stain my sheets
// I don't even know why
// My girlfriend, she's at the end,
// She is starting to cry
// Let me go on like I
// Blister in the sun
// Let me go on
// Big hands, I know you're the one
// (2x)
