package LeetCode_Problems.LinkList;

public class Reorder_List_143 {
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

    public void reorderList(ListNode head) {
        if(head == null || head.next == null){
            return;
        }

        ListNode mid = findMiddle(head);
        ListNode firstHead = head;
        ListNode secondHead = reverseList(mid);

        while(firstHead != null && secondHead != null){
            ListNode temp = firstHead.next;
            firstHead.next = secondHead;
            firstHead = temp;

            temp = secondHead.next;
            secondHead.next = firstHead;
            secondHead = temp;
        }
        // next of tail be null
        if(firstHead != null){
            firstHead.next = null;
        }
    }

    public ListNode findMiddle(ListNode head){
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }


    public ListNode reverseList(ListNode head){
        ListNode prev = null;
        ListNode present = head;
        ListNode next = present.next;

        if(head == null){
            return head;
        }

        while(present != null){
            present.next = prev;
            prev = present;
            present = next;
            if(next != null){
                next = next.next;
            }
        }
        return prev;
    }
}
