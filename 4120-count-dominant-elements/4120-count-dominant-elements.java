class Solution {
    public int countDominantElements(int[] nums) {
        if(nums.length==1){return 1;}
        int cnt=0;
        for(int i=0;i<nums.length;i++){
            if(i==0){
                if(nums[i]>=nums[i+1]){cnt++;}
            }
            else if(i==nums.length-1){
                if(nums[i]>=nums[i-1]){cnt++;}
            }
            else{
                double avg=(nums[i-1]+nums[i+1])/2.0;
                if((double)nums[i]>=avg){cnt++;}
            }
        }
        return cnt;
    }
}