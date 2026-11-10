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
    public int numComponents(ListNode head, int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        for(int num:nums){
            set.add(num);
        }
        int cnt=0;
        ListNode temp=head;
        while(temp!=null){
            if(set.contains(temp.val)){
                if(temp.next==null || !set.contains(temp.next.val)){cnt++;}
            }
            temp=temp.next;
        }
        return cnt;
    }
}