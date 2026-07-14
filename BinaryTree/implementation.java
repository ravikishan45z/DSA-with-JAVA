package BinaryTree;


// Demo: Binary tree operations (size, sum, product, traversals, height)
// Contains helper methods and traversal examples used in `main`.
// Tasks:
// - Display tree (preorder)
// - Compute size (node count)
// - Compute sum of node values
// - Compute product of node values
// - Find maximum node value
// - Compute tree height (levels)
// - Show traversals: preorder, inorder, postorder
class Node {
    int val; // Value stored in the current node
    Node left; // Reference to the left child
    Node right; // Reference to the right child

    Node(int val) {
        this.val = val;
    }
}

public class implementation {
    public static void main(String[] args) {
        //  Tree Structure
        //      1
        //    /   \  
        //   2     3
        //  / \   / \
        // 4  5   6  7

        // Create nodes for the binary tree
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(6);
        Node g = new Node(7);

        // Link nodes to form the tree structure
        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        c.left = f;
        c.right = g;

        // Call methods to display, count, sum, and multiply values in the tree
        display(a); // Preorder display: root -> left -> right
        System.out.println(); // new line for readability
        System.out.println(size(a)); // prints size (number of nodes) of the binary tree
        System.out.println(sum(a)); // prints sum of all node values
        System.out.println(Product(a)); // prints product of all node values
        System.out.println(maxInBinaryTree(a)); // prints maximum value in the binary tree
        System.out.println(levels(a)); // prints number of levels (height) of the tree

        preOrder(a);
        System.out.println();
        inOrder(a);
        System.out.println();
        postOrder(a);
    }

    private static void display(Node root) {
        // Task: Display tree (preorder traversal) — root -> left -> right
        if (root == null) {
            return;
        }
        System.out.print(root.val + " ");
        display(root.left);
        display(root.right);
    }
    private static int size(Node root) {
        // Task: Compute size — count total number of nodes
        return (root == null) ? 0 : 1 + size(root.left) + size(root.right);
    }

    private static int sum(Node root) {
        // Task: Compute sum — add values of all nodes
        if (root == null) {
            return 0;
        }
        return root.val + sum(root.left) + sum(root.right);
    }

    private static int Product(Node root) {
        // Task: Compute product — multiply values of all nodes
        if (root == null) {
            return 1;
        }
        return root.val * Product(root.left) * Product(root.right);
    }

    private static int maxInBinaryTree(Node root){
        // Task: Find maximum value in the binary tree
        if(root == null){
            return Integer.MIN_VALUE;
        }
        return Math.max(root.val, Math.max(maxInBinaryTree(root.left), maxInBinaryTree(root.right)));
    }

    private static int levels(Node root) { // Very important
        // Task: Compute height (number of levels) of the tree
        if(root == null){
            return 0;
        }
        return 1 + Math.max(levels(root.left), levels(root.right));
    }

    private static void preOrder(Node root) {
        // Task: Preorder traversal (root, left, right)
        if (root == null) {
            return;
        }
        System.out.print(root.val + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    private static void inOrder(Node root) {
        // Task: Inorder traversal (left, root, right)
        if (root == null) {
            return;
        }
        inOrder(root.left);
        System.out.print(root.val + " ");
        inOrder(root.right);

    }

    private static void postOrder(Node root) {
        // Task: Postorder traversal (left, right, root)
        if (root == null) {
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.val + " ");
    }
}