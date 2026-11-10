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
    public ListNode removeElements(ListNode head, int val) {
        ListNode temp=head;
        ListNode prev=null;
        while(temp!=null){
            ListNode front=temp.next;
            if(temp.val==val){
                if(temp==head){head=head.next;}
                if(prev!=null)prev.next=front;
                temp=front;
            }
            else{
                prev=temp;
                temp=front;
            }
        }
        return head;
    }
}