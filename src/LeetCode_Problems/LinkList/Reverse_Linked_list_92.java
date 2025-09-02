package LeetCode_Problems.LinkList;

public class Reverse_Linked_list_92 {
    public static void main(String[] args) {

    }


//    Definition for singly-linked list.
      public class ListNode {
         int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }


    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(left == right){
            return head;
        }

        ListNode current = head;
        ListNode prev = null;

// Skip the first left - 1 node
        for(int i = 0; current != null && i<left -1; i++){
            prev = current;
            current = current.next;
        }

        ListNode last = prev;
        ListNode newEnd = current;

        // reverse between left and right
        ListNode next = current.next;
        for(int i = 0; current != null && i< right - left + 1; i++){
            current.next = prev;
            prev = current;
            current = next;
            if(next != null){
                next = next.next;
            }
        }
        if(last != null){
            last.next = prev;
        }else{
            head = prev;
        }
        newEnd.next = current;
        return head;
    }
}
