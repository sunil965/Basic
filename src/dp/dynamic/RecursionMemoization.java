package dp.dynamic;

import java.util.Arrays;

public class RecursionMemoization {

    public static void main(String[] args) {
        int w = 11;
        int[] value = {1, 3, 4, 5};
        int[] weight = {1, 4, 5, 7};
        System.out.println("Maximum value with minimum weight : " + knapsack(value, weight, value.length, w));
    }

    private static int knapsack(int[] vls, int[] wts, int n, int w) {
        int[][] t = new int[n + 1][w + 1];
        for (int[] row : t)
            Arrays.fill(row, 0);

        if (n == 0 || w == 0) {
            return 0;
        }
        if (t[n][w] != 0) {
            return t[n][w];
        }
        if (wts[n - 1] <= w) {
            t[n][w] = Math.max((vls[n - 1] + knapsack(vls, wts, n - 1, w - wts[n - 1])), knapsack(vls, wts, n - 1, w));
        } else if (wts[n - 1] > w) {
            t[n][w] = knapsack(vls, wts, n - 1, w);
        }
        return t[n][w];
    }
}
