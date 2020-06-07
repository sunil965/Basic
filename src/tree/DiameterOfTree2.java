package tree;

import static java.lang.System.out;

// O(n)

public class DiameterOfTree2 {
    public static void main(String[] args) {
        Node root;
        root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.left.left.left = new Node(6);
        root.left.right.right = new Node(7);
        root.left.right.right.right = new Node(8);
        Height height = new Height();
        out.println("Diameter of tree is : " + diameter(root, height));
    }

    private static int diameter(Node root, Height height) {
        Height leftHeight = new Height();
        Height rightHeight = new Height();
        if (root == null) {
            height.h = 0;
            return 0;
        }
        int leftDiameter = diameter(root.left, leftHeight);
        int rightDiameter = diameter(root.right, rightHeight);

        height.h = Math.max(leftHeight.h, rightHeight.h) + 1;

        return Math.max((leftHeight.h + rightHeight.h + 1), Math.max(leftDiameter, rightDiameter));
    }
}

class Height {
    int h;
}
