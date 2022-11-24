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
    public ListNode reverseList(ListNode head) {
             
        ListNode prev=null;   
        ListNode curr=head;
        ListNode after;
        while(curr!=null){       //until my current gets outofbounds
            after=curr.next;     
            curr.next=prev;      
            prev=curr;
            curr=after;
        }
        head=prev;              /* !!! must set prev(lastNode) to head !!!!  */
        return head;
    }
}