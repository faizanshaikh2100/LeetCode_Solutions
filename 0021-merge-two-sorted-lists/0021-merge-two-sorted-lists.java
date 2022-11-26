/**
 * Definition for singly-linked list.
 * public class ListListNode {
 *     int val;
 *     ListListNode next;
 *     ListListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode head, ListNode head2) {
        ListNode dummy=new ListNode();
        ListNode curr=dummy;
        while(head!=null&&head2!=null){
            if(head.val<head2.val){
                curr.next=head;
                head=head.next;
                curr=curr.next;
            }
            else{
                curr.next=head2;
                head2=head2.next;
                curr=curr.next;
            }
           
        }
        if(head==null){
               curr.next=head2;
           }
           else if(head2==null){
               curr.next=head;
           }
         return dummy.next;
    }
}