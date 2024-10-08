import java.util.ArrayList;
import java.util.Stack;

public class TopologicalSorting {

    // Class representing an edge in the graph
    static class Edge {
        int src; // Source vertex
        int dest; // Destination vertex

        public Edge(int s, int d) {
            this.src = s;
            this.dest = d;
        }
    }

    // Method to create a graph represented as an adjacency list
    static void createGraph(ArrayList<Edge> graph[]) {
        // Initialize each list in the graph
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>(); 
        }

        // Add edges to the graph
        graph[2].add(new Edge(2, 3)); // Edge from 2 to 3
        graph[3].add(new Edge(3, 1)); // Edge from 3 to 1
        graph[4].add(new Edge(4, 0)); // Edge from 4 to 0
        graph[4].add(new Edge(4, 1)); // Edge from 4 to 1
        graph[5].add(new Edge(5, 0)); // Edge from 5 to 0
        graph[5].add(new Edge(5, 2)); // Edge from 5 to 2
    }

    // Method to perform topological sorting on the graph
    public static void topSort(ArrayList<Edge>[] graph) {
        boolean vis[] = new boolean[graph.length]; // Visited array to track visited vertices
        Stack<Integer> s = new Stack<>(); // Stack to store the topological order

        // Perform DFS for each unvisited vertex
        for (int i = 0; i < graph.length; i++) {
            if (!vis[i]) {
                topSortUtil(graph, i, vis, s); // Call DFS helper function
            }
        }

        // Print the topological order
        while (!s.isEmpty()) {
            System.out.print(s.pop() + " ");
        }
    }

    // Helper method to perform DFS and push vertices onto the stack
    public static void topSortUtil(ArrayList<Edge>[] graph, int curr, boolean vis[], Stack<Integer> s) {
        vis[curr] = true; // Mark the current vertex as visited

        // Visit all the adjacent vertices
        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if (!vis[e.dest]) {
                topSortUtil(graph, e.dest, vis, s); // Recursive call for unvisited vertex
            }
        }
        s.push(curr); // Push the current vertex to the stack after visiting all adjacent vertices
    }

    // Main method to execute the topological sorting
    public static void main(String[] args) {
        int v = 6; // Number of vertices
        ArrayList<Edge> graph[] = new ArrayList[v]; // Create the graph
        createGraph(graph); // Initialize the graph with edges
        topSort(graph); // Perform topological sorting
    }
}
