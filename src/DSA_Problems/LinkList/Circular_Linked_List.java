package DSA_Problems.LinkList;


public class Circular_Linked_List {
    private Node head;
    private Node tail;

    class Node{
        int val;
        Node next;
        Node prev;

        Node(int val){
            this.val = val;
        }
    }

    public void insertFirst(int val){
        Node node = new Node(val);
        if(head == null){
            head = node;
            tail = node;
        }
        tail.next = node;
        node.next = head;
        tail= node;
    }

    public void delete(int val){
        Node node = head;
        if(node == null){
            return;
        }
        if(node.val==val){
            head = head.next;
            tail.next = head;
            return;
        }

        do{
            Node temp = node.next;
            if(temp.val==val){
                node.next = temp.next;
                break;
            }
            node = node.next;
        }while(node != head);
    }

    public void display(){
        Node temp = head;
        if(head != null){
            do{
                System.out.print(temp.val + "->");
                temp = temp.next;
            }while (temp != head);
        }
        System.out.println("HEAD");
    }
}
