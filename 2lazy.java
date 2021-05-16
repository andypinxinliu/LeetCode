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


//for this question, each time we need to create two nodes and connect the two together. The best way is to have one iterate, and another do the job of store the value
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int weight = 0;
      //first create a dummy node
        ListNode first = new ListNode(0);
      //it is for the iteration
        ListNode iterate = new ListNode();
        iterate = first;
        while(l1 != null || l2 != null){
            int val1 = 0;
            int val2 = 0;
            if (l1 != null)
                val1 = l1.val;
            if (l2 != null)
                val2 = l2.val;
            int value = val1 + val2 + weight;
            weight = 0;
            if (value >= 10){
                value = value - 10;
                weight = 1;
            }
            if (l1 != null)
                l1 = l1.next;
            if (l2 != null)
                l2 = l2.next;
            ListNode nextnode = new ListNode(value);
            iterate.next = nextnode;
            iterate = nextnode;
        }
        if(weight != 0){
            ListNode last = new ListNode(weight);
            iterate.next = last;
        }
        return first.next;
    }
}
