class Solution {
    public int splitArray(int[] nums, int k) {
        int sum=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            max=Math.max(max,nums[i]);
        }
        // for(int i=max;i<=sum;i++){
        //     int cntarr=splarr(nums,i,k);
        //     if(cntarr==k)return i;
        // }
        // return -1;
        int low=max;
        int high=sum;
        while(low<=high){
            int mid=low+(high-low)/2;
            int cntarr=splarr(nums,mid,k);
            if(cntarr>k)low=mid+1;
            else{high=mid-1;}
        }
        return low;
    }
    int splarr(int[] nums,int x,int k){
        int subarr=1;
        int num=0;
        for(int i=0;i<nums.length;i++){
            if(num+nums[i]<=x){
                num+=nums[i];
            }
            else{
                subarr++;
                num=nums[i];
            }
        }
        return subarr;
    }
}