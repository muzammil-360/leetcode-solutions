class Solution {
    public int maxAscendingSum(int[] nums) {
        int i=1;
        int sum=nums[0];
        int maxSum=sum;
        while(i<nums.length){
            if(nums[i]>nums[i-1]){
                sum+=nums[i];
            }
            else{
                sum=0;
                sum+=nums[i];
            }
            i++;
            maxSum=Math.max(maxSum,sum);
        }
        return maxSum;
    }
}