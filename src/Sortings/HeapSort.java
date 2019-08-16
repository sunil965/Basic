package Sortings;

public class HeapSort {

	public static void main(String[] args) {

		int arr[] = { 8, 7, 2, 4, 1, 5, 3, 6 };
		System.out.println("Before Sort ");
		print(arr);
		sort(arr);
		System.out.println("\nAfter Sort ");
		print(arr);
	}
	
	private static void sort(int[] arr) {
		int n = arr.length;
		
		// Build heap (rearrange array)
		for (int i = n/2-1; i >= 0; i--) {
			heapify(arr, n, i);
		}
		// One by one extract an element from heap 
        for (int i=n-1; i>=0; i--) 
        { 
            // Move current root to end 
        	int temp = arr[0];
			arr[0] = arr[i];
			arr[i] = temp;

			heapify(arr, i, 0);
		}
	}

	private static void heapify(int[] arr, int n, int i) {
		int largest = i; // Initialize largest as root 
        int l = 2*i + 1; // left = 2*i + 1 
        int r = 2*i + 2; // right = 2*i + 2 
  
        // If left child is larger than root 
        if (l < n && arr[l] > arr[largest]) 
            largest = l; 
  
        // If right child is larger than largest so far 
        if (r < n && arr[r] > arr[largest]) 
            largest = r; 
  
        // If largest is not root 
        if (largest != i) 
        { 
            int swap = arr[i]; 
            arr[i] = arr[largest]; 
            arr[largest] = swap; 
            heapify(arr, n, largest); 
        } 
	}

	public static void print(int[] arr) {
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
	}


}
