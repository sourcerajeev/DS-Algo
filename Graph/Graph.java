package Graph;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Graph {
    private int vertices;
    private Map<Integer, List<Integer>> adjacencyList;

    public Graph(int vertices) {
        this.vertices = vertices;
        adjacencyList = new HashMap<>();
    }

    public void addEdge(int source, int destination) {
        adjacencyList.computeIfAbsent(source, k -> new LinkedList<>()).add(destination);
        adjacencyList.computeIfAbsent(destination, k -> new LinkedList<>()).add(source);
    }

    public void addDirectedEdge(int source, int destination) {
        adjacencyList.computeIfAbsent(source, k -> new LinkedList<>()).add(destination);
    }

    public List<Integer> getAdjacencyList(int vertex) {
        return adjacencyList.get(vertex);
    }

    public int getVertices() {
        return vertices;
    }
}
