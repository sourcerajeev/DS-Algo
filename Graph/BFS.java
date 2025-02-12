package Graph;

import java.util.*;

class BFS {

    public void bfs(Graph graph, int start) {
        boolean []visited = new boolean[graph.getVertices()];
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        visited[start] = true;

        while (!queue.isEmpty()) {
            int current = queue.poll();
            System.out.print(current + " ");
            for (int vertex : graph.getAdjacencyList(current)) {
                if (!visited[vertex]) {
                    queue.add(vertex);
                    visited[vertex] = true;
                }
            }
        }
    }
}