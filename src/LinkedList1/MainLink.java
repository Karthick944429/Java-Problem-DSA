package LinkedList1;

public class MainLink {
    public static void main(String[] args) {
        ImplementLinkedList ll= new ImplementLinkedList();
        ll.addLast(10);
        ll.addLast(20);
        ll.addLast(30);
        ll.addLast(40);
        ll.addFirst(1);
        ll.display();
        System.out.println("\nat Index :"+ll.getNodeAtIndex(3));
        ll.removeLast();
        ll.removeAt(0);
        ll.display();
    }
}
