package tree;

import static java.lang.System.out;

public class HeightOfTree {

	public static void main(String[] args) {
		Node tree;
        tree = new Node(1);
        tree.left = new Node(2);
        tree.right = new Node(3);
        tree.left.left = new Node(4);
        tree.left.right = new Node(5);
		tree.left.right.left = new Node(6);
		tree.left.right.right = new Node(6);
		HeightOfTree height = new HeightOfTree();
        out.println("Height of tree is : " +  height.maxDepth(tree));
    }

	public int maxDepth(Node root) {

		if (root == null)
			return 0;
		else {
			int left = maxDepth(root.left);
			int right = maxDepth(root.right);
			if (left > right) {
				return left + 1;
			} else {
				return right + 1;
			}
//			return Math.max(left,right)+1;
		}
	} 

}
