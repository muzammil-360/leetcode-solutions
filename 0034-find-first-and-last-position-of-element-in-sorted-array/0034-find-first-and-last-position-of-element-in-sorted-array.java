class Solution {
    public int[] searchRange(int[] nums, int target) {   
        int f=first(nums,target);
        if(f==nums.length || nums[f]!=target){return new int[]{-1,-1};}
        int l=last(nums,target); 
        return new int[]{f,l-1};
    }
    int first(int[] nums,int target){
       int low=0;
       int high=nums.length-1;
       int ans=nums.length;
       while(low<=high){
        int mid=low+(high-low)/2;
        if(nums[mid]>=target){
            ans=mid;
            high=mid-1;
        }
        else{
            low=mid+1;
        }
       }
       return ans;
    }

       int last(int[] nums,int target){
       int low=0;
       int high=nums.length-1;
       int ans=nums.length;
       while(low<=high){
        int mid=low+(high-low)/2;
        if(nums[mid]>target){
            ans=mid;
            high=mid-1;
        }
        else{
            low=mid+1;
        }
       }
       return ans;
    }
}