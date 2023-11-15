package graph.representation;

public class AdjacencyMatrix {
    private final int[][] adjacencyMatrix;
    private final int vertices;

    public AdjacencyMatrix(int vertices) {
        this.vertices = vertices;
        this.adjacencyMatrix = new int[vertices][vertices];
    }

    public void addEdge(int source, int destination) {
        adjacencyMatrix[source][destination] = 1;
        adjacencyMatrix[destination][source] = 1;   // uncomment for the undirected graph
    }

    public void printGraph() {
        System.out.println("Adjacency Matrix");
        for (int i = 0; i < vertices; i++) {
            for (int j = 0; j < vertices; j++) {
                System.out.print(adjacencyMatrix[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int vertices = 5;
        AdjacencyMatrix graph = new AdjacencyMatrix(vertices);

        graph.addEdge(0, 1);
        graph.addEdge(0, 4);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 3);
        graph.addEdge(3, 4);

        graph.printGraph();
    }
}

