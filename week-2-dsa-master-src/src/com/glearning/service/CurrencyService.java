package com.glearning.service;

// import java.util.ArrayList;
import java.util.Arrays;
// import java.util.List;

public class CurrencyService {

	// if the denominators array is not in descending order, then sort the elements
	// in the descending order
	// use bubblesort/mergesort for sorting the elements.
	// Lets assume that the elements in the array is in descending sorted order
	public static void denomSvc(int[] denominations, int amount) {

		Arrays.sort(denominations);
		int n = denominations.length;
		for (int i = 0; i < n / 2; i++) {
			int temp = denominations[i];
			denominations[i] = denominations[n - i - 1];
			denominations[n - i - 1] = temp;

		}

		// Compute the payment approach using the highest denominations first

		System.out.println("Your payment approach in order to give min no of notes will be");
		int[] counts = new int[n];
		for (int i = 0; i < n; i++) {
			counts[i] = amount / denominations[i];
			amount %= denominations[i];
			if (counts[i] > 0) {
				System.out.println(denominations[i] + ":" + counts[i]);
			}
		}

	}

}
