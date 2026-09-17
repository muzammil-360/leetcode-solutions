class Solution {
    public int longestSubarray(int[] nums) {
        int left=0;
        int maxlen=0;
        int cntzr=0;
        for(int right=0;right<nums.length;right++){
            if(nums[right]==0)cntzr++;
            while(cntzr>1){
                if(nums[left]==0)cntzr--;
                left++;
            }
            maxlen=Math.max(maxlen,right-left+1);
        }
        return maxlen-1;
    }
}