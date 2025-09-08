package Search;

import Resources.Edge;
import Resources.Graph;
import Resources.Node;
import Resources.Stack;
import java.util.ArrayList;
import java.util.List;

public class DFS {

    private final Graph graph;
    private final Node startNode;
    private final Node goalNode;
    private final Stack stack;
    private final ArrayList<Node> visitedNodePath;


    public DFS(Graph graph, Node startNode, Node goalNode){
        this.graph = graph;
        this.startNode = startNode;
        this.goalNode = goalNode;
        this.stack = new Stack();
        this.visitedNodePath = new ArrayList<>();
    }

    public void search(){
        if(!graph.containsNode(this.goalNode)){
            throw new IllegalArgumentException("Node de início não pertence ao Grafo");
        }

        stack.push(startNode);

        while(!stack.isEmpty()){
            System.out.println("Pilha: " + stack);
            Node actualNode = stack.pop();
            System.out.println("Node retirado da pilha: " + actualNode);

            visitedNodePath.add(actualNode);

            if(actualNode.equals(goalNode)){
                System.out.println("Resultado encontrado= " + actualNode + ", caminho feito= " + visitedNodePath);
                break;
            }

            List<Edge> edges = graph.getEdges(actualNode);
            System.out.println("vizinhos: " + edges);

            for(Edge edge : edges){
                Node neighbor = edge.getToNode();
                if(!visitedNodePath.contains(neighbor)){
                    stack.push(neighbor);
                    System.out.println("vizinho colocado na pilha " + neighbor);
                }
            }
            System.out.println("atualização dos nodes visitados " + visitedNodePath);
        }
    }
}
