class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        if(nums.length>threshold)return -1;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){max=nums[i];}
        } 
        // for(int div=1;div<=max;div++){
        //     int dsum=smlldiv(nums,div);    
        //     if(dsum<=threshold)return div;
        // }
        int low=1;
        int high=max;
        //int ans=-1...we can use also!!!
        while(low<=high){
            int mid=low+(high-low)/2;
            int dsum=smlldiv(nums,mid); 
            if(dsum<=threshold)high=mid-1;
            else{low=mid+1;}
            }
        return low;
    }
    int smlldiv(int[] nums,int d){
        int sum=0;
         for(int i=0;i<nums.length;i++){
            sum+=Math.ceil((double)nums[i]/(double)d);
         }
         return sum;
    }
}