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
    public ListNode mergeNodes(ListNode head) {
        ListNode dNode=new ListNode(-1);
        ListNode prev=dNode;
        ListNode temp=head.next;
        while(temp!=null){
            int sum=0;
            while(temp!=null && temp.val!=0){
                sum+=temp.val;
                temp=temp.next;
            }
            ListNode s=new ListNode(sum);
            prev.next=s;
            prev=s;
            temp=temp.next;
        }
        return dNode.next;
    }
}