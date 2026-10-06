class Solution {
    public boolean canAliceWin(int[] nums) {
        int sum=0;
        int s_sum=0;
        for(int num:nums){
            sum+=num;
            if((num/10)==0){
                s_sum+=num;
            }
        }
        int d_sum=sum-s_sum;
        if(s_sum==d_sum)return false;
        return true;
    }
}