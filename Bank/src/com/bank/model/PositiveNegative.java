package com.bank.model;

public class PositiveNegative {
	public static void main(String[] args) {
		int[] numbers = {-5, -3, -1, 0, 1, 3, 5};

		System.out.println("Positive numbers in the array:");
		for (int number : numbers) {
			if (number > 0) {
				System.out.println(number);
			}
		}

		System.out.println("\nNegative numbers in the array:");
		for (int number : numbers) {
			if (number < 0) {
				System.out.println(number);
			}
		}
	}

}
