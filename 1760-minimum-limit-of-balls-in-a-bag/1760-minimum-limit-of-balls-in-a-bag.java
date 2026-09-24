class Solution {
    public int minimumSize(int[] nums, int maxOperations) {
        int max=-1;
        for(int num:nums){
            if(num>max)max=num;
        }
        int low=1;
        int high=max;
        while(low<=high){
            int mid=low+(high-low)/2;
            long maxop=minpanel(nums,mid);
            if(maxop>maxOperations)low=mid+1;
            else{high=mid-1;}
        }
        return low;
    }
    long minpanel(int[] nums,int k){
        long cnt=0;
        for(int num:nums){
            cnt+=((num-1)/k);
        }
        return cnt;
    }
}