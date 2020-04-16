package tree;

import static java.lang.System.*;

public class DiameterOfTree1 {
    public static void main(String[] args) {
        Node tree;
        tree = new Node(1);
        tree.left = new Node(2);
        tree.right = new Node(3);
        tree.left.left = new Node(4);
        tree.left.right = new Node(5);
        tree.left.left.left = new Node(6);
        tree.left.right.right = new Node(7);
        tree.left.right.right.right = new Node(8);

        out.println("Diameter of tree is : " +  diameter(tree));
    }

    private static int diameter(Node root) {
        if (root == null)
            return 0;
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        int leftDiameter = diameter(root.left);
        int rightDiameter = diameter(root.right);

        return Math.max((leftHeight+rightHeight+1), Math.max(leftDiameter,rightDiameter));
    }

    static int height(Node node)
    {
        if (node == null)
            return 0;
        return (1 + Math.max(height(node.left), height(node.right)));
    }
}
