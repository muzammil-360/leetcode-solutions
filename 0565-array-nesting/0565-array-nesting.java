class Solution {
    public int arrayNesting(int[] nums) {
        int ans = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 1000000000) {
                int start = nums[i];
                int count = 0;
                while (nums[start] != 1000000000) {
                    int temp = start;
                    start = nums[start];
                    count++;
                    nums[temp] = 1000000000;
                }
                ans = Math.max(ans, count);
            }
        }
        return ans;
    }
}