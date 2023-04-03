package com.glearning.service;

public class TransactionService {

	public void checkTrans(int[] arr, int target, long NumOfTargets) {

		int i;
		long sum = 0;
		for (i = 0; i < arr.length; i++) {
			sum += arr[i];

			if (sum >= target) {
				System.out.println("Target achieved after " + (i + 1) + " transactions");
				break;
			}
		}

		if (i == arr.length) {
			System.out.println("Given target is not achieved");
			System.exit(0);
		}
	}

	public void checkTransTgt2(int[] arr, int target, long NumOfTargets, long target2) {

		int j;
		long sum2 = 0;
		for (j = 0; j < arr.length; j++) {
			sum2 += arr[j];

			if (sum2 >= target2) {
				System.out.println("Target achieved after " + (j + 1) + " transactions");
				break;
			}
		}

		if (j == arr.length) {
			System.out.println("Given target is not achieved");
		}

	}
}
