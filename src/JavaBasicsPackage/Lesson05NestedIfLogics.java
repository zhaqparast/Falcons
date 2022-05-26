package JavaBasicsPackage;

public class Lesson05NestedIfLogics {

	public static void main(String[] args) {

		int age = 60;
		double price = 500;
		boolean primeMember = true;

		// if it is a prime member, we give 5% discount
		// if age is more than 20, we give another 3% discount
		// if age is more than 30, we give another 2% discount
		// if age is more than 40, we give another 1% discount
		// for non prime members, we give 2% discount
		// if age is more than 60, we add another 1% discount

		if (primeMember) {
			if (age > 40) {
				// we give 6% discount
				System.out.println("You are saving 6% or $" + (price * 0.06) + ". Your total is $"
						+ (price - (price * 0.06)) + ".\n");
			} else if (age > 30) {
				// we give 7% discount
				System.out.println("You are saving 7% or $" + (price * 0.07) + ". Your total is $"
						+ (price - (price * 0.07)) + ".\n");
			} else if (age > 20) {
				// we give 8% discount
				System.out.println("You are saving 6% or $" + (price * 0.08) + ". Your total is $"
						+ (price - (price * 0.08)) + ".\n");
			} else {
				// We will only give 5% discount regardless of the age
				System.out.println("We give this person " + price * 0.05 + " $ discount.\n");
			}
		} else {
			if (age > 60) {
				// We will give this person 3% discount
				System.out.println("We give this person " + price * 0.03 + " $ discount.\n");
			} else {
				// We will only give 2% discount
				System.out.println("We give this person " + price * 0.02 + " $ discount.\n");
			}
		}

		if (primeMember && age > 20) {
			System.out.println(price * 0.08);
			// 5% + 3% discount
		} else if (primeMember && age > 30) {
			System.out.println(price * 0.07);
			// 5% + 2% discount
		} else if (primeMember && age > 40) {
			System.out.println(price * 0.06);
			// 5% + 1% discount
		} else if (!primeMember && age > 60) {
			System.out.println(price * 0.03);
			// 2% + 1% discount
		} else if (!primeMember && age <= 60) {
			System.out.println(price * 0.02);
			// only 2% discount
		}

		// create 3 booleans 1. idPresent 2. ageLimit 3. balancePaid
		// if ageLimit is true, id is true, balancePaid is true, print sell
		// if ageLimit is true, id is true, balancePais is not true, print not enough
		// balance on card
		// if ageLimit is true, id is not true, print no id needed
		// if ageLimit is not true, print age limit is not met.

		boolean idPresent = true;
		boolean ageLimit = false;
		boolean balancePaid = true;

		if (ageLimit) {
			if (idPresent && balancePaid) {
				System.out.println("Sell the liquor.\n");
			} else if (idPresent && !balancePaid) {
				System.out.println("Not enough balance on card.\n");
			} else if (!idPresent && balancePaid) {
				System.out.println("Don`t sell the liquor! ID is required.\n");
			}

		} else {
			System.out.println("Age limit is not met. Don`t sell the liquor.\n");
		}

		boolean iHaveValidPassport = true;
		boolean iHaveValidTicket = false;
		boolean frequentFlyer = true;

		if (iHaveValidPassport) {
			if (iHaveValidTicket) {
				if (frequentFlyer) {
					System.out.println("Upgrade to VIP and issue a boarding pass.\n");
				} else {
					System.out.println("Issue an economy class boarding pass.\n");
				}
			} else {
				System.out.println("Contact your local travel agency to change your ticket.\n");
			}

		} else {
			System.out.println("You can't travel with an invalid passport.\n");
		}

		double weight = 1.7;
		double fuel = 20.7;
		boolean extraFuel = false;
		boolean roadIsPaved = true;

		if (roadIsPaved) {
			if (fuel >= 20.7) {
				if (extraFuel) {
					if (weight <= 1.7) {
						System.out.println("It would take me 13 hours to reach my destination.\n");
					} else {
						System.out.println("It would probably take more than 20 hours to reach my destination.\n");
					}
				} else {
					System.out.println("I have to refuel along the way to avoid running out of fuel.\n");
				}
			} else {
				System.out.println("I will have to fill up the tank before departure.\n");
			}
		} else {
			System.out.println("I will probably have to prepare for a long and rough ride than normal.\n");
		}

		boolean validRentalContract = true;
		boolean utilityBills = true;
		double feesToBePaid = 35;
		boolean passTheTest = false;

		if (validRentalContract) {
			if (utilityBills) {
				if (feesToBePaid >= 35) {
					if (passTheTest) {
						System.out.println("You will get your driving permit with Real ID credintials.\n");
					} else {
						System.out.println("You have two more chances to pass.\n");
					}
				} else {
					System.out.println(
							"You will have to pay the full amount to be able to attend the soft skill test.\n");
				}
			} else {
				System.out.println(
						"You won`t be able to get a Real ID but you would still be able to just get a driver license.\n");
			}
		} else {
			System.out.println(
					"You won`t be able to inititate the process without being able to provide proper documents.\n");
		}

		boolean needToEat = true;
		double budget = 50;
		int time = 70;

		if (needToEat) {
			if (time > 60) {
				if (budget > 20 && budget < 30) {
					System.out.println("Sandwich");
				} else {
					if (budget > 30) {
						System.out.println("Fancy");
					} else {
						System.out.println("Eggs");
					}
				}
			} else {
				if (budget > 100) {
					System.out.println("Cook fancy");
				} else {
					System.out.println("Cooc food");
				}
			}
		} else {
			if (budget > 10 && time > 50) {
				System.out.println("Icecream");
			} else {
				System.out.println("Work");
			}
		}

		boolean tintMyCar = true;
		double myBudget = 350;
		int timeNeeded = 150;

		if (tintMyCar) {
			if (myBudget >= 350) {
				if (timeNeeded >= 150) {
					System.out.println("I will take my car to King Auto Tint to get its windows tinted.\n");
				} else {
					System.out.println("I will call a mobile tinter to get my car's windows tinted.\n");
				}
			} else {
				if (myBudget < 350) {
					if (timeNeeded >= 240) {
						System.out.println(
								"I will buy the film myself and call Ghulam to come and help me with tiniting.\n");
					} else {
						System.out.println(
								"I will wait till the next day when Ghulam shows up to help me get my car's windows tinted.\n");
					}
				} else {
					System.out.println(
							"I will call a mobile tinter and assist him with tinting my car windows so I can save some money.\n");
				}
			}
		} else {
			if (myBudget > 450 && timeNeeded <= 720) {
				System.out.println("I will take my car to get it detailed.\n");
			} else {
				System.out.println("I will, instead, take my car for a wash at Quick Quack.\n");
			}
		}

		boolean flightsResume = true;
		double availableBalance = 2000;
		boolean getATicket = true;
		int daysTillIFly = 13;

		// if flights resume and if i can get a ticket and if i have 13 days to leave
		// and I have 2000$, I will travel directly to Kabul
		// But if flights resume and if I get a ticket and have 2000 $ but less than 13
		// days to leave for Kabul, I
		// will try to change to an earlier flight, otherwise, I have to postpone my
		// travel.
		// But if flights resume and I can get a ticket but have lass than 2000$ on me
		// and have less than 13 days to go, I will call the travel agence to see
		// if they could help me get an earlier flight, otherwise, I will have to borrow
		// some money from a friend to change to an earlier date for departure
		// But if flights resume but I can`t get a ticket, I will try again the next
		// day, otherwise, I will have to cancel my plans for traveling to Afghanistan.

		// Otherwise, if I can get a Cruise ticket and if I can go to Turkey and if I
		// have 1000$ left on my balance, I will try booking a flight from Istambul
		// to Kabul but if don`t have 1000$, I will instead rent a car. But if get a
		// cruise ticket but can`t go to Turkey, I will return home.

		if (flightsResume) {
			if (getATicket) {
				if (availableBalance < 1800) {

					if (daysTillIFly < 13) {
						System.out.println("I will travel directly to Kabul.\n");
					} else {
						if (daysTillIFly < 13) {
							System.out.println("I will try to change the booking to an earlier flight.\n");
						} else {
							System.out.println("I have to postpone my travel to Kabul\n");
						}
					}
				} else {
					if (availableBalance <= 2000 && daysTillIFly <= 13) {
						System.out.println(
								"I will call the travel agency to see if they can get me an earlier flight for Kabul.\n");
					} else {
						System.out.println(
								"I will have to borrow some money from a friend to change my ticket to an earlier date.\n");
					}

				}
			} else {
				if (flightsResume && !getATicket) {
					System.out.println("I will have to try again the next day to see if I can get a ticket.\n");
				} else {
					System.out.println("I will have to cancel my trip to Kabul.\n");
				}

			}
		} else {
			if (availableBalance >= 1000) {
				System.out.println("I will book a flight from Istanbul to Kabul.\n");
			} else {
				if (availableBalance < 1000) {
					System.out.println("I will rent a car and drive from Istanbul all the way to Kabul.\n");
				} else {
					System.out.println("I will return home.\n");
				}
			}
		}

		boolean rich = true;
		boolean haveAPrivateJet = false;
		boolean ristrictions = true;

		if (rich) {
			if (haveAPrivateJet) {
				if (!ristrictions) {
					System.out.println("I will embark on a journey on lifetime to tour around the world.\n");
				} else {
					System.out.println("I will have to wait for my dreams to come true.\n");
				}
			} else {
				if (rich && !ristrictions) {
					System.out.println("I will charter a private jet to travel around the world\n");
				} else {
					System.out.println("I will join my friend who has a private jet to travel around the world.\n");
				}
			}
		} else {
			if (!ristrictions) {
				System.out.println("I will instead buy a business class ticket to tour around the world.\n");
			} else {
				System.out.println("I will obey the travel ristrictions and will stay home.\n");
			}

		}
	}

}
