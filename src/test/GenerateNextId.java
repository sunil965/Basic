package test;

public class GenerateNextId {

    public static void main(String[] args) {

		String mealId = "?W8  ";

        System.out.println("New Id is : " + getNextMealId(mealId));
    }

    private static String getNextMealId(String mealID) {

        String lastChar = mealID.substring(2, 3);    // String of 2nd char in given string(e.g: 8).
        String secondLastChar = mealID.substring(1, 3);    // String of 1st & 2nd char in given string(e.g: W8).

        String firstLetter, secondLetter, thirdLetter;

        if (Integer.parseInt(lastChar) == 9) {
            thirdLetter = "0";
            if (secondLastChar.equalsIgnoreCase("Z9")) {
                secondLetter = "A";
                firstLetter = String.valueOf((char) (mealID.charAt(0) + 1));
            } else {
                secondLetter = String.valueOf((char) (mealID.charAt(1) + 1));
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
