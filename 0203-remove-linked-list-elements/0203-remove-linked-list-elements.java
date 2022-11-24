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
    public ListNode removeElements(ListNode head, int k) {
        ListNode dummy=new ListNode(-1);
        dummy.next=head;
        ListNode prev=dummy;
        ListNode curr=head;
        while(curr!=null){
            if(curr.val==k){
                prev.next=curr.next;
            }
            else {
                prev = prev.next;
            }
            curr = curr.next;
        }
        return dummy.next;
    }
}