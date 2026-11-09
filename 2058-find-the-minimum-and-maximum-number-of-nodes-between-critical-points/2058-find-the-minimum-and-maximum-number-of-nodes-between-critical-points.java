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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        if(head==null || head.next==null ||head.next.next==null){
            return new int[]{-1,-1};
        }
        ListNode temp=head.next;
        ListNode prev=head;
        int cnt=1;
        List<Integer> ls=new ArrayList<>();
        while(temp.next!=null){
            cnt++;
            ListNode front=temp.next;
            if((temp.val>prev.val && temp.val>front.val) || (temp.val<prev.val && temp.val<front.val)){
                ls.add(cnt);
            }
            prev=temp;
            temp=temp.next;
        }
        if(ls.size()==1 || ls.size()==0){return new int[]{-1,-1};}
        int maxDistance=ls.get(ls.size()-1)-ls.get(0);
        int minDistance=Integer.MAX_VALUE;
        int i=0;
        while(i<ls.size()-1){
            int j=i+1;
            minDistance=Math.min(minDistance,ls.get(j)-ls.get(i));
            i++;
        }
        return new int[]{minDistance,maxDistance};
    }
}