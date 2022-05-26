package OPPSConceptsDay02AccessModifiers;

public class Runner {

	public static void main(String[] args) {

		Airplane a1 = new Airplane();
		a1.setMake("Cessna");
		a1.setEngine(2);
		a1.setModel("310");
		a1.setEngineType("Propeller");
		System.out.println(a1.getMake() + " " + a1.getModel() + " is a small plane that has " + a1.getEngine() + " "
				+ a1.getEngineType() + " engines.");

		System.out.println();
		System.out.println("*************************************************************************");
		System.out.println();

		Boat b1 = new Boat();
		b1.setMake("BOSTON WHALER");
		b1.setModel("FISHING");
		b1.setSpeed(35);
		System.out.println(b1.getMake() + " is a boat manufacturing brand that produces " + b1.getModel()
				+ " boats.\nThese boats travel " + b1.getSpeed() + " mph.");

		System.out.println();
		System.out.println("****************************************************************************");
		System.out.println();

		Dam d1 = new Dam();
		d1.setName("Hoover Dam");
		d1.setLocation("Black Canyon between the states of Navada and Arizona");
		d1.setElevaton(376);
		d1.setHeight(221.4);
		d1.setWidth(200);

		System.out.println(d1.getName() + " is located in " + d1.getLocation() + ". Its elevation at \ncrest is "
				+ d1.getElevation() + " meters. It is " + d1.getHeight() + " meters high while it is " + d1.getWidth()
				+ " meters wide at the base.");
		System.out.println();
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		System.out.println();

		Eagle ae = new Eagle();
		ae.setName("Bald Eagle");
		ae.setTyoe("bird of prey");
		ae.setLifespan(20);
		ae.setWingspan(7.5);

		System.out.println("The " + ae.getName() + " is a " + ae.getType()
				+ " and the national bird of the \nUnited States." + " The " + ae.getName() + " normally ages up tp "
				+ ae.getLifespan() + " years int the \nwild and its wingspan reaches up to " + ae.getWingspan()
				+ " ft at adulthood.");

		System.out.println();
		System.out.println("**************************************************************************");
		System.out.println();

		FireStation fs = new FireStation();
		fs.setName("Metro Fire");
		fs.setFirefighterName("Alex McCoy");
		fs.setNoOfFirefighters(45);
		fs.setNoOfFireTrucks(7);
		fs.setNoOfWorkShifts(3);

		System.out
				.println("The " + fs.getName() + " station is located in Scaramento. \nIt has " + fs.getNoOfFireTrucks()
						+ " firetrucks which are operated by a crew of " + fs.getNoOfFirefighters() + " who work in "
						+ fs.getNoOfWorkShifts() + " work shifts. " + "\n" + fs.getFirefighterName() + " is one of the "
						+ fs.getNoOfFirefighters() + " fire fighterss who has been working there for seven years now.");

		System.out.println();
		System.out.println("_______________________________________________________________________");
		System.out.println();

		Ghostrider gr = new Ghostrider();
		gr.setCategory("Action/Fantasy");
		gr.setBudget(110000000);
		gr.setLeadCharacter("Johnny Blaze");
		gr.setLength(123);

		System.out.println("Ghost Rider is an " + gr.getCategory() + " film. Actor Nicholas Cage \nplayes "
				+ gr.getLeadCharacter() + ", a daredevil motorcyclist. This movie is " + gr.getLength()
				+ " minutes long and its budget is estimated \nto be around $" + gr.getBudget() + " million.");

		System.out.println();
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println();

		Hotel h1 = new Hotel();
		h1.setName("JW Marriott");
		h1.setLocation("Ankara");
		h1.setHeight(25);
		h1.setNoOfRooms(250);

		System.out.println("The " + h1.getName() + " hotel in " + h1.getLocation() + ", Turkey is " + h1.getHeight()
				+ " \nstories hight and has " + h1.getNoOfRooms() + " rooms.");
		System.out.println();
		System.out.println("******************************************************************************");
		System.out.println();

		India in1 = new India();
		in1.setCapitalCity("Dehli");
		in1.setName("India");
		in1.setWorldWonder("Taaj Mahal");
		in1.setNoOfLargeCities(47);
		in1.setPopulation(1397902013);
		in1.setNoOfStates(28);

		System.out.println(in1.getName() + " is the largest democracy int the world. " + in1.getCapitalCity()
				+ " is the capital of this country." + "\nIt has " + in1.getNoOfStates() + " states and "
				+ in1.getNoOfLargeCities() + " largest cities.\nThe Total population of this country as of 2021 is "
				+ in1.getPopulation() + " pepole. One of the seven wonders of the world\nis " + in1.getWorldWonder()
				+ " which is located in Agra near old " + in1.getCapitalCity() + ".");

		System.out.println();
		System.out.println("**************************************************************************");
		System.out.println();

		JamesBond jb = new JamesBond();
		jb.setName("No Time To Die");
		jb.setCategory("Spy/Action");
		jb.setLeadActor("Daniel Craig");
		jb.setLeadCharacter(007);
		jb.setReleaseCountry("United States");
		jb.setReleaseDate("October 8, 2021");
		jb.setBudget(250000000L);

		System.out.println(jb.getLeadActor() + " returns as " + jb.getLeadCharacter() + " in the latest "
				+ jb.getCategory() + " \nfilm of the James Bond saga which was released on " + jb.getReleaseDate()
				+ " in the " + jb.getReleaseCountry() + ".\nThe budget of this movie is estimated around $"
				+ jb.getBudget() + " million.");

		System.out.println();
		System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
		System.out.println();

		Kabul kbl = new Kabul();
		kbl.setName("Kabul");
		kbl.setCountry("Afghanistan");
		kbl.setStatus("capital");
		kbl.setPopulation(4335770);
		kbl.setArea(270.3);

		System.out.println(kbl.getName() + " is the " + kbl.getStatus() + " of " + kbl.getCountry()
				+ ". Its area is estimated to be around " + kbl.getArea()
				+ " square miles. \nThe most recent number of its population reaches " + kbl.getpopulation()
				+ " people.");

		System.out.println();
		System.out.println("_____________________________________________________________________________");
		System.out.println();

		Lumberjack lj = new Lumberjack();

		lj.setName("Jeffery Knox");
		lj.setOccupation("lumberjack");
		lj.setCompany("Pine Timbers");
		lj.setAge(37);
		lj.setSalary(7000);

		System.out.println(lj.getName() + " is " + lj.getAge() + " years old. He works as a " + lj.getOccupation()
				+ " in a timber \ncompany called " + lj.getCompany() + ". The company pays him $" + lj.getSalary());

		System.out.println();
		System.out.println("__________________________________________________________________________");
		System.out.println();

		Moter m = new Moter();
		m.setMake("Lexus");
		m.setModel("UX");
		m.setYearMake(2021);
		m.setPrice(40000);

		System.out.println("I have a " + m.getMake() + " " + m.getModel() + " " + m.getYearMake()
				+ " which I bought for $" + m.getPrice());
		System.out.println();
		System.out.println("000000000000000000000000000000000000000000000000000000000000000000000000");
		System.out.println();

		NoWhereToRun ntr = new NoWhereToRun();
		ntr.setLeadActor("Jean-Claude Van Damme");
		ntr.setLeadCharacter("Sam Gillen");
		ntr.setMovieName("Nowhere To Run");
		ntr.setBudget(64000000);
		ntr.setLength(94);

		System.out.println(ntr.getLeadActor() + " appears as " + ntr.getLeadCharacter() + " in the 1993 action film "
				+ ntr.getMovieName() + ".\nThe movie is " + ntr.getLength() + " minutes long and its budget was $"
				+ ntr.getBudget() + ".");

		System.out.println();
		System.out.println("************************************************************************");
		System.out.println();

		Orange or = new Orange();
		or.setFruit("Tangerine");
		or.setColor("Orange");
		or.setPricePerPound(2.99);
		or.setWeight(5.3);

		System.out.println(or.getFruit() + " has " + or.getColor() + " color. A single pound of it costs $"
				+ or.getPricePerPound() + ".\nIf I were to buy " + or.getWeight()
				+ " pounds, how much should I have to pay?\nThe total cost would be $"
				+ or.getWeight() * or.getPricePerPound() + ".");

		System.out.println();
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		System.out.println();

		Project pr = new Project();
		pr.setName("Aantan");
		pr.setType("GSM tower");
		pr.setLocation("Sacramento");
		pr.setBudget(45000);

		System.out.println("T-Mobile instaled " + pr.getName() + ", its latest " + pr.getType() + " in "
				+ pr.getLocation() + ". It cost the company around $" + pr.getBudget() + ".");

		System.out.println();
		System.out.println("_________________________________________________________________________");
		System.out.println();

		QuickQuack qk = new QuickQuack();
		qk.setEmployees(10);
		qk.setLocation("Watt Avenue");
		qk.setName("Quick Quack");
		qk.setSingleCarWashCost(15.99);
		qk.setNumberOfCarsWashed(500);
		qk.setMonthlyPackageType("Unlimited Good");
		qk.setMonthlyPackage(19.99);

		System.out.println("I usually take my car to " + qk.getName() + " Car Wash. It is located on "
				+ qk.getLocation() + ".\nThe car wash has " + qk.getEmployees() + " employees who wash around "
				+ qk.getNumberOfCarsWashed() + " cars on a dialy basis.\nThey charge $" + qk.getSingleCarWashCost()
				+ " for a single wash but they also offer " + qk.getMonthlyPackageType() + " package\nfor just $"
				+ qk.getMontlyPackage() + " a month.");

		System.out.println();
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println();

		Ramp rp = new Ramp();
		rp.setName("Charlie");
		rp.setLength(3.7);
		rp.setWidth(0.6);
		rp.setElevation(607);

		System.out.println("The " + rp.getName() + " ramp at DFW is located " + rp.getElevation()
				+ " feet above the sea level.\nIt is " + rp.getLength() + " miles long and " + rp.getWidth()
				+ " mile wide.");

		System.out.println();
		System.out.println("*****************************************************************************");
		System.out.println();

		TomJerry tj = new TomJerry();
		tj.setCartoonName("Tom & Jerry");
		tj.setCartoonCharacters("the cat as Tom and the mouse as Jerry");
		tj.setCreaterName("William Hanna and Joseph Barbera");
		tj.setYearFirstDisplayed(1940);

		System.out.println("The American animated series " + tj.getCartoonName()
				+ " was first produced and displayed in " + tj.getYearFirstDisplayed() + ".\nThe main characters, "
				+ tj.getCartoonCharacters() + ", were created by " + tj.getCreaterName() + ".");

		System.out.println();
		System.out.println("_________________________________________________________________________________");
		System.out.println();

		University uni = new University();
		uni.setFacultyName("Literature");
		uni.setName("Kabul University");
		uni.setNumberOfFaculties(22);
		uni.setStudents(22000);

		System.out.println(uni.getName() + " was established in 1932. It has " + uni.getNumberOfFaculties()
				+ " faculities one of which is " + uni.getFacultyName() + ".\nThe university has " + uni.getStudents()
				+ " students at the moment.");
		System.out.println();
		System.out.println("_____________________________________________________________________________________");
		System.out.println();

		Visa vis = new Visa();
		vis.setCardNumber(1234567891011121l);
		vis.setHolderName("Jumaddin Geyanwal");
		vis.setIssuedBy("AIB");
		vis.setValidity("11/25");

		System.out.println(
				"You can use the information below to set up my auto payment method:\nName of the card holder: "
						+ vis.getHolderName() + "\n" + "Card number: " + vis.getCardNumber() + "\n" + "Issued by: "
						+ vis.getIssuedBy() + "\n" + "Valid until: " + vis.getValidity());
		System.out.println();
		System.out.println("___________________________________________________________________________________");
		System.out.println();

		Workspace ws = new Workspace();
		ws.setName("King Auto Tint");
		ws.setAddress("2345 Fulton Ave");
		ws.setArea(500);
		ws.setRent(3000);

		System.out.println("I work in a tint shop on " + ws.getAddress() + ". It is called " + ws.getName()
				+ ".\nThe shop has an area of " + ws.getArea() + " square ft and my boss has rented it for $"
				+ ws.getRent() + " on monthly basis.");

		System.out.println();
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println();

		XMen xMen = new XMen();
		xMen.setName("X-Men First Class");
		xMen.setCast("Hugh Jackman");
		xMen.setCharacter("Wolverine");

		System.out
				.println(xMen.getCast() + " plays " + xMen.getCharacter() + " in the superhero film " + xMen.getName());

		System.out.println();
		System.out.println("_______________________________________________________________________________");
		System.out.println();

		YellowStone ys = new YellowStone();
		ys.setName("Yellow Stone National Park");
		ys.setLocation("Wyoming, Montana and Idaho");
		ys.setArea(2219791);
		ys.setYearDeclared(1872);

		System.out.println(ys.getName() + " was declared as the first national park in the United States in "
				+ ys.getYearDeclared() + " by\nPresident Grant. The park covers an area of " + ys.getArea()
				+ " acres between the states of " + ys.getLocation());

		System.out.println();
		System.out.println("__________________________________________________________________________________");
		System.out.println();

		Zealot z = new Zealot();
		z.setGroup("The Zealots");
		z.setStatus("political movement");
		z.setDate(1);
		z.setLocation("Judea Province");

		System.out.println(z.getGroup() + " were a " + z.getStatus() + " in the " + z.getDate()
				+ "st century Second Temple Judaism\nwhich sought to incite the people of " + z.getLocation()
				+ " to rebel against the Roman\nEmpire and expel it from the Holy Land by force of arms, most notably during the First Jewish–Roman War.");

	}

}
