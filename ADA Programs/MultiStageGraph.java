//WAP for multstage graph problem
public class MultiStageGraph {

    public static int minCost(int[][] cost, int n) {
        int[] dp = new int[n];
        dp[0] = cost[0][0]; // Starting point

        for (int i = 1; i < n; i++) {
            dp[i] = Integer.MAX_VALUE;
            for (int j = 0; j < i; j++) {
                if (cost[j][i] != -1) { // If there's a path
                    dp[i] = Math.min(dp[i], dp[j] + cost[j][i]);
                }
            }
        }

        return dp[n - 1]; // Return the minimum cost to reach the last stage
    }

    public static void main(String[] args) {
        int[][] cost = {
            {0, 10, 15, -1, -1},
            {-1, 0, 35, 25, -1},
            {-1, -1, 0, 30, 20},
            {-1, -1, -1, 0, 5},
            {-1, -1, -1, -1, 0}
        };
        int n = cost.length;

        int result = minCost(cost, n);
        System.out.println("Minimum cost to reach the last stage: " + result);
    }
}
