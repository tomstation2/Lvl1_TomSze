import java.awt.Color;

import info.gridworld.actor.Bug;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Location;
import info.gridworld.world.World;

public class LearningGridworld {
	public static void main(String[] args) {
		World w = new World();
		Bug b = new Bug();
		Bug b2 = new Bug();
		Flower f = new Flower();
		b2.setColor(Color.BLUE);
		b2.turn();
		b2.turn();
		Location l = new Location(2, 3);
		Location l2 = new Location(4, 6);
		Location l3 = new Location(4, 7);
		Location l4 = new Location(4, 5);
		w.show();
		w.add(l, b);
		w.add(l2, b2);
		w.add(l3, f);
		w.add(l4, f);
		for (int y = 0; y < 10; y++) {
		for (int x = 0; x < 10; x++) {
			Location l5 = new Location(y, x);
			Flower f2 = new Flower();
			f2.setColor(Color.RED);
			w.add(l5, f2);
		}
	}
}
}