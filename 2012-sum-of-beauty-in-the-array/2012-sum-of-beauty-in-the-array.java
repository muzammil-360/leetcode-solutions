class Solution {
    public int sumOfBeauties(int[] nums) {
        int[] premax=new int[nums.length];
        premax[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            premax[i]=Math.max(premax[i-1],nums[i]);
        }
        int[] suffmin=new int[nums.length];
        suffmin[nums.length-1]=nums[nums.length-1];
        for(int i=nums.length-2;i>=0;i--){
            suffmin[i]=Math.min(suffmin[i+1],nums[i]);
        }
        int ans=0;
        for(int i=1;i<nums.length-1;i++){
            if(nums[i]>premax[i-1] && nums[i]<suffmin[i+1]){
                ans+=2;
            }
            else if(nums[i]>nums[i-1] && nums[i]<nums[i+1]){
                ans+=1;
            }
            else{ans+=0;}
        }
        return ans;
    }
}