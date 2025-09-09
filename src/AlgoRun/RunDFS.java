package AlgoRun;

import Resources.Edge;
import Resources.Graph;
import Resources.Node;
import Search.DFS;

public class RunDFS {

    public RunDFS(){}

    public void run(){
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

        DFS dfs = new DFS(g, e, f);
        dfs.search();
    }
}
