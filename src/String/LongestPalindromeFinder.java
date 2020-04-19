package String;

import static java.lang.System.*;

public class LongestPalindromeFinder {

	public static void main(String[] args) {
		out.println(longestPalindromeString("1234"));
		out.println(longestPalindromeString("12321"));
		out.println(longestPalindromeString("9912321456"));
		out.println(longestPalindromeString("9912333321456"));
		out.println(longestPalindromeString("12145445499"));
		out.println(longestPalindromeString("1223213"));
		out.println(longestPalindromeString("abb"));
	}

	public static String intermediatePalindrome(String s, int left, int right) {
		if (left > right) return null;
		while (left >= 0 && right < s.length()
				&& s.charAt(left) == s.charAt(right)) {
			left--;
			right++;
		}
		return s.substring(left + 1, right);
	}

	// O(n^2)
	public static String longestPalindromeString(String s) {
		if (s == null) return null;
		String longest = s.substring(0, 1);
		for (int i = 0; i < s.length() - 1; i++) {
			//odd cases like 121
			String palindrome = intermediatePalindrome(s, i, i);
			if (null != palindrome && palindrome.length() > longest.length()) {
				longest = palindrome;
			}
			//even cases like 1221
			palindrome = intermediatePalindrome(s, i, i + 1);
			if (null != palindrome && palindrome.length() > longest.length()) {
				longest = palindrome;
			}
		}
		return longest;
	}

}
