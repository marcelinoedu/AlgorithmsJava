package Resources;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Graph {

    private final Boolean directed;

    private final Map<Node, List<Edge>> adjList = new HashMap<>();

    public Graph(Boolean directed){
        this.directed = directed;
    }

    private void addNode(Node node){
        adjList.computeIfAbsent(node, n -> new ArrayList<>());
    }

    public void addEdge(Edge edge){
        addNode(edge.getFromNode());
        addNode(edge.getToNode());

        adjList.get(edge.getFromNode()).add(edge);

        if(!directed){
            Edge reverse = new Edge(edge.getToNode(), edge.getFromNode(), 1.0);
            adjList.get(edge.getToNode()).add(reverse);
        }
    }


    public List<Edge> getEdges(Node node){
        return new ArrayList<>(this.adjList.get(node));
    }

    public boolean containsNode(Node node) {
        return adjList.containsKey(node);
    }



}
