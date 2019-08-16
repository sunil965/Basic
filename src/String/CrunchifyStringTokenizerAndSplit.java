package String;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class CrunchifyStringTokenizerAndSplit {
	 
	public static void main(String[] args) {
		String delims = " ";
		String splitString = "Hi this is \"Sunil Kumar\" please consider" ;
 
		System.out.println("\nSplit Example: \n");
		String[] tokens = splitString.split(delims);
		int tokenCount = tokens.length;
		List<String> list = new ArrayList<String>();
		for (int j = 0; j < tokenCount; j++) {
			StringBuilder sb = new StringBuilder();
			if(tokens[j].charAt(0)=='"') {
				for(int i = j; i<tokenCount; i++) {
					sb.append(tokens[j]).append(" ");
					if(tokens[j].charAt(tokens[j].length()-1)=='"') {
						break;
					}
					j++;
				}
				System.out.println(sb.toString());
				j++;
			}
			System.out.println(tokens[j]);
		}
		
//		System.out.println("\n\nSplit Example: \n");
//		StringBuilder sb = new StringBuilder();
		/*
		 * for(String token: tokens) { System.out.println("Split Output: "+ token); }
		 */
	}
}
