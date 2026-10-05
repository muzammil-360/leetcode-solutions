class Solution {
    public int maxDivScore(int[] nums, int[] divisors) {
        int max=-1;
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<divisors.length;i++){
            int temp=divisors[i];
            int cnt=0;
            for(int j=0;j<nums.length;j++){
                if(nums[j]%temp==0){cnt++;}
            }
            if(cnt>max){
                max=cnt;
                ans=divisors[i];
            }
            else if(cnt==max){
                ans=Math.min(ans,divisors[i]);
            }
           }
        return ans;
    }
}