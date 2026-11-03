class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        HashSet<List<Integer>> ans=new HashSet<>();
        solve(0,nums,ans);
        return new ArrayList<>(ans);
    }
    private void solve(int ind,int[] nums,HashSet<List<Integer>> ans){
        if(ind==nums.length){
            List<Integer> list=new ArrayList<>();
            for(int i=0;i<nums.length;i++){
                list.add(nums[i]);
            }
            ans.add(list);
            return;
        }
        for(int i=ind;i<nums.length;i++){
            swap(i,ind,nums);
            solve(ind+1,nums,ans);
            swap(i,ind,nums);
        }
    }
    private void swap(int i,int j,int[] nums){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}