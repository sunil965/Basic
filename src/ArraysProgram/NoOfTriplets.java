package ArraysProgram;

//Java program to find three numbers 
//such that sum of two makes the 
//third element in array 

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class NoOfTriplets {

    static void countTriplet(int[] arr, int n) {
        // sort the array
        Arrays.sort(arr);
        int found = 0;
        // for every element in arr check if a pair exist(in array) whose sum is equal to arr element
        for (int i = n - 1; i >= 0; i--) {
            int j = 0;
            int k = i - 1;
            while (j < k) {
                if (arr[i] == arr[j] + arr[k]) {
                    System.out.println("Numbers are " + arr[i] + " " + arr[j] + " " + arr[k]);
                    found++;
                    break;
                } else if (arr[i] > arr[j] + arr[k])
                    j += 1;
                else
                    k -= 1;
            }
        }

        if (found == 0)
            System.out.println("No such triplet exists");
        else {
            System.out.printf("Total No Of Triplets are :- %d", found);
        }
    }

    private static void viaHasMap(int[] arr, int n, int sum) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            int currentSum = sum - arr[i];

            for (int j = i + 1; j < n; j++) {
                if (set.contains(currentSum - arr[j])) {
                    System.out.println("Triplet is " + arr[i] + ", " + arr[j] + ", " + (currentSum - arr[j]));
                } else
                    set.add(arr[j]);

            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 12, 1, 7, 10, 50, 19, 21, 2};
        int n = arr.length;
        countTriplet(arr, n);

        viaHasMap(arr, n, 0);
    }
}