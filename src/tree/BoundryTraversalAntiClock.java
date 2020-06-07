package tree;

import static java.lang.System.out;

/**
 * Print in anti-clock direction.
 **/
public class BoundryTraversalAntiClock {

    public static void main(String[] args) {
        Node root;
        root = new Node(20);
        root.left = new Node(8);
        root.left.left = new Node(4);
        root.left.right = new Node(12);
        root.left.right.left = new Node(10);
        root.left.right.right = new Node(14);
        root.right = new Node(22);
        root.right.right = new Node(25);
        printBoundary(root);
    }

    // A simple function to print leaf nodes of a binary tree
    static void printLeaves(Node node)
    {
        if (node == null)
            return;

        printLeaves(node.left);
        if (node.left == null && node.right == null)
            out.print(node.data + " ");
        printLeaves(node.right);
    }

    // A function to print all left boundary nodes, except a leaf node. Print the nodes in TOP DOWN manner.
    static void printBoundaryLeft(Node node)
    {
        if (node == null)
            return;

        if (node.left != null) {
            // to ensure top down order, print the node before calling itself for left subtree
            out.print(node.data + " ");
            printBoundaryLeft(node.left);
        }
        else if (node.right != null) {
            out.print(node.data + " ");
            printBoundaryLeft(node.right);
        }

    }

    // A function to print all right boundary nodes, except a leaf node. Print the nodes in BOTTOM UP manner
    static void printBoundaryRight(Node node)
    {
        if (node == null)
            return;

        if (node.right != null) {
            out.print(node.data + " ");
            printBoundaryRight(node.right);
        }
        else if (node.left != null) {
            out.print(node.data + " ");
            printBoundaryRight(node.left);
        }
    }

    // A function to do boundary traversal of a given binary tree
    static void printBoundary(Node node)
    {
        if (node == null)
            return;

        out.print(node.data + " ");

        // Print the left boundary in top-down manner.
        printBoundaryLeft(node.left);

        // Print all leaf nodes
        printLeaves(node.left);
        printLeaves(node.right);

        // Print the right boundary in bottom-up manner
        printBoundaryRight(node.right);
    }
}
