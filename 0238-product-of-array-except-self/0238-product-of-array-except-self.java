class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int[] left=new int[n];
        int[] rigth=new int[n];
        int[] ans=new int[n];
        int pre=1;
        int suf=1;
        int k=0;
        for(int i=0;i<n;i++){
            if(i==0){ 
                left[k]=pre;
                k++;
            }
           else{ 
            pre*=nums[i-1];
            left[k]=pre;
            k++;
            }
        }
        int l=0;
        for(int i=n-1;i>=0;i--){
            if(i==n-1){
                 rigth[l]=suf;
                  l++;
            }
            else{
                suf*=nums[i+1];
            rigth[l]=suf;
            l++;
            }
        }
        //int m=0;
        //int res=1;
        for(int i=0;i<n;i++){
            ans[i]=left[i]*rigth[n-i-1];
            //ans[m]=res;
            //m++;
        }
        return ans;

    }
}