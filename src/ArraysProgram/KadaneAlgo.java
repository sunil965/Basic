package ArraysProgram;

public class KadaneAlgo {

	public static void main(String[] args) {
		int A[] = { 4,-3,-2,2,3,1,-2,-3,4,2,-6,-3,-1,3,1,2 };
		findSubArrayWithMaxSum(A, A.length);

//		int[] A2 = { 4,-3,-2,2,3,1,-2,-3,4,2,-6,-3,-1,3,1,2};
//		kadane(A2);
	}

	public static void findSubArrayWithMaxSum(int[] a, int size) {
		int oldMax = a[0],newMax = 0, start = 0, end = 0, temp=0;
		for(int i=0; i<size; i++) {
			newMax = newMax + a[i];
			if(newMax > oldMax) {
				oldMax = newMax;
			}
			if(newMax < 0) {
				newMax = 0;
			}
		}
//		printArray(a,start, end, newMax);
		System.out.println("Max sum : "+newMax);
	}

	private static void printArray(int[] a, int start, int end, int newMax) {
		for (int i=start; i<=end; i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println("Start Index is : "+start+" , End Index is : "+end+" and Max Sum: "+newMax);

	}

	/* Method 2: If all elements are negative.*/

	// Function to find contiguous sub-array with the largest sum in given set of integers
      
    /*public static int kadane1(int[] A)
    {
        int max = Arrays.stream(A).max().getAsInt();
 
        if (max < 0) {
            return max;
        }
        int maxSoFar = 0;  int maxEndingHere = 0;
 
        for (int i: A)
        {
            maxEndingHere = maxEndingHere + i;
 
            maxEndingHere = Integer.max(maxEndingHere, 0);
 
            maxSoFar = Integer.max(maxSoFar, maxEndingHere);
        }
 
        return maxSoFar;
    }
 
    public static void main(String[] args)
    {
        int[] A = { -8, -3, -6, -2, -5, -4 };
 
        System.out.println("The sum of contiguous sub-array with the " + "largest sum is " +    kadane1(A));
    }*/
	
	
  /*
   * int oldMax = 0, newMax = 0;
    for (int i: A)
    {
        // current element to maximum sum ending at previous index i-1)
    	newMax = Integer.max(i, newMax+i);
    	if (newMax>oldMax) {
    		oldMax = newMax;
		}
    }
   */

	// Method to find sum only.

	public static int kadane(int[] A) {
		int preMax = A[0], sum = 0, startIndex = 0, endIndex = 0, oldIndex = 0;

		for (int i = 0; i < A.length - 1; i++) {
			sum = sum + A[i];
			if (sum > preMax) {
				preMax = sum;
				startIndex = oldIndex;
				endIndex = i;
			}
			if (sum < 0) {
				sum = 0;
				oldIndex = i + 1;
			}
		}
		printArray(A, startIndex, endIndex, preMax);

		return preMax;
	}

}
