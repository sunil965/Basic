package array;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @author YATRAONLINE\sunil.kumar3
 * <p>
 * Program to insert new element at given position 'K'
 * and given that K<N.
 */
public class InsertAtKth {

    public static void main(String[] args) {

        int[] givenArray = {1, 2, 3, 4, 5};
        int N = 5;
        int J = N + 1;
        int K = 2;       // Position at which new element is to be inserted.
        int data = 7;    // New element.

        System.out.println("Given Array is:");
        IntStream stream = Arrays.stream(givenArray);
        stream.forEach(System.out::print);

        int[] newArray = new int[J];

        while (N >= K) {
            newArray[J - 1] = givenArray[N - 1];
            J -= 1;
            N -= 1;
        }
        newArray[J] = data;
        System.arraycopy(givenArray, 0, newArray, 0, K);
        System.out.println(" ");
        System.out.println("New Array is:");
        IntStream stream2 = Arrays.stream(newArray);
        stream2.forEach(System.out::print);
    }
}
