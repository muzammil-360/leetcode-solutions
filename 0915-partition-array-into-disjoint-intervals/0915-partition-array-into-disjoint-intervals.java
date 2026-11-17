class Solution {
    public int partitionDisjoint(int[] nums) {
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
        for(int i=1;i<nums.length;i++){
            if(premax[i-1]<=suffmin[i]){return i;}
        }  
        return nums.length;
    }
}