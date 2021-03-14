package com.binarytree;

public class Node<T extends Comparable> {
    public T data;
    public Node<T> left;
    public Node<T> right;

    public Node(T data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
}
