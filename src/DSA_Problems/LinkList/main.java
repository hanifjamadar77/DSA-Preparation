package DSA_Problems.LinkList;

public class main {
    public static void main(String[] args) {
        LL ll = new LL();
        ll.insertFirst(4);
        ll.insertFirst(5);
        ll.insertFirst(7);
        ll.insertFirst(10);

        ll.insertLast(11);

        ll.insert(20,2);

        ll.display();
    }
}
