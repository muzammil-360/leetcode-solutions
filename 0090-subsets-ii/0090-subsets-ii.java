class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        // List<List<Integer>> ans=new ArrayList<>();
        // HashSet<List<Integer>> set=new HashSet<>();
        // int n=nums.length;
        //int subset=(int)Math.pow(2,n);
        // int subset=1<<n;
        // for(int num=0;num<subset;num++){
        //     List<Integer> temp=new ArrayList<>();
        //     for(int i=0;i<n;i++){
        //         if((num & (1<<i))!=0){
        //             temp.add(nums[i]);
        //             }
        //     }
            //.
            // if(!set.contains(temp)){
            // ans.add(temp);
            // }
            // set.add(temp);
            //.
        //     if(set.add(temp)){
        //         ans.add(temp);
        //     }
        // }
        // return ans;
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> list=new ArrayList<>();
        solve(0,nums,list,ans);
        return ans;
    }
    private void solve(int ind,int[] nums,List<Integer> list,List<List<Integer>> ans){
        ans.add(new ArrayList<>(list));
        for(int i=ind;i<nums.length;i++){
            if(i>ind && nums[i]==nums[i-1]){continue;}
            list.add(nums[i]);
            solve(i+1,nums,list,ans);
            list.remove(list.size()-1);
        }
    }
}