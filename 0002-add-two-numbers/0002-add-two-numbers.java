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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1==null){return l2;}
        if(l2==null){return l1;}
        ListNode dNode=new ListNode(-1);
        ListNode temp=dNode;
        ListNode t1=l1;
        ListNode t2=l2;
        int carry=0;
        while(t1!=null || t2!=null){
            int sum=carry;
            if(t1!=null){sum+=t1.val;}
            if(t2!=null){sum+=t2.val;}
            if(sum<10){
                ListNode front=new ListNode(sum);
                temp.next=front;
                temp=temp.next;
                carry=0;
            }
            else{
                //carry=sum/10; 
                sum%=10;
                ListNode front=new ListNode(sum);
                temp.next=front;
                temp=temp.next;
                carry=1;
            }
            if(t1!=null)t1=t1.next;
            if(t2!=null)t2=t2.next;
        }
        if(carry==1){
            ListNode front=new ListNode(carry);
            temp.next=front;
            temp=temp.next;
        }
        return dNode.next;
    }
}