package com.binarytree;

public class BinarySearchTree {
    public Node root;

    public BinarySearchTree(){
        this.root = null;
    }

    public <T extends Comparable> void add(Node node){
        root = insert(this.root, node.data);
    }

    public <T extends Comparable> Node insert(Node root, T data){
        if(root == null) {
            root = new Node(data);
            return root;
        }

        if (data.compareTo(root.data) < 0){
            root.left = insert(root.left, data);
        }
        else if (data.compareTo(root.data) > 0) {
            root.right = insert(root.right, data);
        }
        return root;
    }

    public void getInOrder(){
        System.out.println("\nIn Order : ");
        inOrder(root);
    }
    public void inOrder(Node root) {
        if (root != null) {
            inOrder(root.left);
            System.out.println(root.data);
            inOrder(root.right);
        }
    }

    public void getPreOrder(){
        System.out.println("\nPre Order : ");
        preOrder(root);
    }
    public void preOrder(Node root) {
        if (root != null) {
            System.out.println(root.data);
            preOrder(root.left);
            preOrder(root.right);
        }
    }

    public void getPostOrder(){
        System.out.println("\nPost Order : ");
        postOrder(root);
    }
    public void postOrder(Node root){
        if (root != null) {
            postOrder(root.left);
            postOrder(root.right);
            System.out.println(root.data);
        }
    }

    public int getSize(){
        System.out.println("Size of the tree is : " + size(root));
        return size(root);
    }
    public int size(Node root){
        if (root == null)
            return 0;
        else
            return(1 + size(root.left) + size(root.right));
    }
}
