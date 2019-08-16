package list;

class MiddleOfLinkedList 
{ 
	Node head; 
	
	class Node 
	{ 
		int data; 
		Node next; 
		Node(int d) 
		{ 
			data = d; 
			next = null; 
		} 
	} 

	/* Function to print middle of linked list */
	int printMiddle() 
	{ 
		Node slow_ptr = head; 
		Node fast_ptr = head; 
		if (head == null)
			return -1;
		else
		{ 
			while (fast_ptr != null && fast_ptr.next != null) 
			{ 
				fast_ptr = fast_ptr.next.next; 
				slow_ptr = slow_ptr.next; 
			} 
			return slow_ptr.data;
		} 
	} 

	/* Inserts a new Node at front of the list. */
	public void push(int new_data) 
	{ 
		/* 1 & 2: Allocate the Node & 
				Put in the data*/
		Node new_node = new Node(new_data); 

		/* 3. Make next of new Node as head */
		new_node.next = head; 

		/* 4. Move the head to point to new Node */
		head = new_node; 
	} 

	public void printList() 
	{ 
		Node tnode = head; 
		while (tnode != null) 
		{ 
			System.out.print(tnode.data+"->"); 
			tnode = tnode.next; 
		} 
		System.out.println("NULL"); 
	} 

	public static void main(String [] args) 
	{ 
		MiddleOfLinkedList llist = new MiddleOfLinkedList(); 
		for (int i=6; i>0; --i)	{ 
			llist.push(i); 
		} 
		llist.printList(); 
		System.out.println("The middle element is "+ llist.printMiddle());
	} 
} 

