package ArraysProgram;

import java.util.HashMap;
import java.util.Scanner;

public class SubArrayGivenSumHashMap {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = {10, 2, -2, -20, 10}; 
        int n = arr.length; 
        System.out.println("Enter the Sum");
        int sum = sc.nextInt(); 
        subArraySum(arr, n, sum);
        sc.close();
	}

	private static void subArraySum(int[] arr, int n, int sum) {
		int cSum=0;
		int start = 0; 
        int end = -1;
        HashMap<Integer, Integer> map = new HashMap<>();
		for(int i=0; i<=n-1;i++) {
			cSum += arr[i];
			if(cSum==sum) {
				start=0;
				end=i;
				if (end == -1) { 
		            System.out.println("No subarray with given sum exists"); 
		        } else { 
		            System.out.println("Sum found between indexes " + start + " to " + end); 
		        }
//				break;
			}
			if(map.containsKey(cSum-sum)) {
				start=map.get(cSum-sum)+1;
				end=i;
				if (end == -1) { 
		            System.out.println("No subarray with given sum exists"); 
		        } else { 
		            System.out.println("Sum found between indexes " + start + " to " + end); 
		        }
//				break;
			}
			map.put(cSum, i);
		}
		
	}

}
