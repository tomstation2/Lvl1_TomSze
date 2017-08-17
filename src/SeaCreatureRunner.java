
public class SeaCreatureRunner {
	public static void main(String[] args) {
		SeaCreature sc = new SeaCreature("Spongebob");
		SeaCreature sc2 = new SeaCreature("Patrick");
		SeaCreature sc3 = new SeaCreature("Squidward");
		sc.getName();
		sc.eat();
		sc.laugh();
		sc2.getName();
		sc2.eat();
		sc2.laugh();
		sc3.getName();
		sc3.eat();
		sc3.laugh();
	}
}