package ArraysProgram;

public class EquilibriumIndex {

	public static void main(String[] args) {
		
		EquilibriumIndex equi = new EquilibriumIndex(); 
        int[] arr = { -7, 1, 5, 2, -4, 3, 0 };
        int arr_size = arr.length; 
        System.out.println("First equilibrium index is " +  
                          equi.equilibrium(arr, arr_size));
	}

	private int equilibrium(int[] arr, int n) {
		int sum=0, left=0;
		for(int i: arr)
			sum +=i;
		for(int i=0; i<n; i++) {
			sum -=arr[i];
			if(left==sum)
				return i;
			left += arr[i];
		}
		return -1;
	}

}
