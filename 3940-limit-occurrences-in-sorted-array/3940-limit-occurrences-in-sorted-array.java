class Solution {
    public int[] limitOccurrences(int[] nums, int k) {
        List<Integer> ls=new ArrayList<>();
        int i=0;
        while(i<nums.length){
            int cnt=1;
            while(i+1<nums.length && nums[i]==nums[i+1]){
                cnt++;
                i++;
            }
            if(cnt>k){
                for(int m=0;m<k;m++){
                    ls.add(nums[i]);
                }
            }
            else{
                for(int m=0;m<cnt;m++){
                    ls.add(nums[i]);
                }
            }
            i++;
        }
        int[] ans=new int[ls.size()];
        for(int l=0;l<ls.size();l++){
            ans[l]=ls.get(l);
        }
        return ans;
    }
}