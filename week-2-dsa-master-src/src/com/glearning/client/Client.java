package com.glearning.client;

import java.util.Scanner;

import com.glearning.service.TransactionService;

public class Client {

	public static void main(String[] args) {
		TransactionService transactionService = new TransactionService();
		// ask for the number of transactions using system.in
		// create an array of length
		// populate the array with the values using scanner class

		Scanner s = new Scanner(System.in);
		System.out.println("enter the size of transaction array");
		int size = s.nextInt();

		int arr[] = new int[size];
		System.out.println("enter the values of array");

		for (int i = 0; i < size; i++) {
			arr[i] = s.nextInt();
		}

		System.out.println("enter the total no of targets that needs to be achieved");
		long NumOfTargets = s.nextInt();
		if (NumOfTargets > size) {
			System.out.println("Number of targets cannot be more than the input size");

			System.out.println(" ");
			System.out.println("reenter the total no of targets that needs to be achieved");
			int NumOfTargets1 = s.nextInt();
			NumOfTargets = NumOfTargets1;
		}
		System.out.println("enter the value of target");
		int target = s.nextInt();
		transactionService.checkTrans(arr, target, NumOfTargets);

		System.out.println(" ");
		System.out.println("enter the value of target");
		long target2 = s.nextInt();
		transactionService.checkTransTgt2(arr, target, NumOfTargets, target2);

	}
}
