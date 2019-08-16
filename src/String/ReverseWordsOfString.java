package String;
 
public class ReverseWordsOfString { 

	// Method to reverse words of a String 
	static String reverseWords(String str) 
	{ 
		String[] temp = str.split(" "); 
		String result = ""; 
 
		for (int i = 0; i < temp.length; i++) { 
			if (i == temp.length - 1) 
				result = temp[i] + result; 
			else
				result = " " + temp[i] + result; 
		} 
		return result; 
	} 

	// Driver methods to test above method 
	public static void main(String[] args) 
	{ 
		String s1 = "Welcome to geeksforgeeks"; 
		System.out.println(reverseWords(s1)); 

		String s2 = "I love Java Programming"; 
		System.out.println(reverseWords2(s2)); 
	}

	private static String reverseWords2(String str) {
		String[] temp = str.split(" ");
		String result = "";
		for (int i = temp.length - 1; i >= 0; i--) {
			if (i == temp.length - 1)
				result = result + temp[i];
			else
				result = result + " " + temp[i];
		}
		return result;
	} 
} 
