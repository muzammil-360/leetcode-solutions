class Solution {
    public int maxWidthRamp(int[] nums) {
        int[] max=new int[nums.length];
        int maxi=Integer.MIN_VALUE;
        for(int i=nums.length-1;i>=0;i--){
            if(nums[i]>=maxi){
                maxi=nums[i];
            }
            max[i]=maxi;
        }
        int ramp=0;
        int i=0;
        int j=0;
        while(i<nums.length && j<max.length){
            if(nums[i]<=max[j]){
                ramp=Math.max(ramp,j-i);
                j++;
            }
            else{i++;}
        }
        return ramp;
    }
}