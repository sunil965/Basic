package dp.dynamic;

public class Knapsack01 {
    public static void main(String... arg) {
        int w = 11;
        int[] value = {1, 3, 4, 4};
        int[] weight = {1, 4, 5, 7};
        System.out.println("Maximum value with minimum weight : " + knapsack(value, weight, value.length, w));
    }

    private static int knapsack(int[] vls, int[] wts, int n, int w) {
        int[][] table = new int[n + 1][w + 1];
       /*
        To initialize : Base condition.
        for(int i =0; i<=n; i++){
            for(int j =0; j<=w; j++) {
                if (i==0 || j==0) {
                    table[i][j] = 0;
                }
            }
        }*/

        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < w + 1; j++) {
                if (wts[i - 1] <= j) {
                    table[i][j] = Math.max((vls[i - 1] + table[i - 1][j - wts[i - 1]]), table[i - 1][j]);
                } else {
                    table[i][j] = table[i - 1][j];
                }
            }
        }

        for (int row = 0; row < table.length; row++) {
            for (int column = 0; column < table[0].length; column++) {
                System.out.format("%d \t", table[row][column]);
            }
            System.out.println("");
        }

        return table[n][w];
    }
}
