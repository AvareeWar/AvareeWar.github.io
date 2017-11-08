package com.company;


import java.util.ArrayList;
import java.util.Scanner;

class Node<T> {
    T data;
    Node<T> left;
    Node<T> right;
    Node<T> root;

    public Node(T data) {
        this.data = data;
        left = null;
        right = null;
        root = null;
    }


//    1. A function/method that take preorder and inorder traversal sequence and build the corresponding binary tree. Both traversal sequences are stored as array.
//    2. Implement the non-recursive inorder, preorder and postorder traversal of the binary tree.
//    3. Implement the binary tree traversal by level, with the level number displayed.


    public void setLeft(Node<T> n) {
        left = n;
    }

    public void setRight(Node<T> n) {
        right = n;
    }

    public Node<T> getLeft() {
        return left;
    }

    public Node<T> getRight() {
        return right;
    }


    class BST {
    }

    public boolean isEmpty(Node<T> root) {
        return root == null;
    }

    public Node<T> getData() {
        return (Node<T>) data;
    }

    public void inorder() {
        inorder(root);
    }

    public void inorder(Node<T> root) {
        if (root != null) {
            inorder(root.getLeft());
            System.out.print(root.getData() + " ");
            inorder(root.getRight());
        }
    }

    public void preorder() {
        preorder(root);
    }

    public void preorder(Node<T> root) {
        if (root != null) {
            System.out.println(root.getData() + " ");
            preorder(root.getLeft());
            preorder(root.getRight());
        }
    }

    public void postorder() {
        postorder(root);
    }

    public void postorder(Node<T> root) {
        if (root != null) {
            postorder(root.getLeft());
            postorder(root.getRight());
            System.out.println(getData() + " ");
        }
    }
}


    public class BST2
    {
        public void main(String[] args){
            Scanner scan = new Scanner(System.in);
            BST bst = new BST();
            int next = scan.nextInt();
            System.out.println("Binary Search Tree Testing Initiated: ");
            char rootit;

            do{
                switch (next)
                {

                    default :
                        System.out.println("Null");
                        break;
                }
                System.out.print("\nPost order : ");
                bst.postorder();
                System.out.print("\nPre order : ");
                bst.preorder();
                System.out.print("\nIn order : ");
                bst.inorder();

                rootit = scan.next().charAt(0);
        } while (rootit == 'Y'|| rootit == 'y');
    }


    }
