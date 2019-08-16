package ArraysProgram;

public class SubArray_Sum_Given {

	public static void main(String[] args) {
		int[] arr = { 3, 4, -7, 1, 3, 3, 1, -4 };
		int sum = 7;
		findSubArrays(arr, sum);
	}

	private static void findSubArrays(int[] arr, int sum) {
		for (int i = 0; i < arr.length; i++) {
			int total = 0;
			for (int j = i; j < arr.length; j++) {
				total += arr[j];
				if (total == sum) {
					printArray(arr, i, j);
					break;
				}
			}

		}

	}

	private static void printArray(int[] arr, int i, int j) {
		System.out.print("[" + i + ".." + j + "] -- {");
		for (int k = i; k <= j; k++) {
			System.out.printf("%d ", arr[k]);
		}
		System.out.println("}");
	}

}
