package tree;

import static java.lang.System.*;

public class LevelOrderTraversing1 {
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
        levelWisePrint(root);
    }

    private static void levelWisePrint(Node root) {
        HeightOfTree height = new HeightOfTree();
        int h = height.maxDepth(root);
        for (int i = 1; i <= h; i++) {
            printLevel(root, i);
        }
    }

    private static void printLevel(Node root, int i) {
        if (root == null) return;
        if (i == 1)
            out.print(root.data + " ");
        else if (i > 1) {
            printLevel(root.left, i - 1);
            printLevel(root.right, i - 1);
        }
    }
}
