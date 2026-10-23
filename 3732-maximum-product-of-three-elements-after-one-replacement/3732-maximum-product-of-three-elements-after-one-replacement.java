class Solution {
    public long maxProduct(int[] nums) {
        long max1=0;
        long max2=0;
        for(int num:nums){
            long val=Math.abs(num);
            if(val>=max1){
                max2=max1;
                max1=val;
            }
            else if(val>max2){
                max2=val;
            }
        }
        return max1*max2*100000L;
    }
}