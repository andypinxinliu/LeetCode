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
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) return head;
        ListNode current = head;
        ListNode next = current.next;
        while(next != null){
            while(current.val == next.val){
                next = next.next;
                if(next == null)
                    break;
            }
            current.next = next;
            if(next == null) break;
            current = next;
            next = next.next;
        }
        return head;
    }
}
