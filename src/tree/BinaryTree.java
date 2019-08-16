package tree;

//Java program to convert a tree into its sum tree

class BinaryTree 
{ 
	Node root; 

	int toSumTree(Node curr) {
		
		  if (curr == null) return 0;
		  
		  int old_val = curr.data;
		  // Output -> 8 4 -4 16 7 12 5 here root value is replaced with sum of child nodes.
		  // Output -> 8 2 -4 30 7 18 5 here root value is added with sum of child nodes & replaced by adding "old_val".
		  int leftData = toSumTree(curr.left);
		  if(curr.left != null) leftData = curr.left.data;
		  
		  int rightData = toSumTree(curr.right);
		  if(curr.right != null) rightData = curr.right.data;

		  if(leftData != 0 && rightData != 0) 
			  return  curr.data = leftData + rightData ;
		  else 
			  return curr.data ;
		  
		  // Output -> 0 4 0 20 0 12 0
//		  curr.data = toSumTree(curr.left) + toSumTree(curr.right);		
//		  return curr.data+old_val;
		 
		
		/*
		 * int leftData = 0,rightData = 0;
		 * if(curr == null) return;
		 * if(curr.left != null) leftData = curr.left.data;
		 * if(curr.right != null) rightData = curr.right.data;
		 * if(leftData != 0 && rightData != 0) curr.data = leftData + rightData;
		 * toSumTree(curr.left); 
		 * toSumTree(curr.right);
		 */
		
	}

	// A utility function to print inorder traversal of a Binary Tree 
	void printInorder(Node node) 
	{ 
		if (node == null) 
			return; 
		printInorder(node.left); 
		System.out.print(node.data + " "); 
		printInorder(node.right); 
	} 

	/* Driver function to test above functions */
	public static void main(String args[]) 
	{ 
		BinaryTree tree = new BinaryTree(); 

		/* Constructing tree given in the above figure */
		tree.root = new Node(10); 
		tree.root.left = new Node(-2); 
		tree.root.right = new Node(6); 
		tree.root.left.left = new Node(8); 
		tree.root.left.right = new Node(-4); 
		tree.root.right.left = new Node(7); 
		tree.root.right.right = new Node(5); 

		System.out.println("Inorder Traversal of the actual tree is:");
		tree.printInorder(tree.root);
		
		tree.toSumTree(tree.root); 

		System.out.println("\nInorder Traversal of the resultant tree is:"); 
		tree.printInorder(tree.root); 
	} 
} 