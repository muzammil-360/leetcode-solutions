class Solution {
    public int maximizeSum(int[] nums, int k) {
        int max=Integer.MIN_VALUE;
        for(int num:nums){
            if(num>max){max=num;}
        }
        int n=k-1;
        int sum=(n*(n+1))/2;
        int ans=max*k+sum;
        return ans;
    }
}