package com.ang.topological_sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Graph {
    private int v; // 顶点的个数
    private LinkedList<Integer> adj[]; // 邻接表

    public Graph(int v) {
        this.v = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; ++i) {
            adj[i] = new LinkedList<>();
        }
    }

    public void addEdge(int s, int t) { // s先于t，边s->t
        if (s < v) {
            adj[s].add(t);
        }
    }

    public LinkedList<Integer>[] getAdj() {
        return adj;
    }

    public int getV() {
        return v;
    }

//    public static void main(String[] args) {
//        Graph graph = new Graph(5);
//        graph.addEdge(1, 3);
//        graph.addEdge(0, 2);
//        graph.addEdge(0, 1);
//        graph.addEdge(2, 4);
//        graph.addEdge(3, 4);
//
//        int[] a = new int[10];
//        for (int i = 0; i < 5; i++) {
//            a[i] = i;
//        }
//        System.out.println(Arrays.stream(a).count());
//        System.out.println(Arrays.stream(a).sum());
//
//        List<Integer> list = new ArrayList<>(100);
//
//        KahnAlgorithm kahnAlgorithm = new KahnAlgorithm();
//        kahnAlgorithm.topoSortByKahn(graph.getV(), graph.getAdj());
//    }
}
