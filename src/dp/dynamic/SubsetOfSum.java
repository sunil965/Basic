package dp.dynamic;

public class SubsetOfSum {

    public static void main(String... arg) {
        int sum = 5;
        int[] weight = {1, 4};
        System.out.println("Subset present in array whose sum equivalent to a given number : " + dynamicMethod(weight, weight.length, sum));
        System.out.println("Total count of subsets in array whose sum equivalent to a given number : " + countSubsetOfSum(weight, weight.length, sum));
    }

    private static boolean dynamicMethod(int[] wts, int n, int sum) {
        boolean[][] table = new boolean[n + 1][sum + 1];
/*
        // To Fill 1st row(initialization)
        for (int j = 0; j < sum + 1; j++)
            table[0][j] = Boolean.FALSE;
*/

        // To Fill 1st column(initialization)
        for (int i = 0; i < n + 1; i++)
            table[i][0] = Boolean.TRUE;

        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < sum + 1; j++) {
                if (wts[i - 1] > j) {
                    table[i][j] = table[i - 1][j];
                } else {
                    table[i][j] = table[i-1][j - wts[i - 1]] || table[i - 1][j];
                }
            }
        }
        print(table);

        return table[n][sum];
    }

    private static int countSubsetOfSum(int[] wts, int n, int sum) {
        int[][] table = new int[n + 1][sum + 1];
/*
        // To Fill 1st row(initialization)
        for (int j = 0; j < sum + 1; j++)
            table[0][j] = Boolean.FALSE;
*/

        // To Fill 1st column(initialization)
        for (int i = 0; i < n + 1; i++)
            table[i][0] = 1;

        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < sum + 1; j++) {
                if (wts[i - 1] > j) {
                    table[i][j] = table[i - 1][j];
                } else {
                    table[i][j] = table[i-1][j - wts[i - 1]] + table[i - 1][j];
                }
            }
        }
//        print(table);

        return table[n][sum];
    }

    private static void print(boolean[][] table) {
        // Print solved matrix with values.
        for (boolean[] booleans : table) {
            for (int column = 0; column < table[0].length; column++) {
                System.out.print(booleans[column]);
                if (booleans[column])
                    System.out.print("  ");
                else
                    System.out.print(" ");
            }
            System.out.println("");
        }
    }
}
