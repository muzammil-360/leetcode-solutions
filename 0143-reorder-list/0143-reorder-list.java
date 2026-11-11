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
        if(head==null || head.next==null){return;}
        ListNode h1=head;
        ListNode middle=mid(head);
        ListNode mp=middle.next;
        middle.next=null;
        ListNode h2=reverseList(mp);
        while(h2!=null){
            ListNode front1=h1.next;
            ListNode front2=h2.next;
            h1.next=h2;
            h2.next=front1;
            h1=front1;
            h2=front2;
        }
    }

    public ListNode mid(ListNode head){
        ListNode slow=head;
        ListNode fast=head.next;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
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