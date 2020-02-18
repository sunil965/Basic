package list;

public class ReverseByK {

	Node head;

	public static void main(String[] args) {
		ReverseByK list = new ReverseByK();
		for (int i = 10; i > 0; i--) {
			list.push(i);
		}

		System.out.println("Given Linked List");
		list.printList();

		list.head = list.reverse(list.head, 3);

		System.out.println("Reversed list");
		list.printList();
	}

	private Node reverse(Node node, int k) {
		Node cur = node;
		Node pre = null;
		Node next = null;
		int count = 0;

		if (node == null) { return node;}

		while (cur != null && count < k) {
			next = cur.next;
			cur.next = pre;
			pre = cur;
			cur = next;
			count++;
		}
		
		// Reverse a Linked List with given size k		   --> 3 2 1 4 5 6 7 8 9 10 .

//		if (node != null) { node.next = cur; }

		// Reverse a Linked List in groups of given size k --> 3 2 1 6 5 4 9 8 7 10 .
		
		  if (next != null) { node.next = reverse(next, k); }
		 
		return pre;
	}

	public void push(int new_data) {
		Node new_node = new Node(new_data);
		new_node.next = head;
		head = new_node;
	}

	/* Function to print linked list */
	void printList() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();
	}

}
