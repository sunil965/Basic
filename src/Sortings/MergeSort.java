package Sortings;

public class MergeSort {

	public static void main(String[] args) {
		int arr[] = { 8, 7, 2, 4, 1, 5, 3, 6 };
		sort(arr);
		print(arr);
	}

	public static void print(int[] arr) {
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
	}

	private static void sort(int[] arr) {
		int n = arr.length;
		if (n < 2)
			return;
		int mid = n / 2;
		int[] left = new int[mid];
		int[] right = new int[n - mid];

		int i = 0;
		while (i < mid) {
			left[i] = arr[i];
			i++;
		}
		while (i < n) {
			right[i-mid] = arr[i];
			i++;
		}
		sort(left);
		sort(right);
		merge(left, right, arr);
	}

	private static void merge(int[] left, int[] right, int[] arr) {
		int i = 0, j = 0, k = 0;
		while (i < left.length && j < right.length) {
			if (left[i] < right[j]) {
				arr[k] = left[i];
				i++;
				k++;
			} else {
				arr[k] = right[j];
				j++;
				k++;
			}
		}
		while (i < left.length) {
			arr[k] = left[i];
			i++;
			k++;
		}
		while (i < right.length) {
			arr[k] = right[i];
			j++;
			k++;
		}

	}

}
