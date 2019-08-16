package ArraysProgram;

import java.util.Scanner;

/**
 * 
 * PROBLEM:Given an unsorted array A of size N of non-negative integers,
 * find a continuous sub-array which adds to a given number S.
 *
 * Input:The first line of input contains an integer T denoting the number of test cases. Then T test cases follow. Each test case consists of two
 * lines. The first line of each test case is N and S, where N is the size of array and S is the sum. The second line of each test case contains N 
 * space separated integers denoting the array elements.

 * Output:For each testcase, in a new line, print the starting and ending positions(1 indexing) of first such occuring subarray from the left if 
 * sum equals to subarray, else print -1.

	Constraints:
	1 <= T <= 100
	1 <= N <= 107
	1 <= Ai <= 1010
	
	Example:
	Input:
	2
	5 12
	1 2 3 7 5
	10 15
	1 2 3 4 5 6 7 8 9 10
	Output:
	2 4
	1 5
 */

public class SubArrayForAGivenSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the No. Of test cases:");	  int T = sc.nextInt();
		for(int t=0; t<T;t++) {
			System.out.println("Enter the No. Of elements:"); int N = sc.nextInt();
			System.out.println("Enter the target sum:");      int S = sc.nextInt(); 
    	    boolean fail = true;
    	    
	    	System.out.println("Enter "+N+" elements of array"); int [] a = new int[N];
    	    for (int i = 0; i < N; i++) {
    	        a[i] = sc.nextInt();
    	    }
    	    
    	    int first = 0;
    	    int last = 0;
    	    int sum = a[0];
    	    while (last < N) {
    	        if (sum > S) {
    	            sum -= a[first];
    	            first ++;
    	        } else if (sum < S) {
    	            last ++;
    	            if (last < N) {
    	              sum += a[last];
    	            }
    	        }
    	        
    	        if (sum == S) {
    	            first++;
    	            last++;
    	            System.out.println(first + " " + last);
    	            fail = false;
    	            break;
    	        }
    	    }
    	    
        	// Persribed failure output
        	if (fail) {
        	    System.out.println("-1");
        	}
		}
	}

}
