class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        while(k>0){
            int val=minf(nums);
            for(int i=0;i<nums.length;i++){
                if(nums[i]==val){nums[i]*=multiplier;break;}
            }
            k--;
        }
        return nums;
    }
    int minf(int[] nums){
        int min=Integer.MAX_VALUE;
        for(int num:nums){
            if(num<min){min=num;}
        }
        // for(int i=0;i<nums.length;i++){
        //     if(nums[i]==min){min=nums[i];break;}
        // }
        return min;
    }
}