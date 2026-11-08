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
    public int pairSum(ListNode head) {
        ListNode temp=head;
        int cnt=0;
        while(temp!=null){
            cnt++;
            temp=temp.next;
        }
        int n=cnt/2;
        ListNode temp1=head;
        n--;
        while(n>0){
            n--;
            temp1=temp1.next;
        }
        ListNode front=temp1.next;
        temp1.next=null;
        ListNode t1=head;
        ListNode t2=reverseList(front);
        int maxSum=0;
        while(t1!=null && t2!=null){
            maxSum=Math.max(maxSum,t1.val+t2.val);
            t1=t1.next;
            t2=t2.next;
        }
        return maxSum;
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