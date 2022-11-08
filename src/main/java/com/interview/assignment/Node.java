package com.interview.assignment;

import java.util.*;

public class Node {

    private Node left;
    private Node right;
    private int value;


    Node(Node left, Node right, int value) {

        this.left = left;
        this.right = right;
        this.value = value;
    }
    
    public static void main(String[] args) {

        /* Node tree example
                30 
            /       \ 
           10        90 
         /   \       /   
        7    12     50   
       / \  / \    /  \
      2  8 9  15  25  60           */
        //insert data into Node
        /*Node root = new Node(null, null, 30);

        System.out.println("*************** root.value: " + root.value);

        root.left = new Node(null, null, 10);
        root.right = new Node(null, null, 90);

        System.out.println("*************** root.left.value: " + root.left.value);
        System.out.println("*************** root.right.value: " + root.right.value);*/

        List<Integer> values = Arrays.asList(new Integer[] {30, 10, 90, 7, 12, 50, 2, 8, 9, 15, 25, 60});
        generateNodes(values);

    }

    private static void generateNodes(List<Integer> values) {

        //determine root node based on median value
        Set<Integer> tSet = new TreeSet<Integer>(values);

        for(int i : tSet) {

            System.out.println("*************** generateNodes: i: " + i);
        }
    }

    //pseudo-code for algorithm to find a particular node/value

    //start at root node
    //if target value is lt root's value, go left, otherwise go right
    //if target value == current node's value set temp value and break

    /*private static Node findNode(Node currentNode, int value) {

        if(root.value == value) {

            return root;
        }
        else {

            if(value < currentNode.value) {

                findNode(currentNode.left, value);
            }
            else if(value > currentNode.value) {

                findNode(currentNode.right, value);
            }
            else {

                return currentNode;
            }
        }
    }*/


}