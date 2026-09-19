class Solution {
    public int[] getAverages(int[] nums, int k) {
        long[] pref=new long[nums.length];
        pref[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            pref[i]=pref[i-1]+nums[i];
        }
        int[] ans=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(i<k || (nums.length-1-i)<k){
                ans[i]=-1;
                continue;
            }
            long val=0;
            if((i-k-1)<0){
            val=(long)(pref[i+k])/(2*k+1);
            ans[i]=(int)val;
            }
            else {
                val=(pref[i+k]-pref[i-k-1])/(2*k+1);
                ans[i]=(int)val;
                }
        }
        return ans;
    }
}