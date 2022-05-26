package OPPSConceptsDay03ConstructorChaining;

public class FastAndFurious {

	private String name;
	private String cast;
	private String releaseDate;
	private double budget;

	public FastAndFurious() {
		this.name = "";
		this.cast = "";
		this.releaseDate = "";
		this.budget = 0;
	}

	public FastAndFurious(String name) {
		this();
		this.name = name;
	}

	public FastAndFurious(String name, String cast) {
		this(name);
		this.cast = cast;
	}

	public FastAndFurious(String name, String cast, String releaseDate) {
		this(name, cast);
		this.releaseDate = releaseDate;
	}

	public FastAndFurious(String name, String cast, String releaseDate, double budget) {
		this(name, cast, releaseDate);
		this.budget = budget;
	}

}
