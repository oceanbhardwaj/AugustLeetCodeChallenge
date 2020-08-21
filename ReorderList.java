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
    public void reorderList(ListNode head) {
        if(head==null || head.next==null)
            return;
       
        
        ListNode slow=head;
        ListNode fast=head;
        ListNode prev=null;
        while(fast!=null && fast.next!=null)
        {  
            prev=slow;
            slow=slow.next;
        
            fast=fast.next.next;
        }
        prev.next=null;
        
        //reverse
        ListNode curr=slow;
        prev=null;
        
        while(curr!=null)
        {
            ListNode next1=curr.next;
            curr.next=prev;
             prev=curr;
            curr=next1;
           
        }    
        ListNode head1=prev;
        
        ListNode curr1=head;
        ListNode curr2=head1;
       while(curr1!=null)
       {
           ListNode l1=curr1.next;
           ListNode l2=curr2.next;
           curr1.next=curr2;
           if(l1==null)
               break;
           curr2.next=l1;
           curr1=l1;
           curr2=l2;
           
           
       }
        
        
       // return current;
        
    }
}