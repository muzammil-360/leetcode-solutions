class Solution {
    public int[] searchRange(int[] nums, int target) {   
        // int f=first(nums,target);
        // if(f==nums.length || nums[f]!=target){return new int[]{-1,-1};}
        // int l=last(nums,target); 
        // return new int[]{f,l-1};

    int f=first(nums,target);
    if(f==-1){return new int[]{-1,-1};}
    int l=last(nums,target);
    return new int[]{f,l};



    }

        int first(int[] nums,int target){
        int first=-1;
        int low=0;
        int high=nums.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]==target){
                first=mid;
                high=mid-1;
            }
            else if(nums[mid]>target){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return first;
    }

        int last(int[] nums,int target){
        int last=-1;
        int low=0;
        int high=nums.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]==target){
                last=mid;
                low=mid+1;
            }
            else if(nums[mid]>target){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return last;
    }


    // int first(int[] nums,int target){
    //    int low=0;
    //    int high=nums.length-1;
    //    int ans=nums.length;
    //    while(low<=high){
    //     int mid=low+(high-low)/2;
    //     if(nums[mid]>=target){
    //         ans=mid;
    //         high=mid-1;
    //     }
    //     else{
    //         low=mid+1;
    //     }
    //    }
    //    return ans;
    // }

    //    int last(int[] nums,int target){
    //    int low=0;
    //    int high=nums.length-1;
    //    int ans=nums.length;
    //    while(low<=high){
    //     int mid=low+(high-low)/2;
    //     if(nums[mid]>target){
    //         ans=mid;
    //         high=mid-1;
    //     }
    //     else{
    //         low=mid+1;
    //     }
    //    }
    //    return ans;
    // }
 }