package LeetCode_Problems.LinkList;

public class Palindrome_linked_list_234 {
    public static void main(String[] args) {

    }

    //    Definition for singly-linked list.
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }


    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null) return true;

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode secondHalf = reverseList(slow);

        ListNode firstHalf = head;
        ListNode secondHalfCheck = secondHalf;

        while(secondHalfCheck != null){
            if(firstHalf.val != secondHalfCheck.val){
                return false;
            }
            firstHalf = firstHalf.next;
            secondHalfCheck = secondHalfCheck.next;
        }
        return true;
    }

    public ListNode reverseList(ListNode head) {
        if(head == null) return head;

        ListNode prev = null;
        ListNode curr = head;
        ListNode next = head.next;

        while(curr != null) {
            curr.next = prev;
            prev = curr;
            curr = next;
            if(next != null){
                next = next.next;
            }
        }
        return prev;
    }
}
