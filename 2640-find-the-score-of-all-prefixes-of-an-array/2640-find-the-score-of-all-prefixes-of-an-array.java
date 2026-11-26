class Solution {
    public long[] findPrefixScore(int[] nums) {
        long[] ans=new long[nums.length];
        int[] arr=new int[nums.length];
        int maxi=nums[0];
        arr[0]=nums[0]+maxi;
        ans[0]=arr[0];
        for(int i=1;i<nums.length;i++){
            maxi=Math.max(maxi,nums[i]);
            arr[i]=nums[i]+maxi;
            ans[i]=ans[i-1]+arr[i];
        }
        return ans;
    }
}