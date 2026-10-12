class Solution {
    public int countPartitions(int[] nums) {
        int sum=0;
        for(int num:nums){
            sum+=num;
        }
        int cnt=0;
        int ls=0;
        for(int i=0;i<nums.length-1;i++){
            ls+=nums[i];
            sum-=2*nums[i];
            if(sum%2==0){cnt++;}
        }
        return cnt;
    }
}