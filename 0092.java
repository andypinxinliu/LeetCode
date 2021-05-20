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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head == null || left == right) return head;
        Stack<ListNode> stack = new Stack<>();
        //leftnode is the position just before the node that needs to be reversed
        ListNode leftnode = new ListNode();
        
        //rightnode is the position just after the last node that needs to be reversed
        ListNode rightnode = new ListNode();
        
        //store nodes are nodes needs to be reversed
        ListNode storenode = new ListNode();
        ListNode dummy = new ListNode();
        dummy.next = head;
        leftnode = dummy;
        
        //index is the position of the node that is going to be reversed
        int index = 1;
        while(index != left){
            leftnode = leftnode.next;
            index++;
        }
        storenode = leftnode.next;
        stack.push(storenode);
        while(index != right){
            storenode = storenode.next;
            stack.push(storenode);
            index++;
        }
        rightnode = storenode.next;
        while(!stack.isEmpty()){
            leftnode.next = stack.pop();
            leftnode = leftnode.next;
        }
        leftnode.next = rightnode;
        return dummy.next;
    }
}
