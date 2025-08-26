package DSA_Problems.LinkList;

public class LL {
    private Node head;
    private Node tail;
    private int size;
    private class Node{
        private int value;
        private Node next;

        public Node(int value){
            this.value = value;
        }

        public Node(int value, Node next){
            this.value = value;
            this.next = next;
        }
    }

    public void insert(int value){
        Node node = new Node(value);
        if(head == null){
           head = node;
           tail = node;
        }else {
            node.next = head;
            head = node;
        }
        size++;
    }

    public void display(){
        Node temp = head;
        while(temp!= null){
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }
}
