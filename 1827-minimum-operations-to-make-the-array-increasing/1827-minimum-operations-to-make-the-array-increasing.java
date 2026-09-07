class Solution {
    public int minOperations(int[] nums) {;
        int ans=0;
        for(int i=1;i<nums.length;i++){
           if(nums[i-1]>=nums[i]){
            int diff=nums[i-1]-nums[i];
            ans+=diff+1;
            nums[i]=nums[i-1]+1;
           }
        }
        return ans;
    }
}