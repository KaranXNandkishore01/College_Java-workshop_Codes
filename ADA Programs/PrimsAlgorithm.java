// WAP for prism's algorithm
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Comparator;
public class PrimsAlgorithm {
    static class Edge {
        int dest;
        int weight;

        Edge(int dest, int weight) {
            this.dest = dest;
            this.weight = weight;
        }
    }

    public static void primsAlgorithm(int[][] graph) {
        int n = graph.length;
        boolean[] inMST = new boolean[n];
        int[] key = new int[n];
        Arrays.fill(key, Integer.MAX_VALUE);
        key[0] = 0; // Start from the first vertex
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.comparingInt(i -> key[i]));
        
        pq.add(0); // Add the first vertex to the priority queue

        while (!pq.isEmpty()) {
            int u = pq.poll();
            inMST[u] = true;

            for (int v = 0; v < n; v++) {
                if (graph[u][v] != 0 && !inMST[v] && graph[u][v] < key[v]) {
                    key[v] = graph[u][v];
                    pq.add(v);
                }
            }
        }

        System.out.println("Minimum Spanning Tree weights: " + Arrays.toString(key));
    }

    public static void main(String[] args) {
        int[][] graph = {
            {0, 2, 0, 6, 0},
            {2, 0, 3, 8, 5},
            {0, 3, 0, 0, 7},
            {6, 8, 0, 0, 9},
            {0, 5, 7, 9, 0}
        };

        primsAlgorithm(graph);
    }
}