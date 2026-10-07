class Solution {
    public int countTestedDevices(int[] batteryPercentages) {
        int test=0;
        for(int i=0;i<batteryPercentages.length;i++){
            if(batteryPercentages[i]>0){
                test++;
                func(batteryPercentages,i);
            }
        }
        return test;
    }
    int[] func(int[] nums,int l){
        for(int i=l+1;i<nums.length;i++){
            nums[i]=nums[i]-1;
        }
        return nums;
    }
}