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
    public ListNode doubleIt(ListNode head) {
        ListNode h=reverseList(head);
        ListNode t=h;
        ListNode dNode=new ListNode(-1);
        ListNode temp=dNode;
        int carry=0;
        while(t!=null){
            int val=carry;
            val+=2*t.val;
            if(val<10){
            ListNode newNode=new ListNode(val);
            temp.next=newNode;
            temp=temp.next;
            carry=0;    
            }
            else{
            ListNode newNode=new ListNode(val%10);
            temp.next=newNode;
            temp=temp.next;
            carry=1;
            }
            t=t.next;
        }
        if(carry==1){
            ListNode newNode=new ListNode(carry);
            temp.next=newNode;
            temp=temp.next;
        }
        return  reverseList(dNode.next);
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