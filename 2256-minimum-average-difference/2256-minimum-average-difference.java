class Solution {
    public int minimumAverageDifference(int[] nums) {
        long ts=0;
        for(int num:nums){
            ts+=num;
        }
        long ls=0;
        long mind=Integer.MAX_VALUE;
        int ans=0;
        for(int i=0;i<nums.length;i++){
            long rs=ts-ls-nums[i];
            long ra=0;
            if(i!=nums.length-1){
                ra=rs/(nums.length-i-1);
            }

             ls+=nums[i];
            long la=ls/(i+1);
            long diff=Math.abs(la-ra);
            if(diff<mind){
                mind=diff;
                ans=i;
            }
        }
        return ans;
    }
}