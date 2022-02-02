package com.coderscampus;

import java.util.Scanner;

public class CompoundInterestApp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String initialInvestmentInput = collectInput(scanner, "What is the initial investment amount?");
		String interestRateInput = collectInput(scanner, "What is the interest rate?");

		double newBalance = Integer.parseInt(initialInvestmentInput);

		double interestRate = Double.parseDouble(interestRateInput);

		for (int i = 0; i < 6; i++)
		{
			newBalance = calculateAndOutput(newBalance, interestRate, i);
		}
		
		scanner.close();
	}

	private static double calculateAndOutput(double newBalance, double interestRate, int index) {
		for (int i = 0; i < 5; i++) {

			newBalance = newBalance * (interestRate + 1.00);
		}
		System.out.println("After " + ((index*5)+5) + " years, you would have " + Math.round(newBalance));
		return newBalance;
	}

	private static String collectInput(Scanner scanner, String messageToDisplayInConsole) {
		System.out.println(messageToDisplayInConsole);
		String userInput = scanner.nextLine();
		return userInput;
	}

}
