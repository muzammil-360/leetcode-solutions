class Solution {
    public int minimumDeletions(int[] nums) {
        int minind=0;
        int maxind=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]>nums[maxind])maxind=i;
            if(nums[i]<nums[minind])minind=i;
        }
        int left=Math.min(maxind,minind);
        int right=Math.max(maxind,minind);
        int rem_left=right+1;
        int rem_right=nums.length-left;
        int rem_both_ends=left+1+nums.length-right;
        int ans=Math.min(rem_left,Math.min(rem_right,rem_both_ends));
        return ans;
    }
}