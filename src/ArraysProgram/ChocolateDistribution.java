package ArraysProgram;

import java.util.Arrays;

public class ChocolateDistribution {

	static int findMinDiff(int[] arr, int n, int m) {
		// if there are no chocolates or number of students is 0
		if (m == 0 || n == 0)
			return 0;
		// Number of students cannot be more than number of packets
		if (n < m)
			return -1;

		// Largest number of chocolates
		int min_diff = Integer.MAX_VALUE;
		int first = 0, last = 0;
		for (int i = 0; i + m - 1 < n; i++) {
			int diff = arr[i + m - 1] - arr[i];
			if (diff < min_diff) {
				min_diff = diff;
				first = i;
				last = i + m - 1;
			}
		}
		System.out.println("Index of First element: "+first+ " and last element: "+last);
		return (arr[last] - arr[first]);
	}

	public static void main(String[] args) {
		int[] chocolatePackages = { 12, 4, 7, 9, 2, 23, 25, 41, 30, 40, 28, 42, 30, 44, 50 };

		int m = 7; // Number of students

		int n = chocolatePackages.length;
		System.out.println("Given  array is " +Arrays.toString(chocolatePackages));
		Arrays.sort(chocolatePackages);
		System.out.println("Sorted array is " +Arrays.toString(chocolatePackages));
		System.out.println("Output: Minimum difference is " + findMinDiff(chocolatePackages, n, m));
	}
}
