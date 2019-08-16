package ArraysProgram;

public class WaterTapping {

static int arr[] = new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1}; 
	
	/*
	 * static int findWater(int n) { int left[] = new int[n];
	 * 
	 * int right[] = new int[n];
	 * 
	 * int water = 0;
	 * 
	 * left[0] = arr[0]; for (int i = 1; i < n; i++) left[i] = Math.max(left[i-1],
	 * arr[i]);
	 * 
	 * right[n-1] = arr[n-1]; for (int i = n-2; i >= 0; i--) right[i] =
	 * Math.max(right[i+1], arr[i]);
	 * 
	 * for (int i = 0; i < n; i++) water += Math.min(left[i],right[i]) - arr[i];
	 * 
	 * return water; }
	 * 
	 */
	
	
	// Approach 2 - O(n)- Time Complexity, O(n) Space Complexity.
	
	  static int findWater(int arr[], int n) 
	{
		int result = 0;
		int leftMax = 0, rightMax = 0;
		int start = 0, end = n - 1;

		while (start <= end) {
			if (arr[start] < arr[end]) {
				if (arr[start] > leftMax)
					leftMax = arr[start];
				else
					result += leftMax - arr[start];
				start++;
			} else {
				if (arr[end] > rightMax)
					rightMax = arr[end];
				else
					result += rightMax - arr[end];
				end--;
			}
		}
		return result;
	} 
	
	public static void main(String[] args) 
	{ 
		int n = arr.length; 
		System.out.println("Maximum water that "
					+ "can be accumulated is "
					+ findWater(arr, n)); 
		
	}  
	  
	 
}
