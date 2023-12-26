package com.automation.bootcamp_submission;
		

		
		import java.util.Arrays;

		public class DijkstraAlgorithm {
			private static final int INF = Integer.MAX_VALUE;

			// Method to find the shortest path using Dijkstra's algorithm
			public static void dijkstra(int[][] graph, int startNode) {
        int n = graph.length;
        int[] distance = new int[n];
        boolean[] visited = new boolean[n];

        // Initialize distances and set them to infinity except for the start node
        Arrays.fill(distance, INF);
        distance[startNode] = 0;

        for (int i = 0; i < n - 1; i++) {
            int minNode = minDistance(distance, visited);
            visited[minNode] = true;

            for (int j = 0; j < n; j++) {
                if (!visited[j] && graph[minNode][j] != INF && distance[minNode] != INF
                        && distance[minNode] + graph[minNode][j] < distance[j]) {
                    distance[j] = distance[minNode] + graph[minNode][j];
                }
            }
        }

        printShortestPaths(distance, startNode);
    }

    // Helper method to find the index of the node with the minimum distance
    private static int minDistance(int[] distance, boolean[] visited) {
        int min = INF;
        int minIndex = -1;

        for (int i = 0; i < distance.length; i++) {
            if (!visited[i] && distance[i] <= min) {
                min = distance[i];
                minIndex = i;
            }
        }

        return minIndex;
    }

    // Helper method to print the shortest paths
    private static void printShortestPaths(int[] distance, int startNode) {
        System.out.println("Shortest Paths from Node " + startNode + ":");

        for (int i = 0; i < distance.length; i++) {
            System.out.println("To Node " + i + ": " + distance[i]);
        }
    }

    public static void main(String[] args) {
        int[][] graph = {
                {0, 2, INF, 1, INF},
                {2, 0, 4, INF, 5},
                {INF, 4, 0, 3, INF},
                {1, INF, 3, 0, 6},
                {INF, 5, INF, 6, 0}
        };

        int startNode = 0;

        dijkstra(graph, startNode);
    }
}
