public class TeaParty {

	public String welcome(String name, boolean isWoman, boolean isKnighted) {
		if (isWoman == true) {
			return "Hello Ms. " + name;
		} else if (isKnighted == true) {
			return "Hello Sir " + name;
		} else {
			return "Hello Mr. " + name;
		}
	}

	public static void main(String[] args) {
		TeaParty party = new TeaParty();
		// party.welcome("George Orwell", false, false);
		// party.welcome("Jane Austen", true, false);
		// party.welcome("Issac Newton", false, true);
		System.out.println(party.welcome("Issac Newton", false, true));
		System.out.println(party.welcome("George Orwell", false, false));
		System.out.println(party.welcome("Jane Austen", true, false));
	}
}
