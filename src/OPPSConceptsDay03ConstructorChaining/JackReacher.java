package OPPSConceptsDay03ConstructorChaining;

public class JackReacher {

	private String book;
	private String cast;
	private int length;
	private double budget;

	public JackReacher() {
		this.book = "";
		this.cast = "";
		this.length = 0;
		this.budget = 0;
	}

	public JackReacher(String book) {
		this();
		this.book = book;
	}

	public JackReacher(String book, String cast) {
		this(book);
		this.cast = cast;
	}

	public JackReacher(String book, String cast, int length) {
		this(book, cast);
		this.length = length;
	}

	public JackReacher(String book, String cast, int length, double budget) {
		this(book, cast, length);
		this.budget = budget;
	}

}
