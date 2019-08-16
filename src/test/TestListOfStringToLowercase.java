package test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestListOfStringToLowercase {

	public static void main(String[] args) {
		String[] arr = {"ONE","TWO","THREE"};
		List<String> list = Arrays.asList(arr);
		System.out.println(" Before Change: ");
		printList(list);
		System.out.println("\n After Change: ");
//		List<String>list2=list.stream().map(String::toLowerCase).collect(Collectors.toList());
		printList(list.stream().map(String::toLowerCase).collect(Collectors.toList()));
	}

	private static void printList(List<String> list) {
		for (String string : list) {
			System.out.print(string+" ");
		}
		
	}

}
