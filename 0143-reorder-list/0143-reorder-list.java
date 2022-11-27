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
    ListNode reverse(ListNode head){
        ListNode prev=null;
        ListNode curr=head;
        ListNode after;
        while(curr!=null){
            after=curr.next;
            curr.next=prev;
            prev=curr;
            curr=after;
        }
        head=prev;
        return head;
    }
    ListNode getMid(ListNode head){
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null&&fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    ListNode merge(ListNode head1,ListNode head2){
       ListNode dummy=new ListNode(-1);
       ListNode curr=dummy;
       if(head1!=null)curr.next=head1;
       
       while(head1!=null&&head2!=null){
            ListNode store=head1.next;
            head1.next=head2;
            ListNode store2=head2.next;
            head2.next=store;
            head1=store;
            head2=store2;
       }
       if(head1!=null){
           head1.next=null;
       }
       return dummy.next;
    }
    public void reorderList(ListNode head) {
        if(head==null||head.next==null)return;
        ListNode firstHead=head;
        ListNode mid=getMid(head);
        ListNode secondHead=reverse(mid);
        
        head= merge(firstHead,secondHead);

    }
}