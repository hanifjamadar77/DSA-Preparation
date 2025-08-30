package LeetCode_Problems.LinkList;

public class Linklist_Cycle_II_142 {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next;
        }
    }

    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        if(slow == fast) {
            ListNode start = head;
            while (start != slow) {
                start = start.next;
                slow = slow.next;
            }
            return start;
        }
        return null;
    }
}
