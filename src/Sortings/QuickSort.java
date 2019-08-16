package Sortings;

public class QuickSort {

	public static void main(String[] args) {
		int arr[] = { 8, 7, 2, 4, 1, 5, 3, 6 };
		int n = arr.length;
		System.out.println("Before Sort ");
		print(arr);
		quickSort(0, n - 1, arr);
		System.out.println("\nAfter Sort ");
		print(arr);
	}

	private static void quickSort(int start, int end, int[] arr) {
		if (start < end) {
			int pIndex = partition(arr, start, end );
			quickSort(start, pIndex - 1, arr);
			quickSort(pIndex + 1, end, arr);
		}
	}

	
	private static int partition(int[] arr, int start, int end) {
		int pivot = arr[end];
		int i = start;
		for (int j = start; j < end; j++) {
			if (arr[j] <= pivot) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j]=temp;
				i++;
			}
		}
		int temp = arr[i];
		arr[i] = arr[end];
		arr[end] = temp;
		return i;
	}
	 
	
	/* static int partition(int arr[], int low, int high) 
	{ 
		int pivot = arr[high]; 
		int i = (low-1); // index of smaller element 
		for (int j=low; j<high; j++) 
		{ 
			if (arr[j] <= pivot) 
			{ 
				i++; 
				// swap arr[i] and arr[j] 
				int temp = arr[i]; 
				arr[i] = arr[j]; 
				arr[j] = temp; 
			} 
		} 

		// swap arr[i+1] and arr[high] (or pivot) 
		int temp = arr[i+1]; 
		arr[i+1] = arr[high]; 
		arr[high] = temp; 

		return i+1; 
	} 
*/

	public static void print(int[] arr) {
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
	}

}

