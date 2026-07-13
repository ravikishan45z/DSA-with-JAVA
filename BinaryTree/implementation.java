package BinaryTree;

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
        display(a);
        System.out.println(); // new line
        System.out.println(size(a)); // size of binary tree
        System.out.println(sum(a)); // sum of all node values
        System.out.println(Product(a)); // product of all node values
        System.out.println(maxInBinaryTree(a)); //Maximum in the binary Tree.
    }

    private static void display(Node root) {
        // Preorder traversal: root -> left -> right
        if (root == null) {
            return;
        }
        System.out.print(root.val + " ");
        display(root.left);
        display(root.right);
    }
    private static int size(Node root) {
        // Count the total number of nodes in the tree
        return (root == null) ? 0 : 1 + size(root.left) + size(root.right);
    }

    private static int sum(Node root) {
        // Add the values of all nodes in the tree
        if (root == null) {
            return 0;
        }
        return root.val + sum(root.left) + sum(root.right);
    }

    private static int Product(Node root) {
        // Multiply the values of all nodes in the tree
        if (root == null) {
            return 1;
        }
        return root.val * Product(root.left) * Product(root.right);
    }

    private static int maxInBinaryTree(Node root){
        if(root == null){
            return Integer.MIN_VALUE;
        }
        return Math.max(root.val, Math.max(maxInBinaryTree(root.left), maxInBinaryTree(root.right)));
    }
}