package Graph;

public class DFS {

    public void dfsUtil(Graph graph, int vertex, boolean []visited) {
        visited[vertex] = true;
        System.out.print(vertex + " ");
        for (Integer v : graph.getAdjacencyList(vertex)) {
            if (!visited[v]) {
                dfsUtil(graph, v, visited);
            }
        }
     }
    
    public void dfs(Graph graph, int start) {

        boolean []visited = new boolean[graph.getVertices()];
        dfsUtil(graph, start, visited);
    }
}
