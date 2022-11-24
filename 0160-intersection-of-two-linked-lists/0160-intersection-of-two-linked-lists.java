/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    //first find which list is smaller
    //move the pointer of bigger list from start to differnece between both lists
    //iterate both pointers and at any point if they are same thats the ans
    //Method 2-> join endpoint to the head of first list then intersection will be loop joint

    public int size(ListNode head){
        ListNode temp=head;
        if(head==null){
            return 0;
        }
        int count=1;
        while(temp.next!=null){
          temp=temp.next;
          count++;
        }
        return count;
    }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode p1=headA;
        ListNode p2=headB;
        int n=size(headA);
        int m=size(headB);
      if(n>m){
        while(n-m>0){
            p1=p1.next;
            n--;
        }
      }
        n=size(headA);
         m=size(headB);
      if(n<m){
        while(m-n>0){
            p2=p2.next;
            m--;
        }
      }
      while(p1!=null&&p2!=null){
          if(p1==p2){
              return p1;
          }
          p1=p1.next;
          p2=p2.next;
      }
      return p1;  
    }
}