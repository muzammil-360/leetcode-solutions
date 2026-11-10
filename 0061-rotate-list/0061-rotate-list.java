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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null){return head;}
        int n=1;
        ListNode tail=head;
        while(tail.next!=null){
            n++;
            tail=tail.next;
        }
        if(k%n==0){return head;}
        k=k%n;
        tail.next=head;
        ListNode curr=head;
        int val=n-k;
        while(val>1){
            val--;
            curr=curr.next;
        }
        ListNode newHead=curr.next;
        curr.next=null;
        return newHead;
    }
}