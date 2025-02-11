package Graph;

import java.util.LinkedList;
import java.util.List;

public class Graph {
    private int vertices;
    private List<List<Integer>> adjacencyList;

    public Graph(int vertices) {
        this.vertices = vertices;
        adjacencyList = new LinkedList<>();
        for (int i = 0; i < vertices; i++) {
            adjacencyList.add(new LinkedList<>());
        }
    }

    public void addEdge(int source, int destination) {
        adjacencyList.get(source).add(destination);
        adjacencyList.get(destination).add(source);
    }

    public void addDirectedEdge(int source, int destination) {
        adjacencyList.get(source).add(destination);
    }

    public List<Integer> getAdjacencyList(int vertex) {
        return adjacencyList.get(vertex);
    }

    public int getVertices() {
        return vertices;
    }
}
