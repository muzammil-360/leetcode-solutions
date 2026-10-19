class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> list=new ArrayList<>();
        solve(0,target,candidates,list,ans);
        return ans;
    }
    private void solve(int ind,int target,int[] candidates,List<Integer> list,List<List<Integer>> ans){
            if(ind==candidates.length){
            if(target==0){
            ans.add(new ArrayList<>(list));
            }
            return;
        }
        if(candidates[ind]<=target){
            list.add(candidates[ind]);
            solve(ind,target-candidates[ind],candidates,list,ans);
            list.remove(list.size()-1);
            }
            solve(ind+1,target,candidates,list,ans);
    }
}