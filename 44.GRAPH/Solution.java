import java.util.ArrayList;
import java.util.Scanner;

public class Solution {
    static class Edge{
        int src;
        int dest;
        int wt;
        Edge(int src,int dest,int wt){
            this.src=src;
            this.dest=dest;
            this.wt=wt;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int V=5;
        ArrayList<Edge> [] graph=new ArrayList[V];
        for (int i = 0; i < V; i++) {
            graph[i]=new ArrayList<>();
        } 
        graph[0].add(new Edge(0,1,5));
        graph[1].add(new Edge(1,2,1));
        graph[1].add(new Edge(1,0,5));
        graph[1].add(new Edge(1,3,3));
        graph[2].add(new Edge(2,1,1));
        graph[2].add(new Edge(2,3,1));
        graph[2].add(new Edge(2,4,2));

        System.out.println("Enter the Vertex:");
        int n=sc.nextInt();
        for (int i = 0; i < graph[n].size(); i++) {
            Edge e=graph[n].get(i);
            System.out.println("Vertex"+n+"is Connected to Vertex:"+ e.dest+"with Weight"+e.wt);
        }
    }
}
