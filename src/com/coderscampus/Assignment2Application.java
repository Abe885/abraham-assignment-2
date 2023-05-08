package com.coderscampus;

import java.util.Scanner;
import java.util.Random;

public class Assignment2Application {

	public static void main(String[] args) {
		Random random = new Random();
		int gameNumber = random.nextInt(101);

		Scanner scanner = new Scanner(System.in);
		Integer userInput = returnUserInput(scanner);

		while (userInput == null) {
			System.out.println("Your  guess is not between 1 and 100, please try again");
			userInput = returnUserInput(scanner);
		}
		boolean userWin = false;
		for (int i = 0; i < 4; i++) {
			if (userInput == gameNumber) {
				System.out.println("you win!");
				userWin = true;
				break;
			} else if (userInput < gameNumber) {
				System.out.println("Please pick a higher number");
			} else if (userInput > gameNumber) {
				System.out.println("Please pick a lower number");
			}
			userInput = returnUserInput(scanner);
		}
		if (!userWin) {
			System.out.println("You lose!");
			System.out.println("the number to guess was: " + (gameNumber));
		}
	}

	public static Integer returnUserInput(Scanner scanner) {
		System.out.println("Pick a number between 1 and 100");
		String userInput = scanner.nextLine();
		Integer numericInput = Integer.parseInt(userInput);

		if (numericInput <= 100 && numericInput >= 1) {
			return numericInput;
		} else {
			return null;
		}
	}
}
