package com.automation.bootcamp_submission;

class BinarySearchTree {
    int key;
    BinarySearchTree left, right;

    public BinarySearchTree(int item) {
        key = item;
        left = right = null;
    }
    private BinarySearchTree root;

    public BinarySearchTree() {
        root = null;
    }

    // Method to insert a key into the BST
    public void insert(int key) {
        root = insertRec(root, key);
    }

    private BinarySearchTree insertRec(BinarySearchTree root, int key) {
        if (root == null) {
            root = new BinarySearchTree(key);
            return root;
        }

        if (key < root.key) {
            root.left = insertRec(root.left, key);
        } else if (key > root.key) {
            root.right = insertRec(root.right, key);
        }

        return root;
    }

    // Method to search for a key in the BST
    public boolean search(int key) {
        return searchRec(root, key);
    }

    private boolean searchRec(BinarySearchTree root, int key) {
        if (root == null || root.key == key) {
            return root != null;
        }

        if (key < root.key) {
            return searchRec(root.left, key);
        } else {
            return searchRec(root.right, key);
        }
    }

    // Method to perform in-order traversal of the BST
    public void inOrderTraversal() {
        inOrderTraversalRec(root);
    }

    private void inOrderTraversalRec(BinarySearchTree root) {
        if (root != null) {
            inOrderTraversalRec(root.left);
            System.out.print(root.key + " ");
            inOrderTraversalRec(root.right);
        }
    }

    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();

        // Inserting nodes
        bst.insert(50);
        bst.insert(30);
        bst.insert(20);
        bst.insert(40);
        bst.insert(70);
        bst.insert(60);
        bst.insert(80);

        // In-order traversal
        System.out.println("In-order traversal:");
        bst.inOrderTraversal();

        // Searching for keys
        int keyToSearch = 40;
        System.out.println("\nSearch for key " + keyToSearch + ": " + bst.search(keyToSearch));

        keyToSearch = 90;
        System.out.println("Search for key " + keyToSearch + ": " + bst.search(keyToSearch));
    }
}
