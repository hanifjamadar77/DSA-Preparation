package LeetCode_Problems.LinkList;

public class Delete_Node_LL_237 {
    public static void main(String[] args) {

    }

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val,ListNode next) { this.val = val; this.next = next; }
    }

    public void deleteNode(ListNode node) {
        // Copy value from next node into current node
        node.val = node.next.val;
        // Skip the next node
        node.next = node.next.next;
    }
}
