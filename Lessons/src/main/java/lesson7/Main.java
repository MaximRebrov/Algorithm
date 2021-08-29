package lesson7;

public class Main {
    public static void main(String[] args) {
        Graph graph = new Graph();

        graph.addVertex('A');
        graph.addVertex('B');
        graph.addVertex('C');
        graph.addVertex('D');
        graph.addVertex('E');
        graph.addVertex('H');
        graph.addVertex('P');

        graph.addEdge(0, 2);
        graph.addEdge(0, 4);
        graph.addEdge(1, 2);
        graph.addEdge(5, 6);
        graph.addEdge(7, 2);

//        graph.print(5);
//        graph.DFS(2);
        graph.dfs();
    }
}
