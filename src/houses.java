import java.awt.Color;
import java.util.Random;

import org.teachingextensions.logo.PenColors;
import org.teachingextensions.logo.Tortoise;

public class houses {
	public static void main(String[] args) {
		Tortoise.show();
		Tortoise.setSpeed(10);
		Tortoise.setX(50);
		Tortoise.setY(400);
		for (int i = 0; i <= 40; i++) {
			drawHouse();
		}

	}

	private static void drawHouse() {
		Random r = new Random();
		int height = r.nextInt(201) + 100;
		int roof = r.nextInt(2);
		Tortoise.setPenColor(PenColors.getRandomColor());
		Tortoise.move(height);
		if (roof == 0) {
			Tortoise.turn(45);
			Tortoise.move(20);
			Tortoise.turn(90);
			Tortoise.move(20);
		} else {
			Tortoise.turn(90);
			Tortoise.move(30);
			Tortoise.turn(90);
		}
		Tortoise.setAngle(180);
		Tortoise.move(height);
		Tortoise.setPenColor(Color.green);
		Tortoise.turn(-90);
		Tortoise.move(15);
		Tortoise.turn(-90);
	}
}
