package list;

public class CheckLoopInList {

    public static void main(String[] args) {
        Node one = new Node(1);
        Node two = new Node(2);
        one.next = two;
        Node three = new Node(3);
        two.next = three;
        Node four = new Node(4);
        three.next = four;
        Node five = new Node(5);
        four.next = five;
        Node six = new Node(6);
        five.next = six;
        Node seven = new Node(7);
        six.next = seven;
        Node eight = new Node(8);
        seven.next = eight;
        Node nine = new Node(9);
        eight.next = nine;
        Node ten = new Node(10);
        nine.next = ten;
        ten.next = three;

        Node junction = checkLoopPointInList(one);
        if (junction == null)
            System.out.println("List is not cyclic.");
        else
            System.out.println("Two pointers meet each other at : " + junction.data);

        assert junction != null;
        System.out.println("Node where list form a cycle : " + startOfLoop(junction, one).data);

        /*
            Before removing loop list would become : 1->2->3->4->5->6->7->8->9->10->3->4->5->6->7->8->9->10->
             and will continue in loop for ever.
            After removing loop list would become : 1->2->3->4->5->6->7->8->9->10->
        */
        removeLoop(junction, one);
        printList(one);
    }

    private static void removeLoop(Node junction, Node head) {
        Node temp = head;
        while (junction.next != temp.next) {
            junction = junction.next;
            temp = temp.next;
        }
        junction.next = null;
    }

    private static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
    }

    private static Node startOfLoop(Node P, Node head) {
        Node Q = head;
        while (P != Q) {
            P = P.next;
            Q = Q.next;
        }
        return P;
    }

    private static Node checkLoopPointInList(Node head) {
        Node P = head;
        Node Q = head;
        while (Q != null && Q.next != null) {
            P = P.next;
            Q = Q.next.next;
            if (P == Q)
                return P;
        }
        return null;
    }
}
