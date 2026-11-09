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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head==null || head.next==null){return head;}
        int cnt=0;
        ListNode temp=head;
        ListNode l=head;
        ListNode r=head;
        ListNode prev=null;
        while(temp!=null){
            cnt++;
            if(cnt==left-1){
                prev=temp;
            }
            if(cnt==left){
                l=temp;
            }
            if(cnt==right){
                r=temp;
            }
            temp=temp.next;
        }
        ListNode front=r.next;
        r.next=null;
        ListNode newHead=reverseList(l);
        l.next=front;
        if(left==1){return newHead;}
        prev.next=r;
        return head;
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