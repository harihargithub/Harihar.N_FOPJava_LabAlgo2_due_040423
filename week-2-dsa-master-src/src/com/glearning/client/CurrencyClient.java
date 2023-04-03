package com.glearning.client;

import java.util.Scanner;

import com.glearning.service.CurrencyService;

public class CurrencyClient {

	public static void main(String[] args) {
		CurrencyService service = new CurrencyService();
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the size of currency denominations: ");
		int n = scanner.nextInt();

		int[] denominations = new int[n];
		System.out.println("Enter the currency denominations value:");
		for (int i = 0; i < n; i++) {
			denominations[i] = scanner.nextInt();
		}

		System.out.print("Enter the amount you want to pay: ");
		int amount = scanner.nextInt();

		CurrencyService.denomSvc(denominations, amount);
	}

}
