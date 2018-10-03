package virtual_pets_amok;

import java.util.Scanner;

public class VirtualPetShelterApp {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String beginNewGame = "";
		VirtualPetShelter shelterInstance = new VirtualPetShelter();
		// VirtualPet startPet = new VirtualPet("", "");
		shelterInstance.intake(new OrganicDog("Smasho", "Organic Dog"));
		shelterInstance.intake(new OrganicCat("Jabber", "Organic Cat"));
		shelterInstance.intake(new RobotDog("Krink", "Robot Dog"));
		shelterInstance.intake(new RobotCat("Kuell", "Robot Cat"));
		shelterInstance.intake(new OrganicCat("Missy", "Organic Cat"));

		String userOptions = "\nWhat would you like to do next?\n\n" + "\n\t" + "1. Water the organic pets\n\t"
				+ "2. Feed the organic pets\n\t" + "3. Entertain pets\n\t" + "4. Oil Robots\n\t" + "5. Clean\n\t"
				+ "6. Adopt a pet\n\t" + "7. Admit a pet\n\t" + "8. Twiddle your thumbs at pets' expense.\n\t"
				+ "9. Quit";

		System.out.println(
				"Welcome to...oof! Smasho! get off my leg! \n\nWell, as you can see, it's a bit chaotic here at Helter Skelter Pet and Robot Shelter. \n\nWe'd love to have your help. \n\nWhat would you like to do first?");

		do {

			for (VirtualPet pet : shelterInstance.petCollection()) {
				System.out.println(pet);
			}
			int litterBoxCleanliness = 50;
			System.out.println("Litterbox Cleanliness = " + litterBoxCleanliness);
			System.out.println(userOptions);
			int petOptions = input.nextInt();

			switch (petOptions) {

			case 1:// Water Pets - don't ask why feed and water are switched; I have no idea.
					// It works and I ain't messing with it.
				shelterInstance.feedPets();
				System.out.println(
						"All the warm-blooded animals take a cool drink of water. \nBetter get a mop; half of the water ended up on the floor.\n");

				break;

			case 2:// Feed Pets
				for (VirtualPet i : ((VirtualPetShelter) shelterInstance).petCollection()) {
					if (i instanceof OrganicPet) {
						System.out.println("Mun, crunch, scarf, and snarf, all organic pets have feasted.\n");
						shelterInstance.waterPets();
					}
				}
				break;

			case 3:// Entertain Pets
				System.out.println("How would you like to entertain the pets? \n1. Walk Dogs| 2. Play with all pets");
				int walkOrPlay = input.nextInt();

				switch (walkOrPlay) {
				// fix cat walking

				case 1:// Walk Pet
					System.out.println(
							"You leash the dogs, robot and living, and are taken for a wild ride through high grasses, after geese, and through mud.\n \"How did we go through mud?\" you think, \"It hasn't rained in weeks!\"\n The cats get the shelter to themselves for a while and everyone is happy.\n");
					shelterInstance.walkPets();
					break;// Walk Pet Break
				case 2:// Give toys
					System.out.println(
							"You've tossed balls of yarn and toys with catnip hidden within. \nThe cats, nip-mellowed, have created the next great piece of modern art in strewn string, which the robot \npets quickly destroy because string is in the way and serves no logical purpose.\n");
					System.out.println(
							"All the dogs in the shelter look at you, tails wagging, as if to say \"Throw the damn balls!\"\nPet paraphernalia crashes around as streaks of fur dash after rubber balls.\n");
					shelterInstance.playWithPets();
					break;// Give toys break
				}// End Entertain Pets
				break;// Play with all pets
			// Robot Begins:j

			case 4:// Oil Robots
				System.out.println(
						"The noisy squaks of corroding metal are soothed by the oil. \nThe robot pets are grateful.");
				shelterInstance.oilRobots();

				break;// Robot Pets Break\

			case 5:// Clean Litter box or Cages
				System.out.println("What would you like to clean? \n1. Litter box | 2. Dog Cages");
				int litterBoxOrCage = input.nextInt();
				if (litterBoxOrCage == 1) {
					System.out.println("The litter box is clean.");
					shelterInstance.cleanLitterBox();
				} else if (litterBoxOrCage == 2) {
					System.out.println("All of the dog cages are clean.");
				}

				break;

			case 6:// Adopt a pet
				System.out.println("Which pet would you like to adopt?");
				for (VirtualPet i : ((VirtualPetShelter) shelterInstance).petCollection()) {
					System.out.println(i.getPetName());
				}
				String petName = input.next();
				System.out.println("Congratulations, " + petName + "! You have been adopted. Enjoy your new home!");
				shelterInstance.adoptPet(petName);

				break;

			case 7:// Admit a pet
				System.out.println("Aw, poor thing.");
				for (VirtualPet i : ((VirtualPetShelter) shelterInstance).petCollection()) {
					System.out.println("What's the name?");
					String newPet = input.next();
					input.nextLine();
					System.out.println("What's kind of pet is it?");
					String petType;// = input.nextLine();
					petType = input.nextLine();
					VirtualPet addedPet = new VirtualPet(newPet, petType);
					shelterInstance.acceptPet(addedPet);
					System.out.println("Welcome, " + newPet + ". I hope you make some friends.");
				}
				break;

			case 8:// Do nothing
				System.out
						.println("These pets ain't gettin' any younger, ya know...\nYou better do something with 'em.");
				shelterInstance.doNothing();
				break;

			case 9:// Quit Game
				System.out.println("Thank you for playing. Goodbye.");
				System.exit(0);
				break;
			}

			shelterInstance.timeTickShelter();

		} while (shelterInstance.hasPets());
		System.out.println(
				"\nLooks like there aren't anymore pets in the shelter. \nWould you like to play again? (yes or no)");
		beginNewGame = input.next();
		if (beginNewGame.equalsIgnoreCase("yes")) {
			new Scanner(System.in);
		} else if (beginNewGame.equalsIgnoreCase("no")) {
			System.out.println("\nOK, bye! Hope to see you again soon!");
			System.exit(0);
		} else {
			System.out.println("\\nOK, bye! Hope to see you again soon!");
			System.exit(0);
		}
		input.close();
	}

}
