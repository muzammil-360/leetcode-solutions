class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int prefix=0;
        int minprefix=0;
        int maxprefix=0;
        int ans=0;
        for(int i=0;i<nums.length;i++){
            prefix+=nums[i];
            minprefix=Math.min(minprefix,prefix);
            maxprefix=Math.max(maxprefix,prefix);
            int maxsum=prefix-minprefix;
            int minsum=prefix-maxprefix;
            ans=Math.max(ans,Math.max(Math.abs(maxsum),Math.abs(minsum)));
        }
        return ans;
    }
}