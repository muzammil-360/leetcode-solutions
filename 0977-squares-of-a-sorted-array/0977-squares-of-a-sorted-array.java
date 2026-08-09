class Solution {
    public int[] sortedSquares(int[] nums) {
        int n=nums.length;
        int left=0;
        int right=n-1;
        int index=0;
        int[] ans=new int[n];
        while(left<=right){
            int x=1;
            if(Math.abs(nums[left])<=Math.abs(nums[right])){
                x*=nums[right]*nums[right];
                right--;
                }
            else{
                x*=nums[left]*nums[left];
                left++;
                }
            ans[n-index-1]=x;
            index++;
        }
        return ans;
    }
}