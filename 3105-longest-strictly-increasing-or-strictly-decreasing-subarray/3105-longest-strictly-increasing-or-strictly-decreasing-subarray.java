class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int ans=1;
        int cnt1=1;
        int cnt2=1;
        int i=1;
        while(i<nums.length){
            if(nums[i]>nums[i-1]){
                cnt2=1;
                cnt1++;
                ans=Math.max(ans,cnt1);
            }
            else if(nums[i]<nums[i-1]){
                cnt1=1;
                cnt2++;
                ans=Math.max(ans,cnt2);
            }
            else{cnt1=1;cnt2=1;}
            i++;
        }
        return ans;
    }
}