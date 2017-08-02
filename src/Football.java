
public class Football {
	String myTeam;
	int myWins;
	public Football(String TeamName, int Wins){
		myTeam=TeamName;
		myWins=Wins;
	}
void team(){
	System.out.println("Go "+myTeam+" Go!");
}
void wins(){
	System.out.println("My team, the "+myTeam+", won "+myWins+" games.");
}
}
