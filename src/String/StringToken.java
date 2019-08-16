package String;

import java.util.Arrays;

public class StringToken {

	public static void main(String[] args) {

		String s = "Miral \"paresh kumar Modi\" \"uiias jcgaus asf\"";
		char[] charsetArray = s.toCharArray();
		int k = 0;
		String[] result = s.split(" ");

		StringBuilder builder = new StringBuilder();
		for (int i = 0; i < result.length; i++) {

			/*
			 * if (result[i].charAt(0) == '"') builder.append(result[i]); else if
			 * (result[i].charAt(result[i].length() - 1) == '"') {
			 * builder.append(result[i]).append(", "); } else
			 */ if (result[i].charAt(0) != '"' || result[i].charAt(result[i].length() - 1) != '"')
				builder.append(result[i]).append(" ");
		}

		/*
		 * for (int i = 0; i < charsetArray.length; i++) { if (charsetArray[i] == ' ' &&
		 * !builder.toString().isEmpty()) { result[k] = new String(); result[k++] =
		 * builder.toString(); builder.delete(0, builder.length()); } else if
		 * (charsetArray[i] == '"') { builder.append(charsetArray[i]); for (int j = i +
		 * 1; j < charsetArray.length; j++) { if (charsetArray[j] == '"') {
		 * builder.append('"'); result[k] = new String(); result[k++] =
		 * builder.toString(); builder.delete(0, builder.length()); i = j; break; } else
		 * { builder.append(charsetArray[j]); } } } else {
		 * builder.append(charsetArray[i]); } }
		 */

		System.out.println(builder.toString());

	}
}
