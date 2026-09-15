class Solution {
    public int findClosestNumber(int[] nums) {
        int closest=nums[0];
        for(int num:nums){
            if(Math.abs(num-0)<Math.abs(closest-0) || 
            (Math.abs(num-0)==Math.abs(closest-0))&&num>closest){
                closest=num;
            }
        }
        return closest;
    }
}