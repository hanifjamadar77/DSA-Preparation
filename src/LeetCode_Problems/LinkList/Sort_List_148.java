package LeetCode_Problems.LinkList;

public class Sort_List_148 {
    public static void main(String[] args) {

    }

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next;
        }
    }

//    Sorting list using merge sort
public ListNode sortList(ListNode head) {
    // Solution using merge sort
    if(head == null || head.next == null){
        return head;
    }

    ListNode mid = findMid(head);
    ListNode left = sortList(head);
    ListNode right = sortList(mid);

    return merge(left, right);
}

    public ListNode merge(ListNode list1 , ListNode list2){
        ListNode dummy = new ListNode();
        ListNode tail = dummy;

        while(list1 != null && list2 != null){
            if(list1.val < list2.val){
                tail.next = list1;
                list1 = list1.next;
                tail = tail.next;
            }else{
                tail.next = list2;
                list2 = list2.next;
                tail = tail.next;
            }
        }
        tail.next = (list1 != null) ? list1 : list2;
        return dummy.next;
    }

    public ListNode findMid(ListNode head){
        ListNode midPrev = null;
        while(head != null && head.next != null){
            midPrev = (midPrev == null) ? head : midPrev.next;
            head = head.next.next;
        }

        ListNode mid = midPrev.next;
        midPrev.next = null;
        return mid;
    }
}
