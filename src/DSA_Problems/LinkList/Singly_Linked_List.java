package DSA_Problems.LinkList;

public class Singly_Linked_List {
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

    public int deleteFirst(){
        int value = head.value;

        head = head.next;

        if(head == null){
            tail = null;
        }
        size --;
        return value;
    }

    public Node get(int index){
        Node node = head;
        for(int i = 1; i< index ; i++){
            node = node.next;
        }
        return node;
    }

    public int deleteLast(){
        if(size <= 1){
            return deleteFirst();
        }

        Node secondLast = get(size - 1);
        int val = tail.value;
        tail = secondLast;
        tail.next = null;
        return val;
    }

    public int delete(int index){
        if(index == 0){
            return deleteFirst();
        }
        if(index == size - 1){
            return deleteLast();
        }

        Node prev = get(index -1);
        int val = prev.next.value;
        prev.next = prev.next.next;
        return val;
    }

}
