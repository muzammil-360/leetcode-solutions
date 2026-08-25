class Solution {
    public int arithmeticTriplets(int[] nums, int diff) {
        HashSet<Integer> ans=new HashSet<>();
        for(int num:nums){
            ans.add(num);
        }
        int cnt=0;
        for(int num:ans){
            if(ans.contains(num+diff) && ans.contains(num+2*diff))cnt++;
        }
        return cnt;
    }
}