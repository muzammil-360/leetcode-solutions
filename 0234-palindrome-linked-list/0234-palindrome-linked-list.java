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
    public boolean isPalindrome(ListNode head) {
        if(head==null || head.next==null){return true;}
        ListNode slow=head;
        ListNode fast=head;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;           
        }
        ListNode newHead=reverseList(slow.next);
        ListNode t1=head;
        ListNode t2=newHead;
        while(t2!=null){
            if(t1.val!=t2.val){
                reverseList(newHead);
                return false;
            }
            t1=t1.next;
            t2=t2.next;
        }
        reverseList(newHead);
        return true;
    }
    public ListNode reverseList(ListNode head) {
        if(head==null || head.next==null){return head;}
        ListNode temp=head;
        ListNode prev=null;
        while(temp!=null){
            ListNode front=temp.next;
            temp.next=prev;
            prev=temp;
            temp=front;
        }
        return prev;
    }
}