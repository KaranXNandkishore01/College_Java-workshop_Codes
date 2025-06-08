// WAP for knapsack problem using greedy approach

public class knapsack_greedy {
    public static double knapsack(int W, int[] weights, int[] values) {
        double totalValue = 0.0;
        double[] valuePerWeight = new double[weights.length];

        // Calculate value per weight for each item
        for (int i = 0; i < weights.length; i++) {
            valuePerWeight[i] = (double) values[i] / weights[i];
        }

        // Sort items by value per weight in descending order
        for (int i = 0; i < valuePerWeight.length - 1; i++) {
            for (int j = 0; j < valuePerWeight.length - i - 1; j++) {
                if (valuePerWeight[j] < valuePerWeight[j + 1]) {
                    // Swap values
                    double tempValue = valuePerWeight[j];
                    valuePerWeight[j] = valuePerWeight[j + 1];
                    valuePerWeight[j + 1] = tempValue;

                    // Swap corresponding weights and values
                    int tempWeight = weights[j];
                    weights[j] = weights[j + 1];
                    weights[j + 1] = tempWeight;

                    int tempVal = values[j];
                    values[j] = values[j + 1];
                    values[j + 1] = tempVal;
                }
            }
        }

        // Greedily add items to the knapsack
        for (int i = 0; i < weights.length && W > 0; i++) {
            if (weights[i] <= W) {
                W -= weights[i];
                totalValue += values[i];
            } else {
                totalValue += values[i] * ((double) W / weights[i]);
                W = 0; // Knapsack is full
            }
        }

        return totalValue;
    }

    public static void main(String[] args) {
        int[] weights = {10, 20, 30};
        int[] values = {60, 100, 120};
        int W = 50;

        double maxValue = knapsack(W, weights, values);
        System.out.println("Maximum value in Knapsack using greedy approach: " + maxValue);
    }
    
}
