package Resources;

public class Edge {
    private final Node fromNode;
    private final Node toNode;
    private final double cost;


    public Edge(Node fromNode, Node toNode, double cost){
        this.fromNode  = fromNode;
        this.toNode  =toNode;
        this.cost = cost;
    }

    public Node getFromNode(){
        return this.fromNode;
    }

    public Node getToNode() {
        return toNode;
    }

    public double getCost() {
        return cost;
    }

    @Override
    public String toString() {
        return "Edge(" + fromNode.getName() + " -> " + toNode.getName() + ", cost=" + cost + ")";
    }
}
