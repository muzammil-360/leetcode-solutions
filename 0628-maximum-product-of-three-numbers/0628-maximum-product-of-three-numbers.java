class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        long a1=nums[n-1]*nums[n-2]*nums[n-3];
        long a2=nums[0]*nums[1]*nums[n-1];
        long ans=Math.max(a1,a2);
        return (int)ans;
    }
}