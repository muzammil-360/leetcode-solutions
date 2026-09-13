class Solution {
    public int countElements(int[] nums) {
        int maxi=Integer.MIN_VALUE;
        int mini=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>maxi)maxi=nums[i];
            if(nums[i]<mini)mini=nums[i];
        }
        int cnt=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>mini && nums[i]<maxi)cnt++;
        }
        return cnt;
    }
}