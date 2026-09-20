class Solution {
    public int countCompleteSubarrays(int[] nums) {
        int cnt=0;
        HashSet<Integer> set=new HashSet<>();
        for(int num:nums){
            set.add(num);
        }
        int de=set.size();
        for(int i=0;i<nums.length;i++){
            HashSet<Integer> s=new HashSet<>();
            for(int j=i;j<nums.length;j++){
                s.add(nums[j]);
                if(s.size()==de)cnt++;
            }
            s.clear();
        }
        return cnt;
    }
}