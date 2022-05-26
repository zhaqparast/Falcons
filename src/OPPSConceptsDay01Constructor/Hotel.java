package OPPSConceptsDay01Constructor;

public class Hotel {
	String name;
	String city;
	int rooms;

	public Hotel() {
		name = "";
		city = "";
		rooms = 0;
	}

	public Hotel(String newName) {
		name = newName;
		city = "";
		rooms = 0;
	}

	public Hotel(String newName, String newCity) {
		name = newName;
		city = newCity;
		rooms = 0;
	}

	public Hotel(String newName, String newCity, int numberOfRooms) {
		name = newName;
		city = newCity;
		rooms = numberOfRooms;
	}

}
