package DSA_Problems.LinkList;

public class main {
    public static void main(String[] args) {
        Singly_Linked_List ll = new Singly_Linked_List();
        ll.insertFirst(4);
        ll.insertFirst(5);
        ll.insertFirst(7);
        ll.insertFirst(10);

        ll.insertLast(11);

        ll.insert(20,2);

        ll.deleteFirst();
        ll.deleteLast();
        ll.delete(1);

        ll.display();
    }
}
