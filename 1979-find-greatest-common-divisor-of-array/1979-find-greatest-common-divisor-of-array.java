class Solution {
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        int sm=nums[0];
        int lg=nums[nums.length-1];
        while(sm>0 && lg>0){
            if(sm>lg){sm%=lg;}
            else{
                lg%=sm;
            }
        }
        if(sm==0)return lg;
        if(lg==0)return sm;
        return -1;
    }
}