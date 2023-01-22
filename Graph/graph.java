package graph;

import java.util.*;
public class graph
{

  // created an array of type LinkedList
  private LinkedList<Integer> adjacency[];

  // initializing array and each array element with linkedlist objects
  public graph(int v){
    adjacency = new LinkedList[v];
    for(int i = 0 ; i <v; i++){
    adjacency[i] = new LinkedList<Integer>();
    }
  }

  public void insertEdge(int s , int d){
    adjacency[s].add(d);
    adjacency[d].add(s);
  }

  public void printGraph(int v){
    for(int i = 0; i < v; i++){
      System.out.println(i + " " + adjacency[i]);
    }
  }

  public void bfs(int source){
    boolean visited_nodes[] = new boolean[adjacency.length];
    int parent_nodes[] = new int[adjacency.length];
    Queue<Integer> q = new LinkedList<>();
    q.add(source);
    visited_nodes[source] = true;
    parent_nodes[source] = -1;

    while(!q.isEmpty()){
      int p = q.poll();
      System.out.print(p);
      for(int i : adjacency[p]){
        if(visited_nodes[i] != true){
          visited_nodes[i] = true;
          q.add(i);
          parent_nodes[i] = p;
        }
      }
    }
  }

  public void dfs(int source){
    
  }

  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter number of vertices and Edges");
    int vertices = sc.nextInt();
    int Edges = sc.nextInt();
    graph graph = new graph(vertices);
    System.out.println("enter edges between vertices");
    for(int i = 0; i < Edges; i++){
      int s = sc.nextInt();
      int d = sc.nextInt();
      graph.insertEdge(s, d);
    }
    graph.printGraph(vertices);
   System.out.println("Enter source for bfs traversal");
   int source = sc.nextInt();
   graph.bfs(source);
  } 
}
