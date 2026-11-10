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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode temp=head;
        ListNode front=null;
        ListNode prev=null;
        while(temp!=null){
            ListNode kNode=fKnode(temp,k);
            if(kNode==null){prev.next=temp;break;}
            front=kNode.next;
            kNode.next=null;
            reverse(temp);
            if(temp==head){head=kNode;}
            else{prev.next=kNode;}
            prev=temp;
            temp=front;
        }
        return head;
    }
    public ListNode fKnode(ListNode head,int k){
        int n=k;
        ListNode temp=head;
        while(n>1){
            n--;
            if(temp!=null)temp=temp.next;
        }
        return temp;
    }
    public ListNode reverse(ListNode head){
        if(head==null || head.next==null){return head;}
        ListNode newHead=reverse(head.next);
        ListNode front=head.next;
        front.next=head;
        head.next=null;
        return newHead;
    }
}