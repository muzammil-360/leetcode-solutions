class Solution {
    public int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums);
        long sum=0;
        long len=0;
        int l=0;
        int r=0;
        while(r<nums.length){
            sum+=(long)nums[r];
            while((r-l+1)*(long)nums[r]>(sum+(long)k)){
                sum-=(long)nums[l];
                l++;
            }
            len=Math.max(len,r-l+1);
            r++;
        }
        return (int)len;
    }
}