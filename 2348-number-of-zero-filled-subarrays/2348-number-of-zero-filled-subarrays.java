class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long cnt=0;
        int zeros=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){zeros++;}
            else{
                zeros=0;
            }
            cnt+=(long)zeros;
        }
        return cnt;
    }
}