package DSA_Problems.LinkList;

public class main {
    public static void main(String[] args) {
        Singly_Linked_List ll = new Singly_Linked_List();
//        ll.insertFirst(4);
//        ll.insertFirst(5);
//        ll.insertFirst(7);
//        ll.insertFirst(10);
//
//        ll.insertLast(11);
//
//        ll.insert(20,2);
//
//        ll.deleteFirst();
//        ll.deleteLast();
//        ll.delete(1);
//
//        ll.display();

//        Doubly_Linked_List dll = new Doubly_Linked_List();
//
//        dll.insertFirst(3);
//        dll.insertFirst(4);
//        dll.insertFirst(2);
//        dll.insertFirst(1);
//        dll.insertFirst(7);
//
//        dll.insertLast(10);
//        dll.insertLast(8);
//
//        dll.insert(11,2);
//
//        dll.display();


        Circular_Linked_List cll = new Circular_Linked_List();

        cll.insertFirst(3);
        cll.insertFirst(5);
        cll.insertFirst(10);
        cll.insertFirst(11);

        cll.delete(5);

        cll.display();

    }
}
