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
    public ListNode swapNodes(ListNode head, int k) {
        int n=length(head);
        int last=n-k+1;
        ListNode s1=null;
        ListNode s2=null;
        int cnt1=0;
        int cnt2=0;
        ListNode temp1=head;
        while(temp1!=null){
            cnt1++;
            cnt2++;
            if(cnt1==k){s1=temp1;}
            if(cnt2==last){s2=temp1;}
            temp1=temp1.next;
        }
        int t=s1.val;
        s1.val=s2.val;
        s2.val=t;
        return head;
        // ListNode temp=head;
        // ListNode dNode=new ListNode(-1);
        // ListNode prev=dNode;
        // while(temp!=null){
        //     if(temp==s1){
        //         prev.next=s2;
        //         prev=s2;
        //     }
        //     else if(temp==s2){
        //         prev.next=s1;
        //         prev=s1;
        //     }
        //     else{
        //         prev.next=temp;
        //         prev=temp;
        //     }
        //     temp=temp.next;
        // }
        // return dNode.next;
    }
    public int length(ListNode head){
        int n=0;
        ListNode temp=head;
        while(temp!=null){
            n++;
            temp=temp.next;
        }
        return n;
    }
}