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
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode temp=head;
        ListNode front=head.next;
        while(temp!=null && front!=null){
            ListNode gcd=GCD(temp.val,front.val);
            temp.next=gcd;
            gcd.next=front;
            temp=temp.next.next;
            front=front.next;
        }
        return head;
    }
    public ListNode GCD(int val1,int val2){
        while(val1>0 && val2>0){
            if(val1>val2){val1%=val2;}
            else{
                {val2%=val1;}
            }
        }
        if(val1==0){return new ListNode(val2);}
        return new ListNode(val1);
    }
}