import java.util.ArrayList;
import java.util.Scanner;

/*
 * Andrew Calabro-Cavin
 * Display list of cars
 * Let user select one, display info.
 * Ask user if wants to buy. If yes, remove from the list.
 * Redisplay the list.
 * 
 * Use ArrayList
 * Practice polymorphism, casting
 */

public class CarMenu {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int userSelection;

		// use an ArrayList to hold the cars
		ArrayList<Car> inventory = new ArrayList<Car>();

		inventory.add(new Car("Nikolai", "Model S", 2017, 54999.90));
		inventory.add(new Car("Fourd", "Escapade", 2017, 31999.90));
		inventory.add(new Car("Chewie", "Vette", 2017, 44989.95));
		inventory.add(new UsedCar("Hyonda", "Prior", 2015, 14795.50, 35987.6));
		inventory.add(new UsedCar("GC", "Chirpus", 2013, 8500.00, 12345.0));
		inventory.add(new UsedCar("GC", "Witherell", 2016, 14450.00, 3500.3));

		System.out.println("Menu Options:");

		// print ArrayList
		// add option to quit
		// standard for loop

		// while items exist in the inventory
		int numberCars = inventory.size();

		while (inventory.size() > 0) {

			int i = 0;
			for (i = 0; i < inventory.size(); i++) {

				System.out.print((i + 1) + ". ");
				System.out.print(inventory.get(i));
			}
			System.out.println((i + 1) + ". Quit\n");

			System.out.println("Which car would you like?");
			userSelection = scan.nextInt();
			scan.nextLine();

			// if selection, print selection
			// if quit, sysout "Have a great day!"
			if (userSelection == (i + 1)) {
				System.out.println("Have a great day!");
				break;
				
			} else {
				System.out.println(inventory.get(userSelection - 1));

				System.out.println("Would you like to buy this car? (y/n)");
				String buySelection = scan.nextLine();

				if (buySelection.equalsIgnoreCase("y")) {
					// remove object from ArrayList
					System.out.println("Excellent! Our finance department will be in touch shortly.");
					inventory.remove(i - 1);
					if (inventory.size() > 0) {
						System.out.println("Want to buy another?\n");
					}
				} else {
					System.out.println("Are you sure? Have another look at our inventory!\n");
				}

			} // end else

			// if ArrayList still contains objects, while continues; i remains, is reset

		} // end while

	}

}
