package lesson7;

import java.util.LinkedList;
import java.util.Queue;

public class Graph {
    private final int MAX_VERTS = 32;
    private Vertex[] vertexList;
    private int[][] adjMat;
    private int size;
    private Stack stack;

    public Graph(){
        vertexList = new Vertex[MAX_VERTS];
        adjMat = new int[MAX_VERTS][MAX_VERTS];
        size = 0;
        for (int i = 0; i < MAX_VERTS; i++){
            for (int j = 0; j < MAX_VERTS; j++){
                adjMat[i][j] = 0;
            }
        }
    }
    public void addVertex(char label){
        vertexList[size++] = new Vertex(label);
    }

    public void addEdge(int start, int end){
        adjMat[start][end] = 1;
        adjMat[end][start] = 1;
    }

    public void print(int vertex){
        System.out.println(vertexList[vertex].label);
    }

    public int getAdjUnvisitedVertex(int ver){
        for (int i = 0; i < size; i++){
            if (adjMat[ver][i] == 1 && vertexList[i].wasVisited == false){
                return i;
            }
        }
        return -1;
    }

    public void DFS(int f){
        vertexList[f].wasVisited = true;
        for (int i = 0; i < size; i++){
            int v = getAdjUnvisitedVertex(f);
            if (!vertexList[i].wasVisited && v != -1){
                fullPrintVertex(f, v);
                DFS(i);
            }
        }
    }

    public void dfs(){
        vertexList[0].wasVisited = true;
        print(0);
        stack.push(0);
        while (!stack.isEmpty()){
            int v = getAdjUnvisitedVertex(stack.peek());
            if (v == -1){
                stack.pop();
            }else {
                vertexList[v].wasVisited = true;
                print(v);
                stack.push(v);
            }
        }
        for (int i = 0; i < size; i++){
            vertexList[i].wasVisited = false;
        }
    }

    public void bfs_2(){
        Queue<Integer> queue = new LinkedList<>();
        vertexList[0].wasVisited = true;
        print(0);
        queue.add(0);

        while (!stack.isEmpty()){
            int v = queue.remove();
            int v2 = getAdjUnvisitedVertex(v);
            while (v2 != -1){
                vertexList[v2].wasVisited = true;
                print(v2);
                queue.add(v2);
            }
        }
        for (int i = 0; i < size; i++){
            vertexList[i].wasVisited = false;
        }
    }

    private void fullPrintVertex(int vertex, int vertex2) {
        System.out.println("Вершины " + vertexList[vertex].label + "-" + vertexList[vertex2].label);
    }
}
