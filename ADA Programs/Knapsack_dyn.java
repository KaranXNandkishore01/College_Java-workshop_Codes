// WAP for knapsack problem using dynamic programming.

import java.util.Arrays;

public class Knapsack_dyn {
    public static int knapsack(int W, int[] weights, int[] values, int n) {
        int[][] dp = new int[n + 1][W + 1];

        for (int i = 1; i <= n; i++) {
            for (int w = 1; w <= W; w++) {
                if (weights[i - 1] <= w) {
                    dp[i][w] = Math.max(dp[i - 1][w], dp[i - 1][w - weights[i - 1]] + values[i - 1]);
                } else {
                    dp[i][w] = dp[i - 1][w];
                }
            }
        }

        return dp[n][W];
    }

    public static void main(String[] args) {
        int[] weights = {1, 2, 3};
        int[] values = {60, 100, 120};
        int W = 5;
        int n = values.length;

        int maxValue = knapsack(W, weights, values, n);
        System.out.println("Maximum value in Knapsack = " + maxValue);
    }
}
