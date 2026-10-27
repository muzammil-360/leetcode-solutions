class Solution {
    public int scoreDifference(int[] nums) {
        int ans=0;
        int swap=1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==1)swap*=-1;
            if((i+1)%6==0)swap*=-1;
            ans+=nums[i]*swap;
        }
        return ans;
    }
}