class Solution {
    public int findPairs(int[] nums, int k) {
        Arrays.sort(nums);
        int i=0;
        int j=1;
        int ans=0;
        while(i<nums.length && j<nums.length){
            int diff=Math.abs(nums[j]-nums[i]);
            if(i==j || diff<k){j++;}
            else if(diff>k){i++;}
            else{
                ans++;
                i++;
                while(i<nums.length && nums[i-1]==nums[i]){i++;}
                j=i;
            }
            //j=i;
        }
        return ans;
    }
}