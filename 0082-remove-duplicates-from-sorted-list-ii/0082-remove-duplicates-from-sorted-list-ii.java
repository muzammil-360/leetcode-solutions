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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode temp=head;
        ListNode dNode=new ListNode(-1);
        ListNode prev=dNode;
        while(temp!=null){
            ListNode front=temp.next;
            while(front!=null && front.val==temp.val){
                front=front.next;
            }
            if(temp.next==front){
                prev.next=temp;
                prev=temp;
                temp=front;
            }
            else{
                //prev.next=front;
                //prev=front;
                temp=front;
            }
        }
        prev.next=null;
        return dNode.next;
    }
}