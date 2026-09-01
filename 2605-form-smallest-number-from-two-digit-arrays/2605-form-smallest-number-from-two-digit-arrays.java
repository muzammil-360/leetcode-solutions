class Solution {
    public int minNumber(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int cd=0;
        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]){
                    // cd=Math.min(cd,nums1[i]);
                    return nums1[i];
                }
            }
        }
        //if(cd!=0)return cd;
        // int min1=nums1[0];
        // for(int i=1;i<nums1.length;i++){
        //     if(nums1[i]<min1){
        //         min1=nums1[i];
        //     }
        // }
       // int min2=nums2[0];
        // for(int i=1;i<nums2.length;i++){
        //     if(nums2[i]<min1){
        //         min2=nums2[i];
        //     }
        // }
        //if(min1==min2)return min1;
        int sm=Math.min(nums1[0],nums2[0]);
         int smp=Math.max(nums1[0],nums2[0]);
        return (sm*10+smp);
    }
}