package ArraysProgram;

public class ArrayReverseByGivenNumber {

	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int reverseByNumber = 3;
		System.out.println("Initial Array ");
		printArray(array);
		reverseArrayBy(array, reverseByNumber);
		System.out.println("\nReversed Array ");
		printArray(array);
	}

	private static void reverseArrayBy(int[] array, int reverseByNumber) {
		int length = array.length;
		reverseArray(array, 0, reverseByNumber - 1);
		reverseArray(array, reverseByNumber, length - 1);
		reverseArray(array, 0, length - 1);

	}

	private static void reverseArray(int[] array, int start, int end) {
		if (start > end)
			return;
		int temp;
		temp = array[start];
		array[start] = array[end];
		array[end] = temp;
		reverseArray(array, start + 1, end - 1);
	}

	static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
	}

}
