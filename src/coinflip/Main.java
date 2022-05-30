package coinflip;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Coin test = new Coin();
		int choice;

		System.out.println("Welcome to the Coin Flip game!");
		do {
			System.out.print("Enter 1 to flip coin or enter 0 to quit: ");
			Scanner input = new Scanner(System.in);
			choice = input.nextInt();

			if (choice > 1 || choice < 0) {
				System.out.println("Invalid entry - please enter 1 or 0: ");
				choice = input.nextInt();
			} else if (choice == 1) {
				test.flip();
			}

		} while (choice != 0);
	}
}
