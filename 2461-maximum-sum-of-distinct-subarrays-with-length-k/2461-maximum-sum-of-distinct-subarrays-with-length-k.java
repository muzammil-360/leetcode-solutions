class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        long maxsum=0;
        long sum=0;
        int l=0;
        int r=0;
        HashSet<Integer> set=new HashSet<>();
        while(r<nums.length){
            while(set.contains(nums[r])){
                set.remove(nums[l]);
                sum-=nums[l];
                l++;
            }
            set.add(nums[r]);
            sum+=nums[r];
            if(r-l+1>k){
                set.remove(nums[l]);
                sum-=nums[l];
                l++;
            }
            if(r-l+1==k){
                maxsum=Math.max(maxsum,sum);
            }
            r++;
        }
        return maxsum;
    }
}