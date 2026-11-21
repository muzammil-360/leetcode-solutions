class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int ans=1;
        int cnt=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]>nums[i-1]){cnt++;}
            else{cnt=1;}
            ans=Math.max(ans,cnt);
        }
        return ans;
    }
}