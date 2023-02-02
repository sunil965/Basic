package list;

public class Merge2SortedList {

    public static void main(String[] args) {
        Node one = new Node(1);
        Node three = new Node(3);
        Node five = new Node(5);
        Node six = new Node(6);
        Node nine = new Node(9);
        one.next = three;
        three.next = five;
        five.next = six;
        six.next = nine;

        Node two = new Node(2);
        Node four = new Node(4);
        Node seven = new Node(7);
        Node eight = new Node(8);
        Node ten = new Node(10);
        two.next = four;
        four.next = seven;
        seven.next = eight;
        eight.next = ten;

        System.out.println("List One: ");
        printList(one);
        System.out.println("List Two: ");
        printList(two);

        Node output = mergeLists(one, two);
        System.out.println("Merged List: ");
        printList(output);
    }

    private static Node mergeLists(Node head1, Node head2) {
        Node sort, newHead;
        Node p = head1;
        Node q = head2;

        if (p == null) return q;
        if (q == null) return p;
        // First find the starting node of merged list.
        if (p.data < q.data) {
            sort = p;
            p = sort.next;
        } else {
            sort = q;
            q = sort.next;
        }
        newHead = sort;
        // Second proceed with merging list items.
        while (p != null && q != null) {
            if (p.data < q.data) {
                sort.next = p;
                sort = p;
                p = sort.next;
            } else {
                sort.next = q;
                sort = q;
                q = sort.next;
            }
        }
        if (p == null) sort.next = q;
        if (q == null) sort.next = p;
        return newHead;
    }

    private static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println();
    }
}
