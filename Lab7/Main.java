class Main {
  public static void main(String[] args) {
    // 1. Define the vertices (buildings) based on the campus map
    String[] vertices = {"Liberal Arts", "Student Services", "Health Careers & Sciences", "Health Technologies Center", "Recreation Center", "Technology Learning Center", "Business & Technology", "Theatre"};
    // 2-Define Edges
    int[][] edges = { 
      {0, 1}, {1, 0},
      {0, 7}, {7, 0},
      {7, 6}, {6, 7},
      {6, 5}, {5, 6},
      {1, 5}, {5, 1}, 
      {1, 2}, {2, 1},
      {2, 3}, {3, 2},
      {2, 4}, {4, 2},
      {3, 4}, {4, 3}
    };
    // 3. Create the graph (name "graph") using the vertices and edges
    UnweightedGraph<String> graph = new UnweightedGraph<>(vertices, edges);
    // 4. Perform a depth-first search (name "dfs")(DFS) starting from the "Business & Technology" building
    UnweightedGraph<String>.SearchTree dfs = graph.dfs(6);
    // 5. Retrieve and print the search order of the DFS traversal
    System.out.println("DFS Search Order:");
    java.util.List<Integer> searchOrder = dfs.getSearchOrder();
    for (int i = 0; i < searchOrder.size(); i++) {
      System.out.print(graph.getVertex(searchOrder.get(i)) + " ");
    }
    System.out.println();
    // 6. Print the parent-child relationships for each vertex during the DFS traversal
    for (int i = 0; i <searchOrder.size(); i++)
      if (dfs.getParent(i) != -1) {
        System.out.println("parent of " + graph.getVertex(i) + " is " + graph.getVertex(dfs.getParent(i)));
      }
    // 7. Call the printPath method (assuming this method exists in the UnweightedGraph class)
    dfs.printPath(3);
    System.out.println();
    dfs.printPath(1);
    System.out.println();
    dfs.printPath(4);
    System.out.println();
     // 8. Call printTree() to print the entire DFS tree (assuming this method exists in the UnweightedGraph class)
     dfs.printTree();
  }
}