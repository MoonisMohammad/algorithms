package com.company;

public class TreeTraversal {
    private class Node{
        public int val;
        public Node left;
        public Node right;

        public Node(int val){this.val = val;}
    }
     //      1
     //     / \
     //    2   3
     //   / \ / \
     //   4 5 6  7
    public void test() {
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);
        Node node6 = new Node(6);
        Node node7 = new Node(7);

        node1.left = node2;
        node1.right = node3;

        node2.left = node4;
        node2.right = node5;

        node3.left = node6;
        node3.right = node7;

        // left -> current -> right
        System.out.println("in-order-traversal");
        inOrderTraversal(node1);
        System.out.println();

        // current ->left ->  right
        System.out.println("pre-order-traversal");
        preOrderTraversal(node1);
        System.out.println();

        // left -> right -> current
        System.out.println("post-order-traversal");
        postOrderTraversal(node1);
        System.out.println();
    }

    // left -> current -> right
    public void inOrderTraversal(Node node){
        if(node!=null){
            inOrderTraversal(node.left);
            System.out.print(node.val + "->");
            inOrderTraversal(node.right);
        }

    }

    // current ->left ->  right
    public void preOrderTraversal(Node node){
        if(node!=null){
            System.out.print(node.val + "->");
            preOrderTraversal(node.left);
            preOrderTraversal(node.right);
        }
    }

    // left -> right -> current
    public void postOrderTraversal(Node node){
        if(node!=null){
            postOrderTraversal(node.left);
            postOrderTraversal(node.right);
            System.out.print(node.val + "->");
        }
    }
}
