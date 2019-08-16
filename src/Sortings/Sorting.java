package Sortings;

public class Sorting {

	public static void main(String[] args) {
		int arr[] = { 8, 7, 2, 4, 1, 5, 3, 6 };
		int n = arr.length;
		System.out.println("----------Selection Sort------");
		selectionSort(arr, n);
		System.out.println("----------Bubble Sort------");
		bubbleSort(arr, n);
		System.out.println("----------Insertion Sort------");
		insertionSort(arr, n);
		System.out.println("----------Merge Sort------");
		mergeSort(arr, n);
	}

	static void mergeSort(int arr[], int n) {
		sort(arr, 0, n - 1);
		print(arr);
	}

	private static void sort(int[] arr, int l, int r) {
		if (l < r) {
			int m = (l + r) / 2;
			sort(arr, l, m);
			sort(arr, m + 1, r);
			merge(arr, l, m, r);
		}

	}

	private static void merge(int[] arr, int l, int m, int r) {
		int n1 = m - l + 1;
		int n2 = r - m;

		/* Create temp arrays */
		int L[] = new int[n1];
		int R[] = new int[n2];

		/* Copy data to temp arrays */
		for (int i = 0; i < n1; ++i)
			L[i] = arr[l + i];
		for (int j = 0; j < n2; ++j)
			R[j] = arr[m + 1 + j];


		int i = 0, j = 0;

		int k = l;
		while (i < n1 && j < n2) {
			if (L[i] <= R[j]) {
				arr[k] = L[i];
				i++;
			} else {
				arr[k] = R[j];
				j++;
			}
			k++;
		}

		while (i < n1) {
			arr[k] = L[i];
			i++;
			k++;
		}

		while (j < n2) {
			arr[k] = R[j];
			j++;
			k++;
		}
	}

	private static void insertionSort(int[] arr, int n) {
		for (int i = 1; i < n; ++i) {
			int key = arr[i];
			int j = i;
			while (j > 0 && arr[j - 1] > key) {
				arr[j] = arr[j - 1];
				j = j - 1;
			}
			arr[j] = key;
		}
		print(arr);
	}

	private static void bubbleSort(int[] arr, int n) {
		for (int i = 0; i < n - 1; i++) {
			boolean swapped = false;
			for (int j = 0; j < n - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					swapped = true;
				}
			}
			if (swapped == false)
				break;
		}
		print(arr);
	}

	private static void selectionSort(int[] arr, int n) {

		for (int i = 0; i < n; i++) {
			int min = i;
			for (int j = i + 1; j < n; j++) {
				if (arr[min] > arr[j]) {
					min = j;
				}
			}
			int temp = arr[min];
			arr[min] = arr[i];
			arr[i] = temp;
		}
		print(arr);
	}

	/**
	 * @param arr
	 */
	public static void print(int[] arr) {
		for (int i = 0; i < arr.length; i++)
			System.out.println(arr[i] + " ");
	}
}
