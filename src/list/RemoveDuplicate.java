package list;

//Java program to remove duplicates from a sorted linked list 
class RemoveDuplicate 
{ 
	Node head;

	void removeDuplicates() 
	{ 
		/*Another reference to head*/
		Node curr = head; 

		/* Traverse list till the last node */
		while (curr != null) { 
			Node temp = curr; 
			/*Compare current node with the next node and 
			keep on deleting them until it matches the current 
			node data */
			while(temp!=null && temp.data==curr.data) { 
				temp = temp.next;
			} 
			/*Set current node next to the next different 
			element denoted by temp*/
			curr.next = temp; 
			curr = curr.next; 
		} 
	} 
					
	/* Utility functions */

	/* Inserts a new Node at front of the list. */
	public void push(int new_data) 
	{ 
		Node new_node = new Node(new_data); 

		new_node.next = head; 

		head = new_node; 
	} 

	/* Function to print linked list */
	void printList() 
	{ 
		Node temp = head; 
		while (temp != null) 
		{ 
			System.out.print(temp.data+" "); 
			temp = temp.next; 
		} 
		System.out.println(); 
	} 

	public static void main(String[] args)
	{ 
		RemoveDuplicate llist = new RemoveDuplicate(); 
		llist.push(20); 
		llist.push(13); 
		llist.push(13); 
		llist.push(11); 
		llist.push(11); 
		llist.push(11); 
		
		System.out.println("List before removal of duplicates"); 
		llist.printList(); 
		
		llist.removeDuplicates(); 
		
		System.out.println("List after removal of elements"); 
		llist.printList(); 
	} 
} 

