class Solution {
    public int[] numberGame(int[] nums) {
        Arrays.sort(nums);
        int i=0;
        while(i<nums.length-1){
            int j=i+1;
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            i+=2;
        }
        return nums;
    }
}