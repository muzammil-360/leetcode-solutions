class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        int[] arr=new int[9];
        for(int i=0;i<9;i++){
            arr[i]=i+1;
        }
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> list=new ArrayList<>();
        solve(0,arr,k,n,list,ans);
        return ans;
    }
    private void solve(int ind,int[] arr,int k,int n,List<Integer> list,List<List<Integer>> ans){
            if(k==0){
            if(n==0){
            ans.add(new ArrayList<>(list));
            }
            return;
        }
        if(ind==arr.length){
            return;
        }
            list.add(arr[ind]);
            solve(ind+1,arr,k-1,n-arr[ind],list,ans);
            list.remove(list.size()-1);
            solve(ind+1,arr,k,n,list,ans);
    }
}