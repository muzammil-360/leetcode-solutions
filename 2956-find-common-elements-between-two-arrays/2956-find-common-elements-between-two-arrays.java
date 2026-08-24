class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        int cnt1=0;
        int cnt2=0;
        for(int i=0;i<nums1.length;i++){
            int temp=nums1[i];
            for(int j=0;j<nums2.length;j++){
                if(temp==nums2[j]){
                    cnt1++;
                    break;
                    }
            }
        }
        for(int i=0;i<nums2.length;i++){
            int temp=nums2[i];
            for(int j=0;j<nums1.length;j++){
                if(temp==nums1[j]){
                    cnt2++;
                    break;
                }
            }
        }      
        return new int[]{cnt1,cnt2};
    }
}