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
public class Solution {
     public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null)
            return head;
         
        ListNode dummy = new ListNode();
        dummy.next = head;
         //create two nodes, current is to store the value that need to be kept in the linkedlist while next is the node directly after the current node
        ListNode current = dummy, next = current.next;

        while (current.next != null && current.next.next != null) {
            if (current.next.val == current.next.next.val) {
                next = next.next;
                
                //not until next node reached a position where the value is different from the current node, it will stop.
                while (next.next != null && next.val == next.next.val) {
                    next = next.next; 
                }
                current.next = next.next;
                
                //if the val of the current node and the next node is different, directly move each to the next index and store the current into the linkdelist
            } else {
                current = current.next;
                next = next.next;
            }
        }
        return dummy.next;
    }
}
