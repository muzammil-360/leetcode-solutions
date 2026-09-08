class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] ans=new int[2*n];
        int k=0;
        int l=1;
        int i=0;
        while(k<2*n || l<2*n){
           if(i<n){
             ans[k]=nums[i];
            i++;
            k+=2;
            }
            else if(i<2*n){
                ans[l]=nums[i];
                i++;
                l+=2;
            }
        }
        return ans;
    }
}