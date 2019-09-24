package ArraysProgram;

import java.util.Arrays;

public class MinimumPlatform {

	public static void main(String[] args) {
		int[] arr = {900, 940, 950, 1100, 1500, 1800};
	    int[] dep = {910, 1200, 1120, 1130, 1900, 2000};
	    int n = arr.length; 
	    System.out.println("Minimum Number of Platforms Required = "+ findPlatform(arr, dep, n));
	}

	private static int findPlatform(int[] arr, int[] dep, int n) {
		int count=0, result=0;
		Arrays.sort(arr);
		Arrays.sort(dep);
		int i=0, j=0;
		while( i<n && j<n) {
			if(arr[i]<dep[j]) {
				count++;
				i++;
				if(count>result)
					result=count;
			}else {
				count--;
				j++;
			}
		}
		return result;
	}

}
