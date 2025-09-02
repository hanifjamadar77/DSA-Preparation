package LeetCode_Problems.LinkList;

public class Reverse_Nodes_K_Group_25 {
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

    class Solution {
        public ListNode reverseKGroup(ListNode head, int k) {
            if (k <= 1 || head == null) {
                return head;
            }

            ListNode dummy = new ListNode(0, head);
            ListNode groupPrev = dummy;

            while (true) {
                // find kth node
                ListNode kth = getKthNode(groupPrev, k);
                if (kth == null) break; // not enough nodes

                ListNode groupNext = kth.next;

                // reverse group
                ListNode prev = kth.next;
                ListNode curr = groupPrev.next;

                while (curr != groupNext) {
                    ListNode temp = curr.next;
                    curr.next = prev;
                    prev = curr;
                    curr = temp;
                }

                // connect reversed group
                ListNode temp = groupPrev.next;
                groupPrev.next = kth;
                groupPrev = temp;
            }

            return dummy.next;
        }

        // helper to get kth node from given node
        private ListNode getKthNode(ListNode start, int k) {
            while (start != null && k > 0) {
                start = start.next;
                k--;
            }
            return start;
        }
    }

}
