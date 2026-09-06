class Solution {
    public int addedInteger(int[] nums1, int[] nums2) {
        int sum1=0;
        for(int i=0;i<nums1.length;i++){
            sum1+=nums1[i];
        }
        int sum2=0;
        for(int i=0;i<nums2.length;i++){
            sum2+=nums2[i];
        }
        int diff=sum2-sum1;
        int x=diff/(nums1.length);
        return x;
    }
}