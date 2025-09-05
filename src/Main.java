import Resources.Edge;
import Resources.Graph;
import Resources.Node;
import Search.BFS;

public class Main {
    public static void main(String[] args) {

        Node a = new Node("A");
        Node b = new Node("B");
        Node c = new Node("C");
        Node d = new Node("D");
        Node e = new Node("E");
        Node f = new Node("F");

        Graph g = new Graph(false);

        g.addEdge(new Edge(a, b, 1.0));
        g.addEdge(new Edge(a, c, 1.0));
        g.addEdge(new Edge(b, d, 1.0));
        g.addEdge(new Edge(b, e, 1.0));
        g.addEdge(new Edge(c, f, 1.0));

        BFS bfs = new BFS(g, e, f);
        bfs.search();
    }
}
