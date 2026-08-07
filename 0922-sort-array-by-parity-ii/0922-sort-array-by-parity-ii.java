class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int k=0;
        int p=1;
        int[] ans=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                ans[k]=nums[i];
                k+=2;
            }
            else{
                    ans[p]=nums[i];
               p+=2;
            }
        }
        return ans;
    }
}