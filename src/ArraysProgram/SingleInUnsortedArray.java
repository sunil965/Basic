package ArraysProgram;

import java.util.Arrays;

public class SingleInUnsortedArray {
	
	public static void occurredOnce(int[] arr, int n)
	{
	    // Sort the array
	    Arrays.sort(arr);
	 
	    // Check for first element
	    if (arr[0] != arr[1])
	    	System.out.print(arr[0]+" ");
	 
	    // Check for all the elements if it is different
	    // its adjacent elements
	    for (int i = 1; i < n - 1; i++)
	        if (arr[i] != arr[i + 1] && arr[i] != arr[i - 1])
	        	System.out.print(arr[i]+" ");
	 
	    // Check for the last element
	    if (arr[n - 2] != arr[n - 1])
	    	System.out.print(arr[n-1]+" ");
	}
	
	public static void main(String[] args) {
		int[] arr = { 7, 7, 8, 8, 9, 1, 1, 4, 2, 2 };
		int n=arr.length;
		occurredOnce(arr, n);
	}

}
