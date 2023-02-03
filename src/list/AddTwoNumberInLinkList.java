package list;

public class AddTwoNumberInLinkList {

    private static Node head;

    public static void main(String[] args) {
        AddTwoNumberInLinkList list = new AddTwoNumberInLinkList();
        Node head1 = new Node(5);
        list.addToTheLast(head1);
        list.addToTheLast(new Node(6));
        list.addToTheLast(new Node(7));
        list.addToTheLast(new Node(1));
        list.addToTheLast(new Node(2));
        System.out.print("Number 1:  ");
        list.printList(head1);
        head = null;

        Node head2 = new Node(6);
        list.addToTheLast(head2);
        list.addToTheLast(new Node(3));
        list.addToTheLast(new Node(5));
        list.addToTheLast(new Node(9));
        System.out.print("Number 2:  ");
        list.printList(head2);

        // Reversing first linkedList
        head1 = reverseLinkedList(head1);

        //Reversing second linkedList
        head2 = reverseLinkedList(head2);

        Node result = list.findSumOfNumbers(head1, head2);
        result = reverseLinkedList(result);
        System.out.print("Sum:  ");
        list.printList(result);
    }

    private Node findSumOfNumbers(Node l1, Node l2) {
        int carry = 0;
        Node newHead = null;
        Node tempNodeForIteration = null;
        int sum;

        int firstIterator = 0;
        while (l1 != null || l2 != null) {
            firstIterator++;
            sum = carry;
            if (l1 != null) {
                sum = sum + l1.data;
                l1 = l1.next;
            }

            if (l2 != null) {
                sum = sum + l2.data;
                l2 = l2.next;
            }

            carry = sum / 10;
            sum = sum % 10;

            // Check if it first node for the result
            if (firstIterator == 1) {
                tempNodeForIteration = new Node(sum);
                newHead = tempNodeForIteration;
            } else {
                tempNodeForIteration.next = new Node(sum);
                tempNodeForIteration = tempNodeForIteration.next;
            }
        }
        if (carry != 0) {
            tempNodeForIteration.next = new Node(carry);
        }
        return newHead;
    }

/*
    public static Node reverseLinkedList(Node node) {
        if (node == null || node.next == null) {
            return node;
        }

        Node remaining = reverseLinkedList(node.next);
        node.next.next = node;
        node.next = null;
        return remaining;
    }
*/

    public static Node reverseLinkedList(Node node) {
        Node cur = node, next, pre = null;
        while (cur != null) {
            next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;

        }
        return pre;
    }

    private void printList(Node node) {
        Node temp = node;
        while (temp != null) {
            System.out.format("%d ", temp.data);
            temp = temp.next;
        }
        System.out.println();
    }

    public void addToTheLast(Node node) {

        if (head == null) {
            head = node;
        } else {
            Node temp = head;
            while (temp.next != null)
                temp = temp.next;
            temp.next = node;
        }
    }
}
