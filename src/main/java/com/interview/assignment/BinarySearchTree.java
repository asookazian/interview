package com.interview.assignment;

//https://www.softwaretestinghelp.com/binary-search-tree-in-java/#Creating_A_Binary_Search_Tree_BinarySearchTree


public class BinarySearchTree {
    
    public static void main(String[] args) {

        //create a BinarySearchTree object
        BinarySearchTree bst = new BinarySearchTree(); 
        /* BinarySearchTree tree example
                30 
            /       \ 
           10        90 
         /   \       /   
        7    12     50   
       / \  / \    /  \
      2  8 9  15  25  60           */
        //insert data into BinarySearchTree
        bst.insert(30); 
        bst.insert(10); 
        bst.insert(7); 
        bst.insert(12); 
        bst.insert(90); 
        bst.insert(50); 
        bst.insert(25); 
        bst.insert(60);
        bst.insert(2); 
        bst.insert(8);
        bst.insert(9);
        bst.insert(15);    
        //print the BinarySearchTree
        System.out.println("The BinarySearchTree Created with input data(Left-root-right):"); 
        bst.inorder(); 
        
        /*//delete leaf node  
        System.out.println("\nThe BinarySearchTree after Delete 12(leaf node):"); 
        bst.deleteKey(12); 
        bst.inorder(); 
        //delete the node with one child
        System.out.println("\nThe BinarySearchTree after Delete 90 (node with 1 child):"); 
        bst.deleteKey(90); 
        bst.inorder(); 
                 
        //delete node with two children  
        System.out.println("\nThe BinarySearchTree after Delete 45 (Node with two children):"); 
        bst.deleteKey(45); 
        bst.inorder(); */

        //search a key in the BinarySearchTree
        boolean ret_val = bst.search (50);
        System.out.println("\nKey 50 found in BinarySearchTree:" + ret_val );
        System.out.println("\n***********************************************************");

        ret_val = bst.search (12);
        System.out.println("\nKey 12 found in BinarySearchTree:" + ret_val );
        System.out.println("\n***********************************************************");

        ret_val = bst.search (10);
        System.out.println("\nKey 10 found in BinarySearchTree:" + ret_val );
        System.out.println("\n***********************************************************");

        ret_val = bst.search (9);
        System.out.println("\nKey 9 found in BinarySearchTree:" + ret_val );
        System.out.println("\n***********************************************************");

        ret_val = bst.search (25);
        System.out.println("\nKey 25 found in BinarySearchTree:" + ret_val );
        System.out.println("\n***********************************************************");

        ret_val = bst.search (999);
        System.out.println("\nKey 999 found in BinarySearchTree:" + ret_val );
        System.out.println("\n***********************************************************");

        /*int smallestVal = getSmallestValue(Node n);

        System.out.println("smallestVal [" + smallestVal + "]");

        int largestVal = getLargestValue(Node n);

        System.out.println("largestVal [" + largestVal + "]");*/
    }
/*
    //time complexity: 
    //space complexity: 
    public static int getSmallestValue(Node n) {

        //assuming that the smallest values are on the left side of the tree

        while(n.getLeft() != null) {

            n = n.getLeft();
        }

        int val = n.getValue();

        return val;
    }

    //time complexity: 
    //space complexity: 
    public static int getLargestValue(Node n) {

        //assuming that the largest values are on the right side of the tree

        while(n.getRight() != null) {

            n = n.getRight();
        }

        int val = n.getValue();

        return val;
    }
*/

    //node class that defines BinarySearchTree node
    class Node { 
        int key; 
        Node left, right; 
   
        public Node(int data){ 
            key = data; 
            left = right = null; 
        } 
    } 

    // BinarySearchTree root node 
    Node root; 
  
    // Constructor for BinarySearchTree =>initial empty tree
    BinarySearchTree(){ 
        root = null; 
    }
   
    // insert a node in BinarySearchTree 
    void insert(int key)  { 
        root = insert_Recursive(root, key); 
    } 
   
    //recursive insert function
    Node insert_Recursive(Node root, int key) { 
          //tree is empty
        if (root == null) { 
            root = new Node(key); 
            return root; 
        } 
        //traverse the tree
        if (key < root.key)     //insert in the left subtree
            root.left = insert_Recursive(root.left, key); 
        else if (key > root.key)    //insert in the right subtree
            root.right = insert_Recursive(root.right, key); 
          // return pointer
        return root; 
    } 
// method for inorder traversal of BinarySearchTree 
    void inorder() { 
        inorder_Recursive(root); 
    } 
   
    // recursively traverse the BinarySearchTree  
    void inorder_Recursive(Node root) { 
        if (root != null) { 
            inorder_Recursive(root.left); 
            System.out.print(root.key + " "); 
            inorder_Recursive(root.right); 
        } 
    } 
     
    boolean search(int key)  { 
        //root = search_Recursive(root, key); 
        Node n = search_Recursive(root, key); 
        //if (root!= null)
        if (n != null)
            return true;
        else
            return false;
    } 
   
    //recursive search function
    Node search_Recursive(Node root, int key)  { 

        // Base Cases: root is null or key is present at root 
        if (root==null || root.key==key) {

            if(root != null) {
                System.out.println("search_Recursive: root.key [" + root.key +"]");
            }
            System.out.println("search_Recursive: root is null or root.key == key for key [" + key +"]");
            return root; 
        }

        System.out.println("\nroot.key [" + root.key + "]");
        System.out.println("\nkey [" + key + "]");

        // val is greater than root's key 
        if (root.key > key)
            return search_Recursive(root.left, key); 
        // val is less than root's key 
        return search_Recursive(root.right, key); 
    } 
}