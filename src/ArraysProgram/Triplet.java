package ArraysProgram;

import java.util.Iterator;
import java.util.Scanner;

public class Triplet {

	public static void main(String[] args) {
		System.out.println("Enter the Test Cases : ");
		Scanner sc =  new Scanner(System.in);
		int cases = sc.nextInt();
		for(int test=1; test<=cases; test++) {
			System.out.println("Enter size of array");
			int  size = sc.nextInt();
			int[] array = new int[size];
			System.out.println("Enter array elements : ");
			for(int k=0; k<size; k++) {
				array[k]=sc.nextInt();
			}
//			System.out.println("Enter the sum : ");
//			int sum = sc.nextInt();
//			boolean result = find3Numbers(array, size, sum);
			System.out.println("Total triplets are "+find3Numbers(array, size));
		}
		 
	}
	static int find3Numbers(int A[], int arr_size) 
    { 
        int count = 0; 
  
        // Fix the first element as A[i] 
        for (int i = 0; i < arr_size - 2; i++) { 
  
            // Fix the second element as A[j] 
            for (int j = i + 1; j < arr_size - 1; j++) { 
  
                // Now look for the third number 
                for (int k = j + 1; k < arr_size; k++) { 
//                	if (A[i] + A[j] + A[k] == sum) { 
                    if (A[i] + A[j]  == A[k] || A[i] + A[k]  == A[j] || A[i] == A[j] + A[k]) { 
                        System.out.println("Triplet is " + A[i] + ", " + A[j] + ", " + A[k]); 
//                        return true;
                    	count++;
                    } 
                } 
            } 
        } 
  
        // If we reach here, then no triplet was found 
        return count; 
    } 

}
