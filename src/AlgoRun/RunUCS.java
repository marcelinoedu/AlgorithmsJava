package AlgoRun;

import Resources.Edge;
import Resources.Graph;
import Resources.Node;
import Search.UCS;

public class RunUCS {

   public RunUCS(){}

   public void run(){
       Graph graph = new Graph(false);
       Node a = new Node("a");
       Node b = new Node("b");
       Node c = new Node("c");
       Node d = new Node("d");
       Node e = new Node("e");
       Node f = new Node("f");
       Node g = new Node("g");
       Node h = new Node("h");
       Node i = new Node("i");
       Node k = new Node("k");
       Node l = new Node("l");
       Node m = new Node("m");
       Node n = new Node("n");
       Node o = new Node("o");
       Node p = new Node("p");
       Node x = new Node("x");

       graph.addEdge(new Edge(a, b, 3));
       graph.addEdge(new Edge(a, c, 6));
       graph.addEdge(new Edge(b, h, 3));
       graph.addEdge(new Edge(b, k, 3));
       graph.addEdge(new Edge(h, g, 2));
       graph.addEdge(new Edge(h, i, 2));
       graph.addEdge(new Edge(h, k, 4));
       graph.addEdge(new Edge(g, c, 2));
       graph.addEdge(new Edge(g, f, 1));
       graph.addEdge(new Edge(c, f, 3));
       graph.addEdge(new Edge(c, o, 2));
       graph.addEdge(new Edge(c, p, 2));
       graph.addEdge(new Edge(f, d, 1));
       graph.addEdge(new Edge(f, e, 1));
       graph.addEdge(new Edge(d, e, 1));
       graph.addEdge(new Edge(e, i, 2));
       graph.addEdge(new Edge(k, l, 1));
       graph.addEdge(new Edge(k, n, 3));
       graph.addEdge(new Edge(n, m, 2));
       graph.addEdge(new Edge(m, x, 1));
       graph.addEdge(new Edge(m, e, 14));

       UCS ucs =  new UCS(graph, h, o);
       ucs.search();
   }
}
