package test;

//import org.apache.commons.lang.StringUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListAsString {

	public static void main(String[] args) {
		System.out.println("Hello World");
		List<String> intList = new ArrayList();
		intList.add("00001");
		intList.add("00002");
		intList.add("sunil");

		System.out.println("Actual List :" + intList);
//	    System.out.println("Changed List :"+StringUtils.join(intList, ","));// 2nd argument of join() to decide the seperation type.

		/*
		 * StringBuilder sb = new StringBuilder(); for (String string : intList) {
		 * sb.append(0, string); }
		 */

		/*
		 * String s = null; try { System.out.println("Index is " + s.indexOf("a")); }
		 * catch (Exception e) { e.printStackTrace(); }
		 */

		String []  arg1s = {"0", "10", "01", "1" } ;
		Arrays.parallelSort(arg1s);
		System.out.println("Actual arg1s :" + arg1s.toString());
	}

}
