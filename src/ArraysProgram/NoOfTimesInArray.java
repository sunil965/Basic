package ArraysProgram;

//import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class NoOfTimesInArray {

	public static void main(String[] args) {
		int arr[] = { 7, 1, 8, 8, 9, 1, 1, 4, 2, 2 };
		int n = arr.length;
		occurredOnce(arr, n);
	}

	private static void occurredOnce(int[] arr, int n) {
		/*
		 * Arrays.sort(arr); // 1 1 1 2 2 4 7 8 8 9 for(int i =0; i<n; i++) { int count
		 * = 1; for (int j = i+1; j < arr.length; j++) { if(arr[i]==arr[j]) { count++; }
		 * } if(count>1) { System.out.println(arr[i]+" total times "+count); } }
		 */

		Map<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < arr.length; i++) {
			if (map.containsKey(arr[i])) {
				int count = map.get(arr[i]);
				map.put(arr[i], ++count);
			} else {
				map.put(arr[i], 1);
			}
		}
		
		final Set<Integer> keys = map.keySet();
		
		for(Integer key : keys) {
//			if(map.get(key) > 1) {
				System.out.println(key+" count : "+map.get(key));
//			}
		}

	}

}
