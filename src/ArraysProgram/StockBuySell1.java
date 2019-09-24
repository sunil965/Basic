package ArraysProgram;

public class StockBuySell1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {100, 120, 150, 40, 200, 250, 130};
		int n = arr.length;
		stockFunction(arr, n);
	}

	private static void stockFunction(int[] a, int n) {
		// TODO Auto-generated method stub
		int min = a[0], max = 0;
		int diff = Integer.MIN_VALUE;
		for(int i=1; i<n; i++) {
			if(a[i]-a[i-1]> diff)
				diff = a[i]-a[i-1];
			if(a[i]<a[i-1])
				min=a[i];
			if(a[i]>a[i-1])
				max=a[i];
		}
		System.out.println("Stock should be baught at price "+ min+ " and sold at "+(max));
	}

}
