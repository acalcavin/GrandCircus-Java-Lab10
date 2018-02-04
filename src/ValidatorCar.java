import java.util.Scanner;

public class ValidatorCar {
	
	public static String getString(Scanner sc, String prompt) {
		System.out.print(prompt);
		String s = sc.nextLine(); // read user entry
		
		/*  validate that input is not an int
		if (sc.hasNextInt()) {
			System.out.println("Not a valid entry.");
		}
		*/
		
		// sc.nextLine(); // discard any other data entered on the line
		return s;
	}


	public static int getInt(Scanner sc, String prompt) {
		int i = 0;
		boolean isValid = false;
		while (isValid == false) {
			System.out.print(prompt);
			if (sc.hasNextInt()) {
				i = sc.nextInt();
				isValid = true;
			} else {
				System.out.println("Error! Please enter a valid year.");
			}
			sc.nextLine(); // discard any other data entered on the line
		}
		return i;
	}
	
	public static int getInt(Scanner sc, String prompt, int min, int max) {
		int i = 0;
		boolean isValid = false;
		while (isValid == false) {
			i = getInt(sc, prompt);
			if (i < min)
				System.out.println("Error! Year must be " + min + " or greater.");
			else if (i > max)
				System.out.println("Error! Year must be " + max + " or less.");
			else
				isValid = true;
		}
		return i;
	}
	
	public static double getDouble(Scanner sc, String prompt) {
		double d = 0;
		boolean isValid = false;
		while (isValid == false) {
			System.out.print(prompt);
			if (sc.hasNextDouble()) {
				d = sc.nextDouble();
				isValid = true;
			} else {
				System.out.println("Error! Invalid decimal value. Try again.");
			}
			sc.nextLine(); // discard any other data entered on the line
		}
		return d;
	}
}
