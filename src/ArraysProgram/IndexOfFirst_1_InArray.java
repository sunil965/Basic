package ArraysProgram;

public class IndexOfFirst_1_InArray {

	public static int indexOfFirstOne(int arr[], int low, int high) {
		while (low <= high) {
			int mid = (low + high) / 2;

			if (arr[mid] == 1 && (mid == 0 || arr[mid - 1] == 0))
				return mid;
			else if (arr[mid] == 1)
				high = mid - 1;
			else
				low = mid + 1;
		}
		return -1;
	}

	public static void main(String[] args) {
		int arr[] = { 0, 0, 0, 0, 0, 0, 1, 1, 1, 1 };
		int n = arr.length;
		System.out.println("Index id "+indexOfFirstOne(arr, 0, n - 1));

	}

}
