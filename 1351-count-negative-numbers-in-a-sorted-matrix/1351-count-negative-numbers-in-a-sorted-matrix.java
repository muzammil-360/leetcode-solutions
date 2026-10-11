class Solution {
    public int countNegatives(int[][] grid) {
        int cnt=0;
        for(int i=0;i<grid.length;i++){
            int val=neg(grid[i]);
            cnt+=val;
        }
        return cnt;
    }
    int neg(int[] nums){
        int low=nums.length-1;
        int high=0;
        while(high<=low){
            int mid=low+(high-low)/2;
            if(nums[mid]>=0){
                high=mid+1;
            }
            else{
                low=mid-1;
            }
        }
        return (nums.length-high);
    }
}