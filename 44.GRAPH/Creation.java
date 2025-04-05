import java.util.ArrayList;
import java.util.Scanner;

public class Creation {
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
        /*      (5)
         *   0------1
         *         / \
         *    (1) /   \ (3)
         *       /     \
         *      2-------3
         *      |   (1)
         *  (2) |
         *      |
         *      4
         * 
         *  */
        Scanner sc=new Scanner(System.in);
        int V=5;
        // int arr[]=new arr[V];
        @SuppressWarnings("unchecked")
        ArrayList<Edge>[]graph=new ArrayList[V];
        for (int i = 0; i < V; i++) {
           graph[i]=new ArrayList<>(); 
        }
        // 0 vertex
        graph[0].add(new Edge(0,1,5));
        //1 Vertex
        graph[1].add(new Edge(1,0,5));
        graph[1].add(new Edge(1,2,1));
        graph[1].add(new Edge(1,3,3));
        //2 vertex
        graph[2].add(new Edge(2,1,1));
        graph[2].add(new Edge(2,3,1));
        graph[2].add(new Edge(2,4,2));

        //3 vertex
        graph[3].add(new Edge(3,1,3));
        graph[3].add(new Edge(3,2,1));
        //4 vertex
        graph[4].add(new Edge(4,2,2));
        System.out.println("Enter the Vertex:");
        int n=sc.nextInt();
        //n's neighbours
        for (int i = 0; i < graph[2].size(); i++) {
            Edge e=graph[2].get(i);
            System.out.println("Vertex " + n + " is connected to Vertex: " + e.dest + " with Weight : " + e.wt);

        }
    }
}
