/**
 * AUTHOR: JAMES EASY
 */

import java.util.Scanner;
public class RunProgram {
	public static void main(String[] args) {

		Scanner       allowUserToInput = new Scanner(System.in);
		RomanNumerals romNumObj        = new RomanNumerals();
		boolean       loop             = true;

		while (loop) {
			System.out.println(
					"Please enter a number between 1 and 3999. Enter 9999 to quit: ");
			int userInput = allowUserToInput.nextInt();

			while (userInput < 1 || userInput > 3999) {
				if (userInput == 9999) {
					System.exit(0);
				}
				System.out.println(
						"Usage: Number must be between 1 and 3999. Please try again.");
				userInput = allowUserToInput.nextInt();
			}
			System.out.println("Roman Numeral/s conversion: " +
			                   romNumObj.generate(userInput));
		}
	}
}
