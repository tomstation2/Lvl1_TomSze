public class FootballRunner{
	public static void main(String[] args) {
		Football f=new Football("packers",16);
		Football f2=new Football("steelers",15);
		Football f3=new Football("eagles",15);
		f.wins();
		f2.team();
		f3.team();
	}
}