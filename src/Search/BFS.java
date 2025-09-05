package Search;

import Resources.Edge;
import Resources.Graph;
import Resources.Node;
import Resources.Queue;

import java.util.ArrayList;
import java.util.List;

public class BFS {

    private final Graph graph;
    private final Node startNode;
    private final Node goalNode;
    private final Queue queue = new Queue();
    private final ArrayList<Node> visitedNodesPath = new ArrayList<>();

    public BFS(Graph graph, Node startNode, Node goalNode) {
        this.graph = graph;
        this.startNode = startNode;
        this.goalNode = goalNode;
    }

    public void search() {

        if (!graph.containsNode(startNode)) {
            throw new IllegalArgumentException("Node de início não pertence ao Grafo");
        }

        queue.enqueue(startNode);

        while (!queue.isEmpty()) {
            System.out.println("fila: " + queue);
            Node actualNode = queue.dequeue();
            System.out.println("node tirado da fila: " + actualNode);
            visitedNodesPath.add(actualNode);

            if (actualNode.equals(goalNode)) {
                System.out.println("resultado encontrado= " + goalNode +
                        ", caminho feito=" + visitedNodesPath);
                break;
            }

            List<Edge> edges = graph.getEdges(actualNode);
            System.out.println("vizinhos: " + edges);

            for (Edge edge : edges) {
                Node neighbor = edge.getToNode();
                if (!visitedNodesPath.contains(neighbor)) {
                    queue.enqueue(neighbor);
                    System.out.println("vizinho colocado na fila " + neighbor);
                }
            }
            System.out.println("atualização dos nodes visitados " + visitedNodesPath);
        }
    }

}
