package list;

public class CharTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String mealId = "?W8  ";

		System.out.println("New Id is : " + getNextMealId(mealId));
	}

	private static String getNextMealId(String mealID) {

		String lastChar = mealID.substring(2, 3);	// String of 2nd char in given string(e.g: 8).
		String temp1 = mealID.substring(1, 3);	// String of 1st & 2nd char in given string(e.g: W8).

		String firstLetter, secondLetter, thirdLetter= null;

		int charValue1 = mealID.charAt(1);
		int charValue2 = mealID.charAt(0);
		
		if (Integer.parseInt(lastChar) == 9) {
			thirdLetter = "0";
			if (temp1.equalsIgnoreCase("Z9")) {
				secondLetter = "A";
				firstLetter = String.valueOf((char) (charValue2 + 1));
			} else {
				secondLetter = String.valueOf((char) (charValue1 + 1));
				firstLetter = String.valueOf(mealID.charAt(0));
			}

		} else {
			firstLetter = String.valueOf(mealID.charAt(0));
			secondLetter = String.valueOf(mealID.charAt(1));
			thirdLetter = String.valueOf(Integer.parseInt(lastChar) + 1);
		}

		return firstLetter + secondLetter + thirdLetter;
	}

}
