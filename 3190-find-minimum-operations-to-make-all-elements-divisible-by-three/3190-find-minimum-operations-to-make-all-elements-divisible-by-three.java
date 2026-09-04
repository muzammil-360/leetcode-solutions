class Solution {
    public int minimumOperations(int[] nums) {
        int cnt=0;
        for(int i=0;i<nums.length;i++){
            int rem=nums[i]%3;
            if(rem==0){continue;}
            else if(rem==1)cnt++;
            else if(rem==2)cnt++;
        }
        return cnt;
    }
}