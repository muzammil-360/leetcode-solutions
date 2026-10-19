class Solution {
    public int[][] divideArray(int[] nums, int k) {
        Arrays.sort(nums);
        //int[][] ans=new int[(nums.length)/3][3];
        int[][] ans=new int[(nums.length)/3][];
        int y=0;
        int i=0;
        while(i<nums.length){
            int[] arr=new int[3];
            if(nums[i+2]-nums[i]>k || nums[i+2]-nums[i+1]>k){return new int[][]{};}
            arr[0]=nums[i];
            arr[1]=nums[i+1];
            arr[2]=nums[i+2];
            ans[y++]=arr;
            i+=3;
        }
        return ans;
    }
}