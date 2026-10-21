class Solution {
    public boolean canJump(int[] nums) {
        int maxlength=0;
        for(int i=0;i<nums.length;i++){
            if(i>maxlength)return false;
            maxlength=Math.max(maxlength,i+nums[i]);
        }
        return true;
    }
}