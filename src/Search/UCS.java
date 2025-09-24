package Search;

import Resources.Edge;
import Resources.Graph;
import Resources.Heap;
import Resources.Node;

import java.util.ArrayList;
import java.util.List;

public class UCS {

    protected final Graph graph;
    protected final Node startNode;
    protected final Node goalNode;
    protected final Heap heap;
    protected final ArrayList<Node> visitedNodePath;

    public UCS(Graph graph, Node startNode, Node goalNode){
        this.graph  = graph;
        this.startNode = startNode;
        this.goalNode = goalNode;
        this.heap = new Heap("min");
        this.visitedNodePath = new ArrayList<>();
    }


    public void search(){

        if(!this.graph.containsNode(this.startNode)){
            throw new IllegalArgumentException("Node de início não pertence ao Grafo");
        }

        List<Edge> neigbors = graph.getEdges(this.startNode);
        for(Edge neigbor : neigbors){
            heap.insert(neigbor);
        }

        System.out.println("Essa é a heap ordenada: " + heap);
    }


}
