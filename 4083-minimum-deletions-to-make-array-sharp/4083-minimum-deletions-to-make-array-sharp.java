class Solution {
    public int minDeletions(int[] nums) {
        int cnt=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]==nums[i])cnt++;
        }
        return cnt;
    }
}