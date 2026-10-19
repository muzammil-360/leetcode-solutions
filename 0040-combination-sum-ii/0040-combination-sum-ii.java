class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> list=new ArrayList<>();
        solve(0,target,candidates,list,ans);
        return ans;
    }
    private void solve(int ind,int target,int[] candidates,List<Integer> list,List<List<Integer>> ans){
        //if(ind==candidates.length){
            if(target==0){
            ans.add(new ArrayList<>(list));
           //}
            return;
        }
        for(int i=ind;i<candidates.length;i++){
            if(i>ind && candidates[i]==candidates[i-1]){continue;}
            if(candidates[i]>target)break;
            list.add(candidates[i]);
            solve(i+1,target-candidates[i],candidates,list,ans);
            list.remove(list.size()-1);
           // solve(ind+1,target,candidates,list,ans);
        }
    }
}