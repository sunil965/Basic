package ArraysProgram;

public class KadaneAlgo {

	public static void main(String[] args) {
//		int A[] = { 1, 2, 3, -2, 5 };
//		findSubArrayWithMaxSum(A, A.length);
		
		int[] A2 = { -8, -3, -6, -2, -5, -4, 3, 7, -1};
		kadane(A2);
	}

	public static void findSubArrayWithMaxSum(int[] a, int size) {
		int oldMax = a[0],newMax = 0, start, end, temp=0;
		for(int i=0; i<size; i++) {
			newMax = newMax + a[i];
			if(newMax > oldMax) {
				oldMax = newMax;
				start = temp;
				end=i;
				
				if(i==size-1) {
					printArray(a,start, end, newMax);
				}
			}
			if(newMax < 0) {
				newMax = 0;
				temp=i+1;
			}
		}
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
	
	public static int kadane(int[] A)
    {
        int oldMax = A[0], newMax = 0, start =0, end =0, oldIndex=0;
        
        for (int newIndex=0; newIndex< A.length-1; newIndex++)
        {
        	newMax =  newMax + A[newIndex];
        	if (newMax>oldMax) {
        		oldMax = newMax;
        		start=oldIndex;
        		end=newIndex;
			}else {
				newMax =0;
				oldIndex = newIndex+1;
			}
        }
        printArray(A, start, end, newMax);
        
        return oldMax;
    }
 
}
