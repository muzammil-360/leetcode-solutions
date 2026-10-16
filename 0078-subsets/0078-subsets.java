class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        //List<List<Integer>> ans=new ArrayList<>();
        //int n=nums.length;
        //int subset=(int)Math.pow(2,n);
        // int subset=1<<n;
        // for(int num=0;num<subset;num++){
        //     List<Integer> temp=new ArrayList<>();
        //     for(int i=0;i<n;i++){
        //         if((num & (1<<i))!=0){temp.add(nums[i]);}
        //     }
        //     ans.add(temp);
        // }
        // return ans;
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> list=new ArrayList<>();
        solve(0,nums,list,ans);
        return ans;
    }
    private void solve(int ind,int[] nums,List<Integer> list,List<List<Integer>> ans){
        if(ind==nums.length){
            ans.add(new ArrayList<>(list));
            return ;
        }
        list.add(nums[ind]);
        solve(ind+1,nums,list,ans);
        list.remove(list.size()-1);
        solve(ind+1,nums,list,ans);
    }
}