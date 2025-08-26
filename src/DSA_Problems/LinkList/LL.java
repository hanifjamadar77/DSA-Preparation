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

    public void insertFirst(int value){
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

    public void insertLast(int value){
        Node node = new Node(value);
        if(head == null){
            head = node;
            tail = node;
        } else{
          tail.next = node;
          tail = node;
        }
        size++;
    }

    public void insert(int value, int index){
        if(index == 0){
            insertFirst(value);
            return;
        }
        if(index == size){
            insertLast(value);
            return;
        }

        Node temp = head;
        for(int i = 1; i< index ; i++){
            temp = temp.next;
        }
        Node node = new Node(value, temp.next);
        temp.next = node;
        size++;
    }
}
