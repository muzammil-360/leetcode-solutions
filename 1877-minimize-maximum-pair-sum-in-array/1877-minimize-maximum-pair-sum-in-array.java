class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int maxp=Integer.MIN_VALUE;
        int i=0;
        int j=nums.length-1;
        while(i<j){
            maxp=Math.max(maxp,(nums[i]+nums[j]));
            i++;
            j--;
        }
        return maxp;
    }
}