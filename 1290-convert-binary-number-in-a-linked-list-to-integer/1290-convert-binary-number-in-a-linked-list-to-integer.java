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
    public int getDecimalValue(ListNode head) {
        String binary="";
        if(head==null){
            return 0;
        }
        ListNode p1=head;
        while(p1!=null){
            binary=binary+p1.val;
            p1=p1.next;
            
        }
        
        return Integer.parseInt(binary,2);
    }
}