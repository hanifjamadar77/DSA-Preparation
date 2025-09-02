package LeetCode_Problems.LinkList;

public class Remove_Node_FromLL_2487 {
    public static void main(String[] args) {

    }
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode removeNodes(ListNode head) {
        // Reverse the list from head
        head = reverseList(head);

        // Traverse the list and skip the node
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;
        ListNode current = head;

        int max = head.val;

        while(current != null){
            if(current.val < max){
                // skip the current node
                prev.next = current.next;
            }else{
                max = current.val;
                prev = current;
            }
            current = current.next;
        }
        return reverseList(dummy.next);
    }


    public ListNode reverseList(ListNode head){
        ListNode prev = null;

        while(head != null){
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }
}
