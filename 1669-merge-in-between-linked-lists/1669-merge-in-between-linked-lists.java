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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        int cnt=0;
        ListNode temp=list1;
        ListNode start=null;
        ListNode end=null;
        while(temp!=null){
            temp=temp.next;
            cnt++;
            if(cnt==a){start=temp;}
            if(cnt==b){end=temp;break;}
        }
        ListNode prev=null;
        ListNode temp1=list1;
        while(temp!=null){
            if(temp1==start){break;}
            prev=temp1;
            temp1=temp1.next;
        }
        ListNode tail=null;
        ListNode temp2=list2;
        while(temp2!=null){
            tail=temp2;
            temp2=temp2.next;
        }
        prev.next=list2;
        tail.next=end.next;
        if(list1==start){return list2;}
        return list1;
    }
}