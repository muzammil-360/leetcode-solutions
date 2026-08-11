class Solution {
    public int maxProductDifference(int[] nums) {
        Arrays.sort(nums);
        int x=nums[0];
        int y=nums[1];
        int m=nums[nums.length-1];
        int n=nums[nums.length-2];
        int maxdiff=(m*n)-(x*y);
        return maxdiff;
    }
}