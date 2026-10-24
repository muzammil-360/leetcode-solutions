class Solution {
    public long countSubarrays(int[] nums, long k) {
        int l=0;
        int r=0;
        long cnt=0;
        long sum=0;
        while(r<nums.length){
            sum+=(long)nums[r];
            long score=sum*(long)(r-l+1);
            while(score>=k){
                sum-=(long)nums[l];
                l++;
                score=sum*(long)(r-l+1);
            }
            cnt+=(r-l+1);
            r++;
        }
        return cnt;
    }
}