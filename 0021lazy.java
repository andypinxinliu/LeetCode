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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);
        ListNode iterate = new ListNode();
        iterate = result;
        while(l1 != null && l2 != null){
            if(l1.val >= l2.val){
                iterate.next = l2;
                iterate = l2;
                l2 = l2.next;
            }
            else if(l1.val < l2.val){
                iterate.next = l1;
                iterate = l1;
                l1 = l1.next;
            }  
        }
        while(l1 == null && l2 != null){
            iterate.next = l2;
            iterate = l2;
            l2 = l2.next;
        }
        while(l1 != null && l2 == null){
            iterate.next = l1;
            iterate = l1;
            l1 = l1.next;
        }
        return result.next;
    }
}
