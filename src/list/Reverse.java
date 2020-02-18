package list;

public class Reverse {


    static Node head;

    /* ITERATION */
 	Node reverseByIterartion(Node head)
 	{
 		Node prev = null;
 		Node current = head;
 		Node next = null;
 		while (current != null) {
 			next = current.next;
 			current.next = prev;
 			prev = current;
 			current = next;
 		}
 		head = prev;
 		return head;
 	}

    /* RECURSION */

    Node reverse(Node head){
        if (head == null || head.next == null)
            return head;

        /* reverse the rest list and put the first element at the end */
        Node rest = reverse(head.next);
        head.next.next = head;

        /* tricky step -- see the diagram */
        head.next = null;

        /* fix the head pointer */
        return rest;
    }

    // prints content of double linked list
    void printList(Node node)
    {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }

    // A simple and tail recursive function to reverse a linked list.  prev is passed as NULL initially.
    Node reverseUtil(Node curr, Node prev)
    {

        /* If last node mark it head*/
        if (curr.next == null) {
            head = curr;

            /* Update next to prev node */
            curr.next = prev;

            return head;
        }

        /* Save curr->next node for recursive call */
        Node next1 = curr.next;

        /* and update next ..*/
        curr.next = prev;

        reverseUtil(next1, curr);
        return head;
    }

    public static void main(String[] args)
    {
        Reverse list = new Reverse();
        list.head = new Node(85);
        list.head.next = new Node(15);
        list.head.next.next = new Node(4);
        list.head.next.next.next = new Node(20);

        System.out.println("Given Linked list");
        list.printList(head);
        head = list.reverse(head);
        System.out.println("");
        System.out.println("Reversed linked list ");
        list.printList(head);
    }
}
