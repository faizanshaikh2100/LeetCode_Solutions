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
    public ListNode reverse(ListNode head){
        ListNode prev=null;
        ListNode curr=head;
        ListNode after;
        while(curr!=null){
            after=curr.next;
            curr.next=prev;
            prev=curr;
            curr=after;
        }
        return prev;
    }
    public ListNode middle(ListNode head){
        ListNode slow=head;
        ListNode fast=head;
        while(fast.next!=null&&fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public boolean isPalindrome(ListNode head) {
        ListNode mid=middle(head);
        ListNode head2=mid.next;
        mid.next=null;
        head2=reverse(head2);
        
        ListNode p1=head;
        ListNode p2=head2;
        
        while(p1!=null&&p2!=null){
            if(p1.val!=p2.val){
                return false;
            }
            p1=p1.next;
            p2=p2.next;
        }
        return true;
        
        
    }
}