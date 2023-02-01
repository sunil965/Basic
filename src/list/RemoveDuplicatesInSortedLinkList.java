package list;

public class RemoveDuplicatesInSortedLinkList {

    public static void main(String[] args) {
        Node head = new Node(1);
        Node two = new Node(2);
        head.next = two;
        Node three = new Node(2);
        two.next = three;
        Node four = new Node(3);
        three.next = four;
        Node five = new Node(3);
        four.next = five;
        Node six = new Node(3);
        five.next = six;
        six.next = new Node(4);
        System.out.println("Initial List");
        printList(head);
        removeDuplicate(head);
        System.out.println("\nNew List");
        printList(head);
    }

    private static void removeDuplicate(Node head) {
        Node P = head;
        Node Q;
        while (P != null && P.next != null) {
            if (P.data == P.next.data) {
                Q = P.next.next;
                if (Q == null){
                    P.next = null;
                    break;
                }
                P.next = Q;
            }
            if (P.data != P.next.data) {
                P = P.next;
            }
        }
    }

    private static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
    }
}
