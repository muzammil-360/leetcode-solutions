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
    public ListNode partition(ListNode head, int x) {
        ListNode dNode1=new ListNode(-1);
        ListNode dNode2=new ListNode(-1);
        ListNode prev1=dNode1;
        ListNode prev2=dNode2;
        ListNode temp=head;
        while(temp!=null){
            if(temp.val<x){
                prev1.next=temp;
                prev1=temp;
            }
            else{
                prev2.next=temp;
                prev2=temp;
            }
            temp=temp.next;
        }
        prev1.next=dNode2.next;
        prev2.next=null;
        return dNode1.next;
    }
}