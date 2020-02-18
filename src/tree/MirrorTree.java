package tree;

public class MirrorTree {
    Node root;
    public static void main(String[] args) {
        MirrorTree tree = new MirrorTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        System.out.println("\nMirror of binary tree is ");
        tree.mirrorTree();tree.printInorder();
    }

    private void printInorder() {
        printInorder(root);
    }
    void printInorder(Node node)
    {
        if (node == null)
            return;

        printInorder(node.left);

        System.out.print(node.data + " ");

        printInorder(node.right);
    }


    void mirrorTree() {
        root = mirror(root);
    }

    private Node mirror(Node node) {
        if (node == null)
            return node;

        Node left = mirror(node.left);
        Node right = mirror(node.right);

        node.left = right;
        node.right = left;
        return node;
    }
}