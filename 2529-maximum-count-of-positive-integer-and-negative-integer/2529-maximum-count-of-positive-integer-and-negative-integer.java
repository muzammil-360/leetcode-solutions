class Solution {
    public int maximumCount(int[] nums) {
        if(nums.length==1){
            if(nums[0]<0)return 1;
        }
        if(nums[0]<0 && nums[nums.length-1]<0)return nums.length;
        int low=0;
        int high=nums.length-1;
        int ans=nums.length;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]>0){
                ans=mid;
                high=mid-1;
            }
            else{low=mid+1;}
        }
        int pos=0;
        if(ans!=nums.length){
            pos=nums.length-ans;
        }


        int l=0;
        int h=nums.length-1;
        int a=nums.length;
        while(l<=h){
            int m=l+(h-l)/2;
            if(nums[m]>=0){
                a=m;
                h=m-1;
            }
            else{l=m+1;}
        }
        int neg=0;
        if(a!=nums.length){
            neg=a;
        }
        int sol=Math.max(pos,neg);
        return sol;
    }
}