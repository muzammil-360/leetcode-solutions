class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double windsum=0;
        for(int i=0;i<k;i++){
            windsum+=(double)nums[i];
        }
        double maxavg=(windsum)/(double)k;
        for(int i=k;i<nums.length;i++){
            windsum+=nums[i];
            windsum-=nums[i-k];
            maxavg=Math.max(maxavg,((windsum)/(double)k));
        }
        return maxavg;
    }
}