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
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null)
            return head;
      
      //we have three reference node.
      //fast is to find the node k index after the slow node
      //iterate is to find the length of the linkedlist
        ListNode slow = new ListNode();
        ListNode fast = new ListNode();
        ListNode dummy = new ListNode();
        slow = head;
        fast = slow;
        ListNode iterate = new ListNode();
        iterate = head;
        int count = 0;
        while(iterate != null){
            iterate = iterate.next;
            count++;
        }
        int time = k % count;
        if (time == 0)
            return head;
        for(int i = 0; i < time; i++){
            fast = fast.next;
        }
        
        while(fast.next != null){
            fast = fast.next;
            slow = slow.next;
        }
        dummy.next = slow.next;
        fast.next = head;
        slow.next = null;
        return dummy.next;
    }
}
