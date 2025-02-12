package Graph;

public class GraphMain {
    public static void main(String[] args) {
        Graph graph = new Graph(5);
        graph.addEdge(0, 1);
        graph.addEdge(0, 4);
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 3);
        graph.addEdge(3, 4);

        for (int i = 0; i < graph.getVertices(); i++) {
            System.out.print(i + " -> ");
            for (int vertex : graph.getAdjacencyList(i)) {
                System.out.print(vertex + " ");
            }
            System.out.println();
        }

        BFS bfs = new BFS();
        System.out.println("BFS traversal starting from vertex 0:");
        bfs.bfs(graph, 0);

        DFS dfs = new DFS();
        System.out.println("\nDFS traversal starting from vertex 0:");
        dfs.dfs(graph, 0);
    }
}
