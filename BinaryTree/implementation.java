package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;


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
class Pair{
    Node node;
    int level;
    Pair(Node node, int level){
        this.node = node;
        this.level = level;
    }
}


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
        // Tree Structure
        // 1
        // / \
        // 2 3
        // / \ / \
        // 4 5 6 7

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
        System.out.println();
        dfs(a);
        System.out.println();
        bfs(a);
        levelWisePrint(a);
        System.out.println();
        NthLevelElement(a,0,4);

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

    private static int maxInBinaryTree(Node root) {
        // Task: Find maximum value in the binary tree
        if (root == null) {
            return Integer.MIN_VALUE;
        }
        return Math.max(root.val, Math.max(maxInBinaryTree(root.left), maxInBinaryTree(root.right)));
    }

    private static int levels(Node root) { // Very important
        // Task: Compute height (number of levels) of the tree
        if (root == null) {
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
    
    private static void dfs(Node root) {
        // Task: Preorder traversal (root, left, right)
        if (root == null) {
            return;
        }
        System.out.print(root.val + " ");
        dfs(root.left);
        dfs(root.right);
    }

    private static void bfs(Node root) {
        // BFS traversal
        Queue<Node> q = new LinkedList<>();
        q.add(root);

        while (q.size() > 0) {
            Node front = q.remove();
            System.out.print(front.val + " ");
            if (front.left != null) {
                q.add(front.left);
            }
            if (front.right != null) {
                q.add(front.right);
            }
        }
        System.out.println();
    }

    private static void levelWisePrint(Node root){
        Queue<Pair> q = new LinkedList<>();

        int currentLevel = 0;
        q.add(new Pair(root, 0));

        while(q.size() > 0){
            Pair front = q.remove();
            Node node = front.node;
            int level = front.level;

            if(level != currentLevel){
                currentLevel++;
                System.out.println();
            }
            System.out.print(node.val+" ");
            if(node.left != null){
                q.add(new Pair(node.left, level+1));
            }
            if(node.right != null){
                q.add(new Pair(node.right, level+1));
            }
        }
        System.out.println();
    }
    private static void NthLevelElement(Node root, int level, int k){
        if(root == null){
            return;
        }
        if(level == k){
            System.out.print(root.val +" ");
        }
        NthLevelElement(root.left, level+1, k);
        NthLevelElement(root.right, level+1, k);
    }
}