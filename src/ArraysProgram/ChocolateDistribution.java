package ArraysProgram;

import java.util.Arrays;

public class ChocolateDistribution {

	static void findMinDiff(int[] arr, int n, int m) {
		// if there are no chocolates or number of students is 0
		if (m == 0 || n == 0)
			System.out.println("chocolates or number of students is 0");
		// Number of students cannot be more than number of packets
		if (n < m)
			System.out.println("Number of students cannot be more than number of packets");

		Arrays.sort(arr); //2 4 7 9 12, 23, 25, 28, 30, 30, 40, 41, 42, 44, 50

		// Largest number of chocolates
		int min_diff = Integer.MAX_VALUE;
		int first = 0, last = 0;
		int diff = 0;
		for (int i = 0; i + m - 1 < n; i++) {
			diff = arr[i + m - 1] - arr[i];
			if (diff < min_diff) {
				min_diff = diff;
				first = i;
				last = i + m - 1;
			}
		}
		System.out.println(diff);
		System.out.println("First "+first+", Last "+last);
		System.out.println("Minimum difference is " + (arr[last] - arr[first]));
	}

	public static void main(String[] args) {
		int[] arr = { 12, 4, 7, 9, 2, 23, 25, 41, 30, 40, 28, 42, 30, 44, 50 };

		int m = 7; // Number of students

		int n = arr.length; // No of packets.
		findMinDiff(arr,n,m);
	}
}
