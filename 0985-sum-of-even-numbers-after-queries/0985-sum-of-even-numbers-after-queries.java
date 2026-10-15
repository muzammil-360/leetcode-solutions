class Solution {
    public int[] sumEvenAfterQueries(int[] nums, int[][] queries) {
        int sum=0;
        for(int num:nums){
            if(num%2==0)sum+=num;
            }
        int[] ans=new int[queries.length];
        for(int i=0;i<queries.length;i++){
            int val=queries[i][0];
            int ind=queries[i][1];
            if(nums[ind]%2==0){
                sum-=nums[ind];
            }
            nums[ind]+=val;
            if(nums[ind]%2==0){
                sum+=nums[ind];
            }
            ans[i]=sum;
        }
        return ans;
        }
}