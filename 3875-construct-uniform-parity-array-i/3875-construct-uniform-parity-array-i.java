class Solution {
    public boolean uniformArray(int[] nums1) {
        int ec=0;
        int oc=0;
        for(int i=0;i<nums1.length;i++){
            if(nums1[i]%2==0)ec++;
            if(nums1[i]%2==1)oc++;
        }
        if(ec==nums1.length || oc==nums1.length)return true;
        return true;
    }
}