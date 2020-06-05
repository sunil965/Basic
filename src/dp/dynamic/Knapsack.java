package dp.dynamic;

import java.util.Arrays;
import java.util.Scanner;

class Knapsack {
    public static int zeroOneKnapsack(int wt[], int price[], int w, int n, int dp[][]){

        if(w==0 || n==0) return 0;

        if(dp[n][w] != -1)
            return dp[n][w];

        if(wt[n-1] > w)
            dp[n][w] = (zeroOneKnapsack(wt, price, w, n-1, dp));
        else
            dp[n][w] = Math.max(
                    (price[n-1] + zeroOneKnapsack(wt, price, w-wt[n-1], n-1, dp)),
                    (zeroOneKnapsack(wt, price, w, n-1, dp))
            );
        return dp[n][w];
    }

    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();

        for(int i=0; i<t; i++){
            System.out.println("Enter prices length:");
            int n = s.nextInt();
            System.out.println("Enter knapsack weight:");
            int w = s.nextInt();
            int price[] = new int[n];
            int wt[] = new int[n];
            s.nextLine();

            System.out.println("Enter prices:");
            String str[] = s.nextLine().split(" ");
            System.out.println("Enter weights:");
            String str2[] = s.nextLine().split(" ");


            for(int j=0; j<str.length; j++)
                price[j] = Integer.parseInt(str[j]);

            for(int j=0; j<str2.length; j++)
                wt[j] = Integer.parseInt(str2[j]);

            int dp[][] = new int[n+1][w+1];

            for (int[] row: dp)
                Arrays.fill(row, -1);

            System.out.println("Output : "+zeroOneKnapsack(wt, price, w, n, dp));
        }
    }
}