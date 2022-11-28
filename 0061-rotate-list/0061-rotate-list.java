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
    public ListNode addToFirst(ListNode head,int k){
        if(head==null||head.next==null){
            return head;
        }
        ListNode temp=head;
        while(temp.next.next!=null){
            temp=temp.next;
        }
        ListNode store=temp.next;
        temp.next=null;
        store.next=head;
        head=store;
        return head;
    }
    public int size(ListNode head){
        int n=0;
        ListNode temp=head;
        while(temp!=null){
            n++;
            temp=temp.next;
        }
        return n;
    }
    public ListNode rotateRight(ListNode head, int k) {
        int n=size(head);
        if(head==null||head.next==null){
            return head;
        }
      for(int i=1;i<=k%n;i++){
          head=addToFirst(head,k);
      } 
      return head; 
    }
}