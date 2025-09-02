package LeetCode_Problems.LinkList;

public class Odd_even_LinkedList_328 {
    public static void main(String[] args) {

    }

    //      Definition for singly-linked list.
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode oddEvenList(ListNode head) {
        if(head == null){
            return head;
        }

        ListNode odd = head;
        ListNode even = head.next;
        ListNode evenHead = even;

        while(even != null && even.next != null){
            odd.next = even.next;
            odd = odd.next;
            even.next = odd.next;
            even = even.next;
        }
        // Append the even list at the end of odd list
        odd.next = evenHead;
        return head;
    }
}
