package ArraysProgram;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Vector;

public class BiggestNo_ElementsOf_Array {

	static void printLargest(Vector<String> arr) {

		Collections.sort(arr, new Comparator<String>() {

			@Override
			public int compare(String X, String Y) {

				// first append Y at the end of X
				String XY = X + Y;

				// then append X at the end of Y
				String YX = Y + X;

				return XY.compareTo(YX) > 0 ? -1 : 1;
			}
		});

		Iterator<String> it = arr.iterator();

		while (it.hasNext())
			System.out.print(it.next());

	}

	public static void main(String[] args) {

		Vector<String> arr;
		arr = new Vector<>();

		// output should be 6054854654
		arr.add("54");
		arr.add("566");
		arr.add("566");
		arr.add("60");
		printLargest(arr);
	}
}
