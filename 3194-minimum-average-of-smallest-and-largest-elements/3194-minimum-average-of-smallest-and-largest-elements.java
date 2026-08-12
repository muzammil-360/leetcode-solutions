class Solution {
    public double minimumAverage(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int l=0;
        int r=n-1;
        double mini=Double.MAX_VALUE;
          while(l<r){
        double avg=(nums[l]+nums[r])/2.0;
        mini=Math.min(mini,avg);
        l++;
        r--;}   
       return mini;
    }
}