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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp1=head;
        int cnt1=0;
        while(temp1!=null){
            cnt1++;
            temp1=temp1.next;
        }
        int k=cnt1-n+1;
        if(head==null){return head;}
        if(k==1){
            head=head.next;
            return head;
        }
        int cnt=0;
        ListNode temp=head;
        ListNode prev=null;
        while(temp!=null){
            cnt++;
            if(k==cnt){
                prev.next=prev.next.next;
                break;
            }
            prev=temp;
            temp=temp.next;
        }
        return head;
    }
}