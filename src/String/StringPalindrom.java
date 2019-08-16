package String;

public class StringPalindrom {

	public static void main(String[] args) {
		
		String s = "ABCDCBA";
		boolean b = isPalindromeString(s);
		System.out.println("Is Palindrome "+b);
		System.out.println("isPalindrome returns "+isPalindrome(s));
		
	}


    private static boolean isPalindromeString(String str) {
        if (str == null)
            return false;
        int length = str.length();
        for (int i = 0; i < length / 2; i++) {

            if (str.charAt(i) != str.charAt(length - i - 1))
                return false;
        }
        return true;
    }
    

    private static boolean isPalindrome(String str) {
        if (str == null)
            return false;
        StringBuilder strBuilder = new StringBuilder(str);
        strBuilder.reverse();
        return strBuilder.toString().equals(str);
    }


}
