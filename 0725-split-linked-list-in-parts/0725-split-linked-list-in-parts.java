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
    public ListNode[] splitListToParts(ListNode head, int k) {
        int len=0;
        ListNode temp=head;
        while(temp!=null){
            len++;
            temp=temp.next;
        }
        int size=len/k;
        int rem=len%k;
        ListNode[] ans=new ListNode[k];
        ListNode curr=head;
        ListNode prev=null;
        for(int i=0;i<k;i++){
            ans[i]=curr;
            int maxLen=size;
            if(i<rem){maxLen+=1;}
            else{
                maxLen+=0;
            }
            for(int j=0;j<maxLen;j++){
                prev=curr;
                curr=curr.next;
            }
            if(prev!=null){prev.next=null;}
        }
        return ans;
    }
}