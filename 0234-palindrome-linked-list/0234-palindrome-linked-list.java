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
    // ListNode merge(ListNode head1,LisNode head2){



    // }
    public boolean isPalindrome(ListNode head) {
        ListNode firstHead=head;
        ListNode mid=getMid(head);
        ListNode secondHead=reverse(mid);
        while(firstHead!=null&&secondHead!=null){
            if(firstHead.val!=secondHead.val){
                return false;
            }
            firstHead=firstHead.next;
            secondHead=secondHead.next;
        }
        return true;

    }
}
