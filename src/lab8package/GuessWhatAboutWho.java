package lab8package;

import java.util.Scanner;

public class GuessWhatAboutWho {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int userInput;
		String userInput2, continueLearning, continueProgram;
		final String FAVFOOD = "favorite-food"; // The hyphen is a fudge. Remove it and the variable does not function
												// as intended. I'll bring this up in class.
		final String HOMETOWN = "hometown";

		String[] names = { "Derien", "Tyree", "Ben", "Gale", "Carl", "Lindsay" };
		String[] favFood = { "Millefeuille", "Steak Fries", "Garlic Toast", "Broccoli Casserole", "Wagyu Tartar",
				"Buddy's Pizza" };
		String[] homeTown = { "Reims", "Madison", "Dusseldorf", "London", "Tokyo", "Detroit" };

		System.out.println("==========================");
		System.out.println("Welcome to our Java Class!");
		System.out.println("==========================");
		System.out.println(" ");
		System.out.println("Say hello to the Class of Fall 2018:");
		System.out.println(" ");
		// List the class roster
		for (int i = 0; i < names.length; i++) {
			System.out.println((i + 1) + ". " + names[i]);
		}
		do {
			// Get student number
			userInput = Validator.getInt(scan,
					"\nWhich student would you like to know more about? \nPlease enter a number: ", 1, names.length);
			System.out.println("\nYou've selected " + names[userInput - 1] + "! \nWould you like to know more about "
					+ names[userInput - 1] + "?");
			// Get more info
			System.out.println("(Enter hometown or favorite-food)\n");
			userInput2 = scan.next();
			switch (userInput2) {
			case HOMETOWN:
				System.out.println("\n" + names[userInput - 1] + " is from " + homeTown[userInput - 1] + ".");

				System.out.println("Would you like to continue learning about " + names[userInput - 1] + "? (y/n)\n");
				continueLearning = scan.next();
				if (continueLearning.charAt(0) == 'y') {
					System.out.println(
							"\n" + names[userInput - 1] + "'s favorite food is " + favFood[userInput - 1] + ".");
				} else {
					break;
				}
				break;
			case FAVFOOD:
				System.out
						.println("\n" + names[userInput - 1] + " really likes to eat " + favFood[userInput - 1] + ".");

				System.out.println("Would you like to continue learning about " + names[userInput - 1] + "? (y/n)\n");
				continueLearning = scan.next();
				if (continueLearning.charAt(0) == 'y') {
					System.out.println("\n" + names[userInput - 1] + " is from " + homeTown[userInput - 1] + ".");
				} else {
					break;
				}
				break;
			default:
				System.out.println("Sorry, that data does not exist.");
				break;
			}
			System.out.println("\nWould you like to continue? (y/n)");
			continueProgram = scan.next();
		} while (continueProgram.charAt(0) == 'y' || continueProgram.charAt(0) != 'n');
		System.out.println("\nVery well. See you next time!");
		scan.close();
	}

}
