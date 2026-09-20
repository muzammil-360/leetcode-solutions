class Solution {
    public int findFinalValue(int[] nums, int original) {
        HashSet<Integer> set=new HashSet<>();
        for(int num:nums){
            set.add(num);
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]==original){
                int m=original;
                while(set.contains(m)){
                    m=m*2;
                }
                return m;
            }
        }
        return original;
    }
}