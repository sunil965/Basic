package array;

public class Arrays {

	public static void main(String[] args) { 
        int[] arr = new int[2]; 
        arr[0] = 10; 
        arr[1] = 20; 
  
        for (int i = 0; i < arr.length; i++) 
            System.out.println(arr[i]); 
        
        System.out.println("multiDimensional");
        
     // declaring and initializing 2D array 
        int[][] arr2 = { {2,7,9},{3,6,1},{7,4,2} };
  
        // printing 2D array 
        for (int i=0; i< 3 ; i++) 
        { 
            for (int j=0; j < 3 ; j++) 
                System.out.print(arr2[i][j] + " "); 
  
            System.out.println(); 
        } 
    } 

}
