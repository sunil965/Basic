package ArraysProgram;

import java.util.Arrays;

public class RearrangeMinMaxPattern {

	public static void main(String[] args) {
		int[] arr = {7,1,2,6,4,5};
		System.out.println("Given Array");
		printArray(arr);
		reArrangeMethod1(arr);
		reArrangeMethod2(arr);
	}

	private static void reArrangeMethod2(int[] arr) {
		//	Time Complexity: O(n)
		//	Auxiliary Space: O(n)
		int n=arr.length;
		int[] temp = new int[n];
		int first = 0, last = n-1;
		boolean flag = true; 
		for (int i = 0; i < n; i++) {
			if (flag)
				temp[i]=arr[first++];
			else
				temp[i]=arr[last--];
			flag = !flag;
		}
		arr = temp.clone();
		System.out.println("\nAfter Rearranging Method-2");
		printArray(arr);
	}

	private static void reArrangeMethod1(int[] arr) {
		//  Time Complexity: O(n Log n) 
		//  Auxiliary Space : O(1)
		Arrays.sort(arr);
		int first=0, last = arr.length-1;
		System.out.println("\nAfter Rearranging Method-1");
		while (first<last) {
			System.out.print(arr[first++] +" ");
			System.out.print(arr[last--] +" ");
		}
		if(arr.length % 2 != 0) {
			System.out.println(arr[first]);
		}
	}

	private static void printArray(int[] arr) {
		for(int i : arr)
			System.out.print(i+" ");
	}
	
	

}
