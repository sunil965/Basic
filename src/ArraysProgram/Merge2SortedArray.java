package ArraysProgram;

public class Merge2SortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ar1 = {1, 5, 9, 10, 15, 20};
		int[] ar2 = {2, 3, 8, 13};
		int[] ar3 = new int[ar1.length + ar2.length];
		mergeArray(ar1,ar2,ar3);
	}

	private static void mergeArray(int[] ar1, int[] ar2, int[] ar3) {
		int s1=ar1.length;
		int s2=ar2.length, i=0, j=0, k=0;
		while (i<s1 && j<s2) {
			if(ar1[i]<ar2[j]) {
				ar3[k]=ar1[i];
				i++; k++;
			}
			else {
				ar3[k]=ar2[j];
				j++; k++;
			}
		}
		while (i<s1) {
			ar3[k]=ar1[i];
			i++; k++;
		}
		while (j<s2) {
			ar3[k]=ar2[j];
			j++; k++;
		}
		
		System.out.println("ar3 :");
		for (int l : ar3) {
			System.out.print(l+" ");
		}
	}

}
