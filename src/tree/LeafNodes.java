package tree;

import java.util.Stack;

public class LeafNodes {
public static void main(String ... args){
        Node root;
        root = new Node(20);
        root.left = new Node(8);
        root.left.left = new Node(4);
        root.left.right = new Node(12);
        root.left.right.left = new Node(10);
        root.left.right.right = new Node(14);
        root.right = new Node(22);
        root.right.right = new Node(25);
        leafNode(root);
}

    private static void leafNode(Node root) {
        Stack<Node> nodeStack1 = new Stack<Node>();
        Stack<Node> nodeStack2 = new Stack<Node>();
        nodeStack1.push(root);
        while (!nodeStack1.isEmpty()){
            Node node = nodeStack1.peek();
            nodeStack1.pop();
            if (node.left !=null)nodeStack1.push(node.left);
            if (node.right!=null)nodeStack1.push(node.right);
            else if(node.left ==null && node.right==null)
                nodeStack2.push(node);
        }
        while (!nodeStack2.isEmpty()){
            System.out.print(nodeStack2.peek().data+" ");
            nodeStack2.pop();
        }
    }
}
