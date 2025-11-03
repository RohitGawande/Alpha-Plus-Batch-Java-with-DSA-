/* Definition:- Greedy Algorithm is the problem solving technique where we make the locally optimum choice at each statge and hope to achieve a global optimum
     Pros                Cons
 Simple and Easy    A lot of time ,global
 Good enough TC      optimum is not achieved
1)uni-Directional(Directed Graph)     2)Un-Directed
 *   A--->B                                  A---B
 * 3) Bi-Directional
 *     A    ---->  B
 *          <---
 * 
 */

import java.util.ArrayList;

public class Graph {
    static class Edge{
        int src;
        int dest;
        int wt;
        public Edge(int s,int d,int w){
            this.src=s;
            this.dest=d;
            this.wt=w;
        }

    }
    public static void main(String[] args) {
        int V=5;
        ArrayList<Edge>[] graph=new ArrayList[V];
        for (int i = 0; i < graph.length; i++) {
            graph[i]=new ArrayList<>();
        }
        graph[0].add(new Edge(0, 1, 5));

        graph[1].add(new Edge(1, 0, 5));
        graph[1].add(new Edge(1, 2, 1));
        graph[1].add(new Edge(1, 3, 3));

        graph[2].add(new Edge(2, 1, 1));
        graph[2].add(new Edge(2, 3, 1));
        graph[2].add(new Edge(2, 4, 4));

        graph[3].add(new Edge(3, 1, 3));
        graph[3].add(new Edge(3, 2, 1));

        graph[4].add(new Edge(4, 2, 2));

        System.out.println("Neighbours of Vertex 2:");
        for (int i = 0; i < graph[2].size(); i++) {
            Edge e=graph[2].get(i);
            System.out.println("Vertex 2 is connected to " + e.dest + " with weight " + e.wt);
 
        }
    }
}
