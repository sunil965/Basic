package tree;

import java.util.LinkedList;
import java.util.Queue;

import static java.lang.System.out;

public class LevelOrderTraversing2 {
    public static void main(String[] args) {
        Node root;
        root = new Node(20);
        root.left = new Node(8);
        root.left.left = new Node(4);
        root.left.right = new Node(12);
        root.left.right.left = new Node(10);
        root.left.right.right = new Node(14);
        root.right = new Node(22);
        root.right.left = new Node(21);
        root.right.right = new Node(25);
        levelWisePrint(root);
    }

    private static void levelWisePrint(Node root) {
        Queue<Node> nodeQueue = new LinkedList<>();
        nodeQueue.add(root);

        while (!nodeQueue.isEmpty()) {
            Node currentNode = nodeQueue.poll();
            out.print(currentNode.data + " ");

            if (currentNode.left != null)
                nodeQueue.add(currentNode.left);
            if (currentNode.right != null)
                nodeQueue.add(currentNode.right);
        }
    }
}
