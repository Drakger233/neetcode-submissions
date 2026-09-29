/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public void reorderList(ListNode head) {
        ListNode middle = findmiddle(head);
        ListNode halfend = middle.next;
        middle.next = null;
        halfend = reverse(halfend);
        merge(head,halfend);
    }
    private ListNode findmiddle(ListNode node){
        ListNode fast = node;
        ListNode slow = node;
        while(fast.next!=null && fast.next.next!=null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
    private ListNode reverse(ListNode node){
        ListNode prev = null;
        while(node!=null){
            ListNode next = node.next;
            node.next = prev;
            prev = node;
            node = next;
        }
        return prev;
    }
    private void merge(ListNode node1, ListNode node2){
        ListNode dummy = new ListNode(0);
        while(node1!=null && node2!=null){
            dummy.next = node1;
            node1 = node1.next;
            dummy = dummy.next;
            dummy.next = node2;
            node2 = node2.next;
            dummy = dummy.next;
        }
        if(node1!=null){
            dummy.next = node1;
        }
        if(node2!=null){
            dummy.next = node2;
        }
    }
}
