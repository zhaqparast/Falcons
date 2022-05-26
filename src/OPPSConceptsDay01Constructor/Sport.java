package OPPSConceptsDay01Constructor;

public class Sport {

	String name;
	String type;
	int players;

	public Sport() {
		name = "";
		type = "";
		players = 0;
	}

	public Sport(String sportName) {
		name = sportName;
		type = "";
		players = 0;
	}

	public Sport(String sportName, String sportType) {
		name = sportName;
		type = sportType;
		players = 0;
	}

	public Sport(String sportName, String sportType, int numberOfPlayers) {
		name = sportName;
		type = sportType;
		players = numberOfPlayers;
	}

}
