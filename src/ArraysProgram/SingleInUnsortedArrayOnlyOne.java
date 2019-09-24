package ArraysProgram;

public class SingleInUnsortedArrayOnlyOne {

	static int findSingle(int[] ar, int size)
    { 
        // Do XOR of all elements and return 
        int res = ar[0]; 
        for (int i = 1; i < size; i++) 
            res = res ^ ar[i]; 
      
        return res; 
    } 
  
    // Driver code 
    public static void main (String[] args) 
    { 
        int[] ar = {2, 3, 5, 4, 5, 3, 4};
        int n = ar.length; 
        System.out.println("Element occurring once is " + 
                            findSingle(ar, n) + " "); 
    }
}
