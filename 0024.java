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
    public ListNode swapPairs(ListNode head) {
        if (head == null) return head;
      
      //the reason for creating the dummy node is that it will make the head to have something in the front so that swapping the head will be similiar to other swappings
      // the best way here is to have two reference of the nodes that need to be swapped.
        ListNode dummy = new ListNode(0);
        dummy.next =head;
      
      //processed means from the dummy to this processed node, the sequence has already been modified so that there is no need for further swapping.
      //then we just need to connect the other nodes to this processed linkedlist
        ListNode processed = dummy;
        ListNode first = head;
        ListNode second = head.next;
        while(first!= null &&second != null){
          //swap the first and the second node and connect the new sequence of the douple to the modified linkedlist
            first.next = second.next;
            second.next = first;
            processed.next = second;
            
          // this is to update the processed linkedlist and then get to the new first node and the new second node
            processed = first;
            if(first.next == null) break;
            first = processed.next;
            second = first.next;
        }
        return dummy.next;
    }
}
