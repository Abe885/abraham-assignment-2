package com.coderscampus;

import java.util.Scanner;
import java.util.Random;

public class Assignment2Application {

	public static void main(String[] args) {
		Random random = new Random();
		int gameNumber = random.nextInt(101);
		Scanner scanner = new Scanner(System.in);
		int userGuesses = 0;
		while (userGuesses < 5) {
			System.out.println("Pick a number between 1 and 100");
			int userInput = scanner.nextInt();

			if (userInput < 1 || userInput > 100) {
				System.out.println("Your  guess is not between 1 and 100, please try again");
				continue;
			}

			userGuesses++;

			if (userInput == gameNumber) {
				System.out.println("You win!");
				break;
			} else if (userInput < gameNumber) {
				System.out.println("Please pick a higher number");
			} else if (userInput > gameNumber) {
				System.out.println("Please pick a lower number");
			}  if (userGuesses == 5) {
				System.out.println("You lose! The number to guess was " + gameNumber);
			}
		
		}
		scanner.close();
	}
}
