class Solution {
    public int[] concatWithReverse(int[] nums) {
         int n=nums.length;
        // int[] arr1=new int[n];
        // for(int i=0;i<2*n;i++)
        // int start=0;
        // int end=n-1;
        // while(start<end){
        //     int temp=nums[start];
        //     nums[start]=nums[end];
        //     nums[end]=temp;
        //     start++;
        //     end--;
        // }
        int[] ans=new int[2*n];
        for(int i=0;i<2*n;i++){
            if(i<n){
                ans[i]=nums[i];
            }
            else{
                ans[i]=nums[2*n-i-1];
            }
        }
        return ans;
    }
}