class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n=nums.length;
        int[] larr=new int[n];
        int maxi=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(nums[i]>maxi){
            maxi=nums[i];
            larr[i]=maxi;
            }
           else{ 
            maxi=Math.max(maxi,nums[i]);
            larr[i]=maxi;
            }
        }
        int[] rarr=new int[n];
        int mini=Integer.MAX_VALUE;
        for(int i=n-1;i>=0;i--){
            if(nums[i]<mini){
            mini=nums[i];
            rarr[i]=mini;
            }
           else{ 
            mini=Math.min(mini,nums[i]);
            rarr[i]=mini;
            }
        }
        for(int i=0;i<n;i++){
            if(larr[i]-rarr[i]<=k)return i;
        }
        return -1;
    }
}