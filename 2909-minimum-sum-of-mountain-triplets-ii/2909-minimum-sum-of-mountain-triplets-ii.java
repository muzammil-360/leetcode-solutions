class Solution {
    public int minimumSum(int[] nums) {
        int[] premin=new int[nums.length];
        premin[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            premin[i]=Math.min(premin[i-1],nums[i]);
        }
        int[] suffmin=new int[nums.length];
        suffmin[nums.length-1]=nums[nums.length-1];
        for(int i=nums.length-2;i>=0;i--){
            suffmin[i]=Math.min(suffmin[i+1],nums[i]);
        }
        int ans=Integer.MAX_VALUE;
        for(int i=1;i<nums.length-1;i++){
            if(nums[i]>premin[i-1] && nums[i]>suffmin[i+1]){
                ans=Math.min(ans,premin[i-1]+nums[i]+suffmin[i+1]);
            }
        }
        if(ans==Integer.MAX_VALUE){return -1;}
        return ans;
    }
}