package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class DFS {
    public class Node{
        public int val;
        public ArrayList<Node> adjacent =  new ArrayList<Node>();

        public Node(int val){this.val = val;}

    }

    public HashSet<Node> visited = new HashSet<Node>();

    public void test() {
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);
        Node node6 = new Node(6);
        Node node7 = new Node(7);

        node1.adjacent.add(node2);
        node1.adjacent.add(node3);

        node2.adjacent.add(node4);
        node2.adjacent.add(node5);

        node3.adjacent.add(node6);
        node3.adjacent.add(node7);

        //      1
        //     / \
        //    2   3
        //   / \ / \
        //   4 5 6  7
        System.out.println("test1-tree");
        search(node1);
        System.out.println();

        node1.adjacent.add(node4);
        node1.adjacent.add(node5);
        node1.adjacent.add(node6);
        node1.adjacent.add(node7);
        node4.adjacent.add(node3);

        //   4 5 6 7
        //    \| |/
        //      1
        //     / \
        //    2   3
        //   / \ / \
        //   4 5 6  7
        //  /
        //  3

        System.out.println("test2-graph");
        visited.clear();
        search(node1);
        System.out.println();
    }

    // O(e) e is number of edges
    // O(n) space complex
    // faster to find shortest path between two
    public void search(Node root){
        if(root != null){
            System.out.print(root.val + "->");
            visited.add(root);
            for (Node n:root.adjacent){
                if(!visited.contains(n)) search(n);
            }
        }
    }
}
