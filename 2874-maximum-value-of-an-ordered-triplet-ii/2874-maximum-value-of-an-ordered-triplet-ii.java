class Solution {
    public long maximumTripletValue(int[] nums) {
        int[] premax=new int[nums.length];
        premax[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            premax[i]=Math.max(premax[i-1],nums[i]);
        }
        int[] suffmax=new int[nums.length];
        suffmax[nums.length-1]=nums[nums.length-1];
        for(int i=nums.length-2;i>=0;i--){
            suffmax[i]=Math.max(suffmax[i+1],nums[i]);
        }
        long ans=0;
        for(int i=1;i<nums.length-1;i++){
            long val=(long)(premax[i-1]-nums[i])*suffmax[i+1];
            ans=Math.max(ans,val);
        }
        return ans;
    }
}