class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        // int cntp=0;
        // List<Integer> ps=new ArrayList<>();
        // for(int i=0;i<nums.length;i++){
        //     if(nums[i]<pivot)ps.add(nums[i]);
        //     else if(nums[i]==pivot)cntp++;
        // }
        // List<Integer> pg=new ArrayList<>();
        // for(int i=0;i<nums.length;i++){
        //     if(nums[i]>pivot)pg.add(nums[i]);
        // }   
        // int[] ans=new int[nums.length];
        // for(int i=0;i<ps.size();i++){
        //     ans[i]=ps.get(i);
        // }
        // for(int i=ps.size();i<(ps.size()+cntp);i++){
        //     ans[i]=pivot;
        // }
        // for(int i=ps.size()+cntp;i<(ps.size()+cntp+pg.size());i++){
        //     ans[i]=pg.get(i-(ps.size()+cntp));
        // }
        // return ans;

        int[] ans=new int[nums.length];
        int ind=0;
        for(int num:nums){
            if(num<pivot)ans[ind++]=num;
        }
        for(int num:nums){
            if(num==pivot)ans[ind++]=num;
        }
        for(int num:nums){
            if(num>pivot)ans[ind++]=num;
        }
        return ans;
    }
}