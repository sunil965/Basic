package dp.dynamic;

public class Recursion {
    public static void main(String[] args){
        int w = 11;
        int[] value = {1, 3, 4, 5};
        int[] weight = {1, 4, 5, 7};
        System.out.println("Maximum value with minimum weight : " + knapsack(value, weight, value.length, w));
    }

    private static int knapsack(int[] vls, int[] wts, int n, int w) {
        if (n == 0 || w == 0) {
            return 0;
        }
        if (wts[n - 1] <= w) {
            return Math.max((vls[n-1] + knapsack(vls, wts, n - 1, w - wts[n - 1])), knapsack(vls, wts, n - 1, w));
        }
        else if (wts[n - 1] > w){
            return knapsack(vls, wts, n - 1, w);
        }
        return 0;
    }
}
