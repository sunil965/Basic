package ArraysProgram;

public class MissingNumber {

	public static void main(String[] args) {
		
		int arr[] = { 1, 2, 4, 5 };
		int n = arr.length;
		findMissingNo(arr, n);
		getMissingNo(arr, n);
		xOrMethod(arr, n);
		
		int diff = (arr[n - 1] - arr[0]) / n; 
//		System.out.println("Airthmetic progression series missing No "+airthMatickSeries(arr, 0, n-1, diff));
	}

	private static void findMissingNo(int[] arr, int n) {
		int temp = (arr[n - 1] - arr[0]) / n; 
			for (int i = 0; i < n-1; i++) {
				if (temp != arr[i+1]-arr[i]) {
					System.out.println("Missing No of findMissingNo is : "+(arr[i]+temp));
				}
			}
	}
	
	static void getMissingNo(int a[], int n) 
    { 
		int last=a.length+1;
        int i, total; 
        total = last * (last + 1) / 2; 
        System.out.println("total sum is :"+total);
        for (i = 0; i < n; i++) 
            total -= a[i]; 
        System.out.println("Missing No from getMissingNo is : "+ total); 
    }
	
	/* static void getMissingNo(int arr[], int n) {
		int sum = 0;
		int idx = -1;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				idx = i;
			} else {
				sum += arr[i];
			}
		}

//		int total = n* (n + 1) / 2;
		int total = (n + 1) * (n + 2) / 2; 
		System.out.println("total sum number is: " + total);

		System.out.println("missing number is: " + (total - sum) + " at index " + idx);
	}*/
	
	/*static int airthMatickSeries(int arr[], int low, int high, int diff) {
		
		if (high <= low)
			return Integer.MAX_VALUE;

		
		int mid = low + (high - low) / 2;

		
		if (arr[mid + 1] - arr[mid] != diff)
			return (arr[mid] + diff);

		
		if (mid > 0 && arr[mid] - arr[mid - 1] != diff)
			return (arr[mid - 1] + diff);

		
		if (arr[mid] == arr[0] + mid * diff)
			return airthMatickSeries(arr, mid + 1, high, diff);

		return airthMatickSeries(arr, low, mid - 1, diff);
	}*/
	
	static void xOrMethod(int[] a, int size) {
		int x1 = a[0];
		int x2 = 1;
		
		for (int i=1; i<size; i++) {
			x1 ^= a[i];
		}
		for(int i=2; i<=size+1; i++) {
			x2 = x2 ^ i;
		}
		System.out.println("Missing number from XOR :"+(x1 ^ x2));
	}

}
