//WAP for Krushkal's algorithm.
import java.util.Arrays;
import java.util.Comparator;

public class KruskalsAlgorithm {
    static class Edge {
        int src, dest, weight;

        Edge(int src, int dest, int weight) {
            this.src = src;
            this.dest = dest;
            this.weight = weight;
        }
    }

    public static int find(int[] parent, int i) {
        if (parent[i] == -1) {
            return i;
        }
        return find(parent, parent[i]);
    }

    public static void union(int[] parent, int x, int y) {
        int xset = find(parent, x);
        int yset = find(parent, y);
        parent[xset] = yset;
    }

    public static void kruskalsAlgorithm(Edge[] edges, int V) {
        Arrays.sort(edges, Comparator.comparingInt(e -> e.weight));
        int[] parent = new int[V];
        Arrays.fill(parent, -1);

        System.out.println("Minimum Spanning Tree edges:");
        for (Edge edge : edges) {
            int x = find(parent, edge.src);
            int y = find(parent, edge.dest);
            if (x != y) {
                System.out.println("Edge: " + edge.src + " - " + edge.dest + " Weight: " + edge.weight);
                union(parent, x, y);
            }
        }
    }

    public static void main(String[] args) {
        Edge[] edges = {
            new Edge(0, 1, 10),
            new Edge(0, 2, 6),
            new Edge(0, 3, 5),
            new Edge(1, 3, 15),
            new Edge(2, 3, 4)
        };
        int V = 4;

        kruskalsAlgorithm(edges, V);
    }
}
