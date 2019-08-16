package array;

//Java program to rotate a matrix 
//right by k times 

class GFG 
{ 
	// size of matrix 
	static final int M=3; 
	static final int N=3; 
	
	// function to rotate matrix by k times 
	static void rotateMatrix(int matrix[][], int k) 
	{ 
		// temporary array of size M 
		int temp[]=new int[M]; 
		
		// within the size of matrix 
		k = k % M; 
		System.out.println("K is "+k);
		
		for (int i = 0; i < N; i++) 
		{ 
			// copy first M-k elements 
			// to temporary array 
			for (int t = 0; t < M - k; t++) 
			temp[t] = matrix[i][t]; 
		
			// copy the elements from k 
			// to end to starting 
			for (int j = M - k; j < M; j++) 
			matrix[i][j - M + k] = matrix[i][j]; 
		
			// copy elements from 
			// temporary array to end 
			for (int j = k; j < M; j++) 
			matrix[i][j] = temp[j - k]; 
		} 
	} 
	
	// function to display the matrix 
	static void displayMatrix(int matrix[][]) 
	{ 
		for (int i = 0; i < N; i++) 
		{ 
			for (int j = 0; j < M; j++) 
			System.out.print(matrix[i][j] + " "); 
			System.out.println(); 
		} 
	} 
	
	// Driver code 
	public static void main (String[] args) 
	{ 
		int matrix[][] = {{12, 23, 34}, 
						{45, 56, 67}, 
						{78, 89, 91}}; 
	int k = 2; 
	
	displayMatrix(matrix);
	
	// rotate matrix by k 
	rotateMatrix(matrix, k); 
	
	// display rotated matrix 
	System.out.println("\nDisplay After rotation");
	displayMatrix(matrix); 
	} 
} 

//This code is contributed by Anant Agarwal. 
