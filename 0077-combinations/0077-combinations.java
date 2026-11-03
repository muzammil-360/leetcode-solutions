class Solution {
    public List<List<Integer>> combine(int n, int k) {
         int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=i+1;
        }
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> list=new ArrayList<>();
        solve(0,arr,k,n,list,ans);
        return ans;
    }
    private void solve(int ind,int[] arr,int k,int n,List<Integer> list,List<List<Integer>> ans){
            if(k==0){
            ans.add(new ArrayList<>(list));
            return;
        }
        if(ind==arr.length){
            return;
        }
            list.add(arr[ind]);
            solve(ind+1,arr,k-1,n,list,ans);
            list.remove(list.size()-1);
            solve(ind+1,arr,k,n,list,ans);
    }
}