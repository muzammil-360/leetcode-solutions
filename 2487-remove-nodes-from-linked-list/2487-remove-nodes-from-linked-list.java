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
    public ListNode removeNodes(ListNode head) {
        ListNode rhead=reverseList(head);
        int max=-1;
        ListNode temp=rhead;
        ListNode prev=null;
        while(temp!=null){
            if(temp.val>=max){
                max=temp.val;
                prev=temp;
                temp=temp.next;
            }
            else{
                prev.next=prev.next.next;
                temp=temp.next;  
            }
        }
        return reverseList(rhead);
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