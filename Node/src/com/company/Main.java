package com.company;

public class Main {

    //Java program to construct a tree using inorder and preorder traversal
/* A binary tree node has data, pointer to left child
and a pointer to right child */
    class Node {
        char data;
        Node left, right;

        Node(char item) {
            data = item;
            left = right = null;
        }
    }

    class BinaryTree {
        Node root;
        private int preIndex = 0;


        Node buildTree(char in[], char pre[], int inStrt, int inEnd) {
            if (inStrt > inEnd)
                return null;

            Node tNode = new Node(pre[preIndex++]);

            if (inStrt == inEnd)
                return tNode;

            int inIndex = search(in, inStrt, inEnd, tNode.data);

            tNode.left = buildTree(in, pre, inStrt, inIndex - 1);
            tNode.right = buildTree(in, pre, inIndex + 1, inEnd);
            return tNode;
        }

        int search(char arr[], int strt, int end, char value) {
            int i;
            for (i = strt; i <= end; i++) {
                if (arr[i] == value)
                    return i;
            }
            return i;
        }

        /* This funtcion is here just to test buildTree() */
        void printInorder(Node node) {
            if (node == null)
                return;
     /* first recur on left child */
            printInorder(node.left);
     /* then print the data of node */
            System.out.print(node.data + " ");
     /* now recur on right child */
            printInorder(node.right);
        }
    }
}
