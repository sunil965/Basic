package ArraysProgram;

public class SingleInSortedArray {

	public static void search(int[] arr, int startIndex, int endIndex) {
		if (startIndex > endIndex)
			return;
		if (startIndex == endIndex) {
			System.out.println("The single element is " + arr[startIndex]);
			return;
		}
		int mid = (startIndex + endIndex) / 2;
		// If mid is even
		if (mid % 2 == 0) {
			if (arr[mid] == arr[mid + 1])
				search(arr, mid + 2, endIndex);
			else
				search(arr, startIndex, mid);
		}
		// If mid is odd
		else if (mid % 2 == 1) {
			if (arr[mid] == arr[mid - 1])
				search(arr, mid + 1, endIndex);
			else
				search(arr, startIndex, mid - 1);
		}
	}

	public static void main(String[] args) {
		int[] arr = { 1, 1, 2, 2, 4, 4, 5, 5, 6 };
		search(arr, 0, arr.length - 1);
	}

}
