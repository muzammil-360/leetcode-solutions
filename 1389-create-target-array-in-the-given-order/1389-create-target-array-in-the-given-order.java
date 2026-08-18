class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> ls=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            ls.add(index[i],nums[i]);
        }
        int[] ans=new int[ls.size()];
        for(int i=0;i<ls.size();i++){
            ans[i]=ls.get(i);
        }
        return ans;
    }
}