package com.company;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class BFS {

    public class Node{
        public int val;
        public ArrayList<Node> adjacent =  new ArrayList<Node>();

        public Node(int val){this.val = val;}

    }


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

        Node node8 = new Node(8);
        Node node9 = new Node(9);
        Node node10 = new Node(10);
        Node node11 = new Node(11);
        Node node12 = new Node(12);
        Node node13 = new Node(13);

        node1.adjacent.add(node4);
        node1.adjacent.add(node5);
        node1.adjacent.add(node6);
        node1.adjacent.add(node7);
        node1.adjacent.add(node10);

        node4.adjacent.add(node3);

        node10.adjacent.add(node11);

        node4.adjacent.add(node8);

        node7.adjacent.add(node9);

        node9.adjacent.add(node12);

        node12.adjacent.add(node13);

        node13.adjacent.add(node1);//circle
        //                                                      layer
        //         13                                             5
        //         |
        //         12                                             4
        //         |
        // 8       9     11                                       3
        //  \      |    /
        //   4 5 6 7 10                                           2
        //    \| |/ /
        //      1                                                 1
        //     / \
        //    2   3                                               2
        //   / \ / \
        //   4 5 6  7                                             3
        //  /        \
        // 8          9                                           4
        //              \
        //               12
        //                 \
        //                 13
        //                   \
        //                    1
        System.out.println("test2-graph");
        search(node1);
        System.out.println();
    }

    // O(e) e is number of edges
    // O(n) space complexity
    //Slightly modified BFS is a very useful algorithm to find the shortest path.
    // It is simple and applicable to all graphs without edge weights.
    public void search(Node node) {
        HashSet<Node> visited = new HashSet<Node>();
        LinkedList<Node> queue = new LinkedList<Node>();
        visited.add(node);
        queue.add(node);

        while (queue.size() != 0) {
            node = queue.poll();
            System.out.print(node.val+" ");
            for (Node n:node.adjacent) {
                if (!visited.contains(n)) {
                    visited.add(n);
                    queue.add(n);
                }
            }
        }
    }

}
