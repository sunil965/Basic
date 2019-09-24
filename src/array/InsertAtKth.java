package array;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @author YATRAONLINE\sunil.kumar3
 * 
 * Program to insert new element at given position 'K'
 * and given that K<N.
 *
 */
public class InsertAtKth {

	public static void main(String[] args) {
		
		int[] givenArray = {1,2,3,4,5};
		int N = 5;
		int J = N;
		int K = 2;		// Position at which new element is to be inserted.
		int data = 10;	// New element.
		
		System.out.println("Given Array is:");
		IntStream stream = Arrays.stream(givenArray);
		stream.forEach(x-> System.out.println(x));
		
		N = N+1;
		
		while(J<=K) {
			givenArray[J+1] = givenArray[J];
			J = J-1;
		}
		givenArray[K] = data;  
		
		System.out.println("New Array is:");
		IntStream stream2 = Arrays.stream(givenArray);
		stream2.forEach(x-> System.out.println(x));
	}

}
