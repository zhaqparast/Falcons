package OPPSConceptsDay01Constructor;

public class Road {

	String name;
	String startingPoint;
	String endingPoint;
	double length;

	public Road() {
		name = "";
		startingPoint = "";
		endingPoint = "";
		length = 0;
	}

	public Road(String rName) {
		name = rName;
		startingPoint = "";
		endingPoint = "";
		length = 0;
	}

	public Road(String rName, String pointA) {
		name = rName;
		startingPoint = pointA;
		endingPoint = "";
		length = 0;
	}

	public Road(String rName, String pointA, String pointB) {
		name = rName;
		startingPoint = pointA;
		endingPoint = pointB;
		length = 0;
	}

	public Road(String rName, String pointA, String pointB, int rLength) {
		name = rName;
		startingPoint = pointA;
		endingPoint = pointB;
		length = rLength;
	}

}
