package com.binarytree;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BinarySearchTreeTest {
    BinarySearchTree bst;
    Node<Integer> root;

    @Before
    public void set() {
        bst = new BinarySearchTree();
    }

    @Test
    public void createBinaryTree() {
        Node<Integer> first = new Node(56);
        Node<Integer> second = new Node(30);
        Node<Integer> third = new Node(70);

        bst.add(first);
        bst.add(second);
        bst.add(third);

        bst.getInOrder();
        bst.getPreOrder();
        bst.getPostOrder();

        boolean result = bst.root.left.data.equals(30) && bst.root.data.equals(56) && bst.root.right.data.equals(70) ;
        Assert.assertTrue(result);
    }

    @Test
    public void Test_to_getSize() {
        Node<Integer> first = new Node(56);
        Node<Integer> second = new Node(30);
        Node<Integer> third = new Node(70);

        bst.add(first);
        bst.add(second);
        bst.add(third);
        
        int result = bst.getSize();
        Assert.assertEquals(3, result);
    }
}
